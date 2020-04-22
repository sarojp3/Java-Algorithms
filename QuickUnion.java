
public class QuickUnion {
	private int[] id;
	public QuickUnion(int N) {
		id = new int[N];
		for(int i=0; i<N;i++) {
			id[i] = i;
		}
	}
	public int root(int p) {
		while(id[p]!=p) {
			p = id[p];
		}
		return p;
	}
	
	public void union(int p, int q) {
		id[root(p)]= root(q);
	}
	
	public static void main(String[] args) {
		QuickUnion q = new QuickUnion(10);
		q.union(5, 2);
		q.union(3,9);
		q.union(0,8);
		q.union(7,4);
		for(int i=0;i<10;i++) {
			System.out.print(q.id[i] + " ");
		}
	}

}
