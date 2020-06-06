//Binary Search Implementation

public class BinarySearch{
	
	//Returns the index of the searched item in the array. If not, returns -1.
	public int search(int arr[],int item) {
		int N = arr.length;
		int lo=0,hi=N-1;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(arr[mid] == item) {
				return mid;
			}
			else if(item > arr[mid]) {
				lo = mid+1;
			}
			else if(item < arr[mid]) {
				hi = mid-1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38};
		int item = 6;
		int result = bs.search(arr, item);
		if(result==-1) {
			System.out.println("The item is not present in the array!");
		}
		else System.out.println("The item is found at index "  +result);
	}
}
