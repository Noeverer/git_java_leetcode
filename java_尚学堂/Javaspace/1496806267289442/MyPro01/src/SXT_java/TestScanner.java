package SXT_java;
import java.util.Scanner;


public class TestScanner {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("please input your name");
		String  name = scanner.nextLine();
		
		System.out.println("please input your age");
		int age = scanner.nextInt();
		
		System.out.println("please input you favourite");
		String  favourite = scanner.nextLine();
		
		
		
		System.out.println("##############");
		System.out.println(name);
		System.out.println(age);
		System.out.println(favourite);
		System.out.println("come to earth" + age * 365);
		System.out.println("leave to earth" + (72-age)*365);
	}
	

}
