package Array;

public class MultidimentionArray {

	public static void main(String[] args) {
//		creating 2d array 
		int a[][]= {{1,2},{1,5},{8,5}};
		for (int i = 0; i < 3; i++) {// Traversing outer loop(row) 
			for (int j = 0; j < 2; j++) {// traversing inner loop(column)
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
