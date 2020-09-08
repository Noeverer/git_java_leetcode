package webserver_13;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Testxml2_13_1 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parse = factory.newSAXParser();
        PersonHandler handler = new PersonHandler();
        parse.parse(Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResourceAsStream("webserver_13/person.xml")),handler);

        List<Person> persons = handler.getPersons();
        System.out.println(persons.size()+"--->");
        for (Person p: persons){
            System.out.println("name-->"+p.getName()+",age-->"+p.getAge());
        }
    }


}

class PersonHandler extends DefaultHandler{
    private List<Person> persons ;
    private Person person;
    private String tag;

    @Override
    public void startDocument() throws SAXException {
        persons = new ArrayList<Person>();
        System.out.println("解析文档开始！！！");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("qname start -->"+qName);
        if (qName!=null){
            tag = qName;
            if(tag.equals("person")){
                person = new Person(null,0);
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String contents = new String(ch,start,length).trim();
        if (tag!=null){
            if (tag.equals("name")){
                person.setName(contents);
            }else if (tag.equals("age")){
                if (contents.length()>0){
                    person.setAge(Integer.parseInt(contents));
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("qname end -->"+qName);
        if (qName!=null){
            if (qName.equals("person")){
                persons.add(person);
            }
            tag = null;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("解析文档结束！！！");

    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}