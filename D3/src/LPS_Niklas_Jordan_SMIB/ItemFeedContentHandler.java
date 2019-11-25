package LPS_Niklas_Jordan_SMIB;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

public class ItemFeedContentHandler implements ContentHandler {


    //Grundaufbau übernommen von http://blog.mynotiz.de/programmieren/java-sax-parser-tutorial-773/ aus der Vorlesung
    private String currentValue;
    private ItemFeed feed = null;

    public void characters(char[] ch, int start, int length) {

        currentValue = new String(ch, start, length);
    }
    public void startElement(String uri, String localName, String qName, Attributes atts) {
        if (localName.equals("item")) {
            feed = new ItemFeed();
        }
    }
    public void endElement(String uri, String localName, String qName) {
        if (feed != null) {
            if (localName.equals("link")) {
                feed.setLink(currentValue);
            }

            if (localName.equals("title")) {
                feed.setTitle(currentValue);
            }

            if (localName.equals("description")) {
                feed.setDescription(currentValue);
            }

            if (localName.equals("channel")) {
                feed.setDescription(currentValue);
            }

            if (localName.equals("rss")) {
                feed.setDescription(currentValue);
            }

            if (localName.equals("language")) {
                feed.setDescription(currentValue);
            }

            if (localName.equals("copyright")) {
                feed.setDescription(currentValue);
            }
            if (localName.equals("item")) {
                System.out.println(feed.getTitle());
                feed = null;
            }
        }
    }

    public void endDocument(){
    }
    public void endPrefixMapping(String prefix){
    }
    public void ignorableWhitespace(char[] ch, int start, int length){
    }
    public void processingInstruction(String target, String data){
    }
    public void setDocumentLocator(Locator locator) {
    }
    public void skippedEntity(String name) {
    }
    public void startDocument() {
    }
    public void startPrefixMapping(String prefix, String uri){
    }
}