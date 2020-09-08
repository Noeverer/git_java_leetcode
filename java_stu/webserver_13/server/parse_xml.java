package webserver_13.server;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*总结：感觉就是如何对xml文件进行格式化处理
* 学习到如何构造类，已经解析xml的流程
*
*
* */


public class parse_xml {
    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parse = factory.newSAXParser();
        WebHandler handler = new WebHandler();
        parse.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("webserver_13/server/web.xml"),handler);

        //解析文档调用到接口
        WebContext context = new WebContext(handler.getEntitys(),handler.getMappings());  //传入到其他工具进行处理
        String className = context.getClz("/g");
        Class clz = Class.forName(className);
        Servlet servlet = (Servlet)clz.getConstructor().newInstance();
        System.out.println("用过String类型反射到某一个类，这种想法是真滴强，比如我输url，返回对应类所操作："+servlet);
        servlet.service();

        //解析文档的格式获取打印
        List<Entity> entitys = handler.getEntitys();
        List<Mapping> mappings = handler.getMappings();
//        System.out.println(entitys.size()+"--->");
//        System.out.println(mappings.size()+"--->");
        for (Entity e: entitys){
            System.out.println("name-->"+e.getName()+",class-->"+e.getCls());
        }
        for (Mapping m: mappings){
            System.out.println("name-->"+m.getName()+",pattern-->"+m.getPatterns());
        }

    }
}

class WebHandler extends DefaultHandler{
    private List<Entity> entitys = new ArrayList<Entity>();
    private List<Mapping> mappings =new ArrayList<Mapping>();

    private Entity entity;
    private Mapping mapping;

    private String tag;
    private boolean isMapping = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName!=null){
            tag = qName;
            if (tag.equals("servlet")){
                entity = new Entity(null,null);
                isMapping = false;
            }else if (tag.equals("servlet-mapping")){
                mapping = new Mapping();
                isMapping = true;
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String contents = new String(ch,start,length).trim();
        if (tag!=null){
            if (isMapping){
                if (tag.equals("servlet-name")){
                    mapping.setName(contents);
                }else if (tag.equals("url-pattern")){
                    mapping.addPattern(contents);
                }
            }else {
                if (tag.equals("servlet-name")){
                    entity.setName(contents);
                }else if (tag.equals("servlet-class")){
                    entity.setCls(contents);
                }
            }
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if (qName!=null){
            if (qName.equals("servlet")){
                entitys.add(entity);
            }else if (qName.equals("servlet-mapping")){
                mappings.add(mapping);
            }
        }
        tag = null;
    }

    public List<Entity> getEntitys() {
        return entitys;
    }

    public void setEntitys(List<Entity> entitys) {
        this.entitys = entitys;
    }

    public List<Mapping> getMappings() {
        return mappings;
    }

    public void setMappings(List<Mapping> mappings) {
        this.mappings = mappings;
    }

}