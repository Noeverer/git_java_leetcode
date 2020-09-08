
public class findDiagonalorder {
	public int[] findDiagonalOrder(int[][] matrix) {
	    if (matrix == null || matrix.length == 0) {
	        return new int[]{};
	    }
	    int r = 0, c = 0;
	    int row = matrix.length, col = matrix[0].length;
	    int[] res = new int[row * col];
	    for (int i = 0; i < res.length; i++) {
	        res[i] = matrix[r][c];
	        // r + c ��Ϊ�����Ĳ�����ż�����ϱ������������±���
	        if ((r + c) % 2 == 0) {
	            if (c == col - 1) {
	                // �����ƶ�һ��׼�����±���
	                r++;
	            } else if (r == 0) {
	                // �����ƶ�һ��׼�����±���
	                c++;
	            } else {
	                // �����ƶ�
	                r--;
	                c++;
	            }
	        } 
	        else {
	            if (r == row - 1) {
	                // �����ƶ�һ��׼�����ϱ���
	                c++;
	            } else if (c == 0) {
	                // �����ƶ�һ��׼�����ϱ���
	                r++;
	            } else {
	                // �����ƶ�
	                r++;
	                c--;
	            }
	        }
	    }
	    return res;
	}
}
