package SXT_java;

class Test {
	String name;
	int age;
//	public String toString() {
//		return (getClass().getName() + "@" + Integer.toHexString(hashCode()));
//		
//	}  //��ʵû������Ϊʲô���ص�ֵ����
	
//	@Override
	public String toString() {
		return name + " , age:" + age ;
	}
}

public class A522_toString_override{
	public static void main(String[] args) {
		Test p = new Test();
		p.age = 26;
		p.name = "jimliu";
		System.out.println("info :" + p);
		
		A522_toString_override t = new A522_toString_override();
		System.out.println(t);
		
		
	}
}
