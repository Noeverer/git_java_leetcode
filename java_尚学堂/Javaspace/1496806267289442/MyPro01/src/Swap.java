public class Swap {
	public int[] reverse(int[] v, int N) {
	    int i = 0;
	    int j = N - 1;
	    while (i < j) {
	    	
	        swap(v, i, j);  // this is a self-defined function
	        i++;
	        j--;
	    }
	System.out.println(v);  // v��һ���յ������ַ������������ı�������
	 return v;   //����һ����Ҫ�з���ֵ�ú���������һ��ʼ����Ϊvoid���գ�	    
	}
	
		public static void swap(int[] t , int a ,int b) {
			int tem ; //java����ǰ����Ҫ�������������ͣ����ҿ���һ���Ŀռ�
			tem = t[a];
			t[a] = t[b];
			t[b] = tem;
		}

		public static void main(String[] args) {
			Swap swap = new Swap();
			int[] w = {1,2,3,45,6,7};  //Ԫ��Ķ���
			int[] m = {};
			m = swap.reverse(w, 6);
			// ����ı�����Ҫдforѭ������
			for (int i = 0 ; i <m.length; i++) {
				System.out.println(m[i]);
			}
		}

}