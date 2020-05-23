
//HeapSort takes O(N*logN) time complexity and O(1) space complexity in worst-case(In-place Sorting Algorithm).

public class HeapSort {
	
	//Building a heap starting with largest value
		public int[] buildMaxHeap(int[] a, int n) {
			for(int k = n/2; k >= 1; k--) {
				sink(a,k,n);
			}
			return a;
		}
	
	//Performing sink operation on heap
	public int[] sink(int[] a, int k, int n) {
		//root node = k;
		 //left node = 2*k;
		 //right node = 2*k+1;

		while(2*k <= n) { 
			int j = 2*k;
			
			//When the left child node is less than right child node
			if(j<n && less(a,j,j+1)) {
				j++;
			}
			//When the child nodes not greater than parent node
			if(!less(a,k,j)) {
				break;
			}
			//Exchanging the greater key(root node) and child node
			exch(a,k,j);
			k = j;
		}
		return a;
	}
	
	//Sorting the heap
	public int[] sort(int[] a) {
		int n = a.length-1;
		buildMaxHeap(a,n);
		while(n>1) {
			sink(a,1,n);
			exch(a,1,n--);
		}
		return a;
	}
	
	public boolean less(int[] a, int v, int w) {
		return a[v]<a[w];
	}
	
	//Exchanging
	public static void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr =  {1, 2, 3, 6, 9, 5, 10, 4, 11,13, 14, 15, 16, 17, 18, 19, 20};
		HeapSort hs = new HeapSort();
		int sorted[] = hs.sort(arr);
		for(int i =1;i<arr.length;++i) {
			System.out.print(sorted[i] + " ");
		}
		
	}
}
