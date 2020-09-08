package SXT_java;

public class A523_equals_method { 
    public static void main(String[] args) {
        Person1 p1 = new Person1(123,"���");
        Person1 p2 = new Person1(123,"��С��");     
        System.out.println(p1==p2);     //false������ͬһ������
        System.out.println(p1.equals(p2));  //true��id��ͬ����Ϊ��������������ͬ
        String s1 = new String("��ѧ��");
        String s2 = new String("��ѧ��");
        System.out.println(s1==s2);         //false, �����ַ�������ͬһ������
        System.out.println(s1.equals(s2));  //true,  �����ַ���������ͬ
    }
}
class Person1 {
    int id;
    String name;
    public Person1(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else {
            if(obj instanceof Person1) {
                Person1 c = (Person1)obj;
                if(c.id==this.id) {
                    return true;
                }
            }
        }
        return false;
    }
}