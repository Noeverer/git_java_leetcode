package SXT_java;

public class If_else_structure {
	public static void main(String[] agrs){
		double r = 4 * Math.random();
		double area = Math.PI *Math.pow(r,2);
		double circle = 2 * Math.PI *r;
		System.out.println("circle is :" + r);
		System.out.println("the measure of area:" + area);
		System.out.println("perimeter :" + circle);
		if (area >= circle) {
			System.out.println("area is bigger than circle");
		}
		else {
			System.out.println("the answer is contrary");
		}
	}
	
	
}
