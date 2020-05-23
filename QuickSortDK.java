//Dijkstra's 3-way partitioning QuickSort for Duplicate Keys. It reduces the running time from linearithmic(N*logN) to linear(N). 

public class QuickSortDK{	
	public int[] sort(int[] a, int lo, int hi) {
		if(hi<=lo) return a;
		int lt = lo, gt= hi;
	    int v = a[lo]; 
		int i = lo;
		while(i<=gt) {
			if(a[i]<v) {
				exch(a,lt++,i++);
			}
			else if(a[i]>v) {
				exch(a,gt--,i);
			}
			else{
				i++;
			}
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
		return a;
	}
	
	//Swapping Function
	private static void exch(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	//Sorting Recursively
	public int[] sort(int[] a) {
		sort(a,0,a.length-1);
		return a;
	}
	
	public static void main(String[] args) {
		int[] array = {9,7,5,10,5,6,1,5,2,5};
		QuickSortDK qs = new QuickSortDK();
	    int sortedArray[] = qs.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(sortedArray[i]+" ");
		}
	}
	
		
}
