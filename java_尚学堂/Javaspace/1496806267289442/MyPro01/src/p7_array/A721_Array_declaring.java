package p7_array;

/**
 * test 
 * @author RobotLiu
 *
 */
	public class A721_Array_declaring {
		public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] str02 = new String[10];

		
		//int类型数组的创建
		for (int i=0; i < arr01.length ; i++) {
			arr01[i] = 10*i;
			System.out.println(arr01[i]);
		}
		System.out.println("###test foreach###");
		for(int m :arr01) {
			System.out.println(m);
		}
		
		
		//class类型数组的创建
		System.out.println("###test for String foreach###");
		str02[0] = "r";
		str02[1] = "o";
		str02[2] = "b";
		str02[3] = "o";
		
		str02[4] = "t";
		str02[5] = "l";
		str02[6] = "i";
		for (int i=0; i <str02.length ; i++) {
			System.out.println(str02[i]);
		}
		
	}
	
}
