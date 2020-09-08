package SXT_java;

public class TestIdentifer {
	public static void main(String[] args) {
//		int a123 = 1;
//		int 123abc = 2;
//		System.out.println(a123);
//		int $a = 3;
//		System.out.println($a);
		int a = 3;
		int b = a++;   //执行完后,b=3。先给b赋值，再自增。
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;   //执行完后,c=5。a先自增，再给c赋值
		System.out.println("a="+a+"\nb="+b);
		
		
	}

}

