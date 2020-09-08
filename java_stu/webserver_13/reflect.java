package webserver_13;

/*反射：它允许运行中的 Java 程序获取自身的信息，并且可以操作类或对象的内部属性。
*【感觉就像int 0 => String 0  的区别，我们如何得知里面是什么，就需要获取这些对象，进行分析type】
*推荐使用方法3，比较灵活
 * */


import java.lang.reflect.InvocationTargetException;

public class reflect {
    // reflect
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        //1 对象.getClass()
        Iphone iphone =new Iphone();
        Class clz = iphone.getClass();

        //2.类.class()
        clz = Iphone.class;

        //3.Class.forName("包名","类名")【推荐使用第三种方式】
        clz = Class.forName("webserver_13.Iphone");

        //创建对象
        Iphone iph2 = (Iphone)clz.getConstructor().newInstance();
        System.out.println(iph2);
    }

}

class Iphone{
    public Iphone(){
    }
}
