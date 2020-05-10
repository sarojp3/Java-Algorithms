
public class SelectionSort {
	public int[] sort(int a[]) {
		int N = a.length;
		for(int i=0;i<N;i++) {
			int min = i;
			for(int j=i+1;j<N;j++) {
				if(less(a[j],a[min])) {
					min = j;
				}
			}
			exch(a,i,min);
		}
		return a;
	}
	
	private static boolean less(int v, int w) {
		return v<w;
	}
	
	private static void exch(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public static void main(String[] args) {
		int array[] = {1,5,9,2,6,3,4,8,7};
		SelectionSort sc = new SelectionSort();
		int sortedArray[] = sc.sort(array);
		for(int i=0; i<9;i++) {
			System.out.print(sortedArray[i]);
			System.out.print(" ");
		}	
	}
}



