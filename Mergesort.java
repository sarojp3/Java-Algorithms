//MergeSort takes O(N*logN) time complexity and O(N) space complexity in worst possible case.(Not In-place Sorting Algorithm)

public class Mergesort {
	
	//Creating another array with same size as array a
	public int[] sort(int[] a) {
		int[] aux = new int[a.length];
		sort(a,aux,0,a.length-1);
		return a;
	}

	private int[] merge(int[] a, int[] aux, int lo, int mid, int hi) {
		//Copy the array a to another array aux
		for(int k=lo;k<=hi;k++) {
			aux[k] = a[k];
		}
		//Merging
		int i=lo , j=mid+1;
		for(int k=lo;k<=hi;k++) {
			if(i>mid) {
				a[k] = aux[j];       //We can also write a[k] = aux[j++] to reduce the lines of code. Both are same.
				j++;
			}
			else if(j>hi) {
				a[k] = aux[i++];
			}
			else if(less(aux[j], aux[i])) {
				a[k] = aux[j++];
			}
			else {
				a[k] = aux[i++]; 
			}
		}
		return a;
	}
	//Sorting two arrays recursively and merging them using merge function
	public int[] sort(int[] a, int[] aux, int lo, int hi) {
		if(hi<=lo) return a;
		int mid = lo + (hi-lo)/2;
		sort(a,aux,lo,mid);
		sort(a, aux, mid+1,hi);
		merge(a,aux,lo,mid,hi);
		return a;
	}
	
	private boolean less(int a, int b) {
		return a<b;
	}
	
	public static void main(String[] args) {
		int[] array = {1,5,9,2,6,3,4,8,7};
		Mergesort ms = new Mergesort();
		int[] sortedArray = ms.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(sortedArray[i]);
			System.out.print(" ");
		}
	}
	

}
