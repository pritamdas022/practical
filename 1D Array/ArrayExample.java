package Array;

public class ArrayExample {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		System.out.println(" "+maxnumber(a));
	}
		public static int maxnumber(int a[]) {
			int max=a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i]>max) {
					max=a[i];
						
				}
				
			}
			return max;
		}

	}


