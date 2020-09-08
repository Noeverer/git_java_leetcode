package SXT_java;

public class Nine_Nine_Multiplication_Table {
	public static void main(String[] args) {
		System.out.println("the Nine_NIne_multiplication is:");
		for(int i=1; i <=9; i++ ) {
			for(int j =i; j <=9; j++) {
				System.out.print(i + "*" + j  + "="  + i*j + "\t");
//				System.out.println(j + "*" + i + "=" + (i * j < 10 ? (" " + i * j) : i * j) + "  ");
				
			}
			System.out.println(); //println 表示换行的特性
			
		}
	}

}
