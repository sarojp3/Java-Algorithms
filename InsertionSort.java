
public class InsertionSort {
	public int[] sort(int a[]) {
		int N = a.length;
		//Start the i pointer and move toward right.
		for(int i=0;i<N;i++) {
			//Start j pointer from same position as i and move towards left to compare and exchange.
			for(int j=i;j>0;j--) {
				if(less(a[j],a[j-1])) {
					exch(a,j,j-1);
				}
				else {
					break;
				}
			}
		}
		return a;
	}
	
	private boolean less(int a, int b) {
		return a<b;
	}
	
	private static void exch(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public static void main(String[] args) {
		int[] array = {7,10,5,3,8,4,2,9,6};
		InsertionSort is = new InsertionSort();
		int sortedArray[] = is.sort(array);
		for(int i =0; i<array.length;i++) {
			System.out.print(sortedArray[i]);
			System.out.print(" ");
		}
	}

}
