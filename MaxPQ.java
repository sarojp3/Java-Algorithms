
//Java Implementation of Maximum Priority Queues(Binary Heaps).

public class MaxPQ<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N;
	
	@SuppressWarnings("unchecked")
	public MaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity+1];  //Fixed Capacity for Simplicity.
		                                        //In Binary heaps, index starts from 1, so the the capacity is increased with a unit.
	}
	
	//Checking if the array is empty or not
	public boolean isEmpty() {
		return N==0;
	}
	
	//Insertion operation in a heap.(Add the node at the end and swim it up)
	public void insert(Key key) {
		pq[++N] = key;
		swim(N);
	}
	
	//Operation to delete maximum in a heap.(Exchange the root node with end node and then sink it down)
	public Key delMax() {
		Key max = pq[1];
		exch(1,N--);
		sink(1);
		pq[N+1] = null;
		return max;
	}
	
	//Swim Operation in a heap
	 private void swim(int k) {
		 while(k>1 && less(k/2,k)) {
			 exch(k,k/2);
			 k=k/2;
		 }
	 }
	 
	 //Sink Operation in a heap
	 private void sink(int k) {
		 //root node = k;
		 //left node = 2*k;
		 //right node = 2*k+1;
		 while(2*k<=N) {
			 int j = 2*k;
			 //When the left node is less than the right node
			 if(k<N && less(j,j+1)) {
				 j++;
			 }
			 //When the child nodes is not greater than root node
			 if(!less(k,j)) {
				 break;
			 }
			 //Exchanging the root node(greater) and child node
			 exch(k,j);
			 k=j;
		 }
	 }
	 
	 private boolean less(int i, int j) {
		 return pq[i].compareTo(pq[j]) <0 ;
	 }
	 private void exch(int i, int j) {
		 Key t= pq[i];
		 pq[i] = pq[j];
		 pq[j] = t;
	 }

}
