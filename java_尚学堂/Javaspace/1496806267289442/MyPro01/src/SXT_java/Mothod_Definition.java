package SXT_java;

public class Mothod_Definition {
	public static void main(String[] args) {
	int num1 =10;
	int num2 =20;
	int sum = add(num1,num2);
	System.out.println("sum =" + sum);
	
}
	
	
	public static int add(int n1 , int n2)
	{
		int sum = n1 + n2;
		return sum;
	}
}
