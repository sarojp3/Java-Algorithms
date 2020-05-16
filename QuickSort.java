import java.util.Random;

public class QuickSort {
	
	private int partition(int[] a, int lo, int hi) {
		int i=lo, j=hi+1;
		while(true) {
			//Finding items on left to swap
			while(less(a[++i],a[lo])) {
				if(i==hi) break;
			}
			//Finding items on right to swap
			while(less(a[lo], a[--j])) {
				if(j==lo) break;
			}
			if(i>=j) break; //Checking if pointers i and j cross 
			exch(a,i,j);    //Swapping
		}
		exch(a,lo,j);      //Swapping items with partitioning item
		return j;          //Returning the index of the item now know to be in place(i.e. mid item)
	}
	//Comparing Function
	public boolean less(int v, int w) {
		return v<w;
	}
	
	//Swapping Function
	private static void exch(int[] a, int i, int j) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	//Sorting Recursively
	public int[] sort(int[] a) {
		shuffleArray(a);
		sort(a,0,a.length-1);
		return a;
	}
	
	private int[] sort(int[] a, int lo, int hi) {
		if(hi<=lo) return a;
		int j = partition(a, lo, hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
		return a;
	}
	
	//Shuffling the array for performance guarantee
	public static void shuffleArray(int[] b) {
		Random rnd = new Random();
		for (int i = b.length - 1; i > 0; i--)
		  {
		    int index = rnd.nextInt(i + 1);
		    int temp = b[index];
		    b[index] = b[i];
		    b[i] = temp;
		  }
	}
	
	public static void main(String[] args) {
		int[] array = {7,10,5,3,8,4,2,9,6};
		QuickSort qs = new QuickSort();
		int sortedArray[] = qs.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(sortedArray[i]);
			System.out.print(" ");
		}
	}
	

}
