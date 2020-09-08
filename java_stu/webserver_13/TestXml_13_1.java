package webserver_13;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class TestXml_13_1 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parse = factory.newSAXParser();
        PHandler handler = new PHandler();
        parse.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("webserver_13/person.xml"),handler);
    }


}

class PHandler extends DefaultHandler{
    @Override
    public void startDocument() throws SAXException {
        System.out.println("解析文档开始！！！");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("qname start -->"+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String contents = new String(ch,start,length).trim();
        if(contents.length() > 0){
            System.out.println("contents-->"+contents);
        }else {
            System.out.println("contents--> null");
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("qname end -->"+qName);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("解析文档结束！！！");
    }
}