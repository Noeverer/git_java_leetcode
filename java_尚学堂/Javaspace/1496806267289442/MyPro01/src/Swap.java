public class Swap {
	public int[] reverse(int[] v, int N) {
	    int i = 0;
	    int j = N - 1;
	    while (i < j) {
	    	
	        swap(v, i, j);  // this is a self-defined function
	        i++;
	        j--;
	    }
	System.out.println(v);  // v是一个空的数组地址，数组有数组的遍历方法
	 return v;   //创建一个需要有返回值得函数，不能一开始申明为void（空）	    
	}
	
		public static void swap(int[] t , int a ,int b) {
			int tem ; //java调用前都需要声明变量的类型，并且开辟一定的空间
			tem = t[a];
			t[a] = t[b];
			t[b] = tem;
		}

		public static void main(String[] args) {
			Swap swap = new Swap();
			int[] w = {1,2,3,45,6,7};  //元组的定义
			int[] m = {};
			m = swap.reverse(w, 6);
			// 数组的遍历需要写for循环遍历
			for (int i = 0 ; i <m.length; i++) {
				System.out.println(m[i]);
			}
		}

}