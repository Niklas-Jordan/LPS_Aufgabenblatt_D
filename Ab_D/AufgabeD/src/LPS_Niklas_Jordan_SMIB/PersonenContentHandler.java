package LPS_Niklas_Jordan_SMIB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class PersonenContentHandler implements ContentHandler {
    private ArrayList<Person> allePersonen = new ArrayList<>();
    private String currentValue;
    private Person person;

    public void characters(char[] ch, int start,  int length) throws SAXException {                                       //Aktuelle Zeichen die gelesen werden, werden in die Zwischenablage gespeichert
        currentValue = new String(ch, start, length);
    }
    public void startElement(String uri, String localname, String qName, Attributes atts) throws SAXException {           //Methode wird aufgerufen, wenn der Parser zu einem Start-Tag kommt
        if (localname.equals("person")) {                                                                                 //Neue Person erzeugen
            person = new Person();
            person.setId(Integer.parseInt(atts.getValue("id")));                                                       //Attribut id wird in einen Integer umgewandelt und dann der jeweiligen Person gesetzt
        }
    }
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (localName.equals("name")) {
            person.setName(currentValue);
        }
        if (localName.equals("vorname")) {
            person.setVorname(currentValue);
        }
        if (localName.equals("geburtsdatum")) {
            SimpleDateFormat datumsFormat = new SimpleDateFormat("dd.MM.yyyy");
            try {
                Date date = datumsFormat.parse(currentValue);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (localName.equals("postleitzahl")) {
            person.setPostleitzahl(currentValue);
        }
        if (localName.equals("ort")) {
            person.setOrt(currentValue);
        }

        if (localName.equals("person")) {                                                                                   //Person in Personenliste abspeichern, falls Person End-Tag erreicht wurde
            allePersonen.add(person);
            System.out.println(person);
        }

        if (localName.equals("lieblingsessen")) {
            person.setLieblingsessen(currentValue);
        }
        if (localName.equals("hobby")) {
            person.setHobby(currentValue);
        }
        if (localName.equals("lieblingsband")) {
            person.setLieblingsband(currentValue);
        }
    }
    public void endDocument() throws SAXException {
    }
    public void endPrefixMapping(String prefix) throws SAXException {
    }
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
    }
    public void processingInstruction(String target, String data) throws SAXException {
    }
    public void setDocumentLocator(Locator locator) {
    }
    public void skippedEntity(String name) throws SAXException {
    }
    public void startDocument() throws SAXException {
    }
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
    }
}
