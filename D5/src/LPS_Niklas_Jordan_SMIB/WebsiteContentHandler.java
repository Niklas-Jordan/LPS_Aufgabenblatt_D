package LPS_Niklas_Jordan_SMIB;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In Zusammenarbeit mit Florian Eimann
 * The type Website content handler.
 * überprüft ob Username, IP, timestamps und Contributor gegeben sind
 *
 */
public class WebsiteContentHandler implements ContentHandler {

    private String currentValue;
    private Website website = null;
    private WebsiteDaten websiteDaten = null;
    private WebsiteUserData websiteUserData = null;

    public void characters(char[] ch, int start, int length) {
        currentValue = new String(ch, start, length);
    }

    public void startElement(String uri, String localname, String qName, Attributes atts) {
        switch (localname) {
            case "page":
                website = new Website();
                break;
            case "revision":
                websiteDaten = new WebsiteDaten();
                break;
            case "contributor":
                websiteUserData = new WebsiteUserData();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if (websiteUserData != null) {
            switch (localName) {
                case "ip":
                    websiteUserData.setIp(currentValue);
                    break;
                case "username":
                    websiteUserData.setUsername(currentValue);
                    break;
                case "contributor":
                    websiteDaten.setContributor(websiteUserData);
                    websiteUserData = null;
                    break;
            }
        } else if (websiteDaten != null) {
            switch (localName) {
                case "timestamp":
                    SimpleDateFormat datum = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                    try {
                        Date date = datum.parse(currentValue);
                        websiteDaten.setTimestamp(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case "revision":
                    website.setNeusteWebsiteDaten(websiteDaten);
                    websiteDaten = null;
                    break;
            }
        } else if (website != null) {
            switch (localName) {
                case "title":
                    website.setTitel(currentValue);
                    break;
            }
        }
    }

    /**
     * Gets website.
     * überprüft, ob eine URL gegeben ist und greift auf diese zu
     * wenn keine URL gegeben ist, wiedergabe der Fehlermeldung
     * @return the website
     * @throws Exception the exception
     */
    public Website getWebsite() throws Exception {
        if (website == null) {
            throw new Exception("Website nicht gefunden");
        }
        return website;
    }

    public void endDocument() {
    }

    public void endPrefixMapping(String prefix) {
    }

    public void ignorableWhitespace(char[] ch, int start, int length) {
    }

    public void processingInstruction(String target, String data) {
    }

    public void setDocumentLocator(Locator locator) {
    }

    public void skippedEntity(String name) {
    }

    public void startDocument() {
    }

    public void startPrefixMapping(String prefix, String uri) {
    }
}
