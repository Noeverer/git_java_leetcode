import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input your name:");
		String name = scan.nextLine();
		
		System.out.println("please input your hobby:");
		String favor = scan.nextLine();
		
		System.out.println("please input your age:");
		int age= scan.nextInt();
		
		System.out.println("##########");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("来到地球的天数："+age*365);
		System.out.println("");
		System.out.println("you are my sunshine");
		
	}
	
	
	
}
