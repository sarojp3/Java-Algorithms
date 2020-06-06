
//Symbol Table API

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class ST<Key extends Comparable<Key>,Value> implements Iterable<Key> {
	
	private TreeMap<Key,Value> st;
	
	//Initializes an empty symbol table
	public ST() {
		st = new TreeMap<Key,Value>();
	}
	
	//Returns the value associated with the given key in this symbol table
	public Value get(Key key) {
		if (key==null) throw new IllegalArgumentException("called get() with null key");
		return st.get(key);
	}
	
	//Inserts the specified key-value pair into the symbol table, overwriting the old value with the new value
	//if the symbol table already contains the specified key.
	public void put(Key key, Value val) {
		if (key==null) throw new IllegalArgumentException("called put() with null key");
		if (val == null) st.remove(key);
		else st.put(key, val);
	}
	
	//Removes the specified key and its associated value from this symbol table(if the key is in this symbol table)
	public void delete(Key key) {
		if (key == null) throw new IllegalArgumentException("called delete() with null key");
		st.remove(key);
	}
	
	//Removes the specified key and its associated value from this symbol table(if the key is in this symbol table)
	public void remove(Key key) {
		if (key == null) throw new IllegalArgumentException("called delete() with null key");
		st.remove(key);
	}
	
	//Returns true if this symbol table contain the given key
	public boolean contains(Key key) {
		if(key==null) throw new IllegalArgumentException("called contains() with null key");
		return st.containsKey(key);
	}
	
	//Returns the number of key-value pairs in the symbol table
	public int size() {
		return st.size();
	}
	
	//Returns true if the symbol table is empty
	public boolean isEmpty() {
		return size()==0;
	}
	
	//Returns all the keys in the symbol table
	public Iterable<Key> keys(){
		return st.keySet();
	}

	@Override
	public Iterator<Key> iterator() {
		return st.keySet().iterator();
	}
	
	//Returns the smallest key in the symbol table
	public Key min() {
		if(isEmpty()) throw new NoSuchElementException("called min() with empty symbol table");
		return st.firstKey();
	}
	//Returns the largest key in the symbol table
	public Key max() {
		if(isEmpty()) throw new NoSuchElementException("called max() with empty symbol table");
		return st.lastKey();
	}
	//Returns the smallest key in the symbol table greater than or equal to
	public Key ceiling(Key key) {
		 if (key == null) throw new IllegalArgumentException("called ceiling() with null key");
	     Key k = st.ceilingKey(key);
	     if (k == null) throw new NoSuchElementException("all keys are less than " + key);
	     return k;
	}
	
	//Returns the largest key in the symbol table less than or equal to
	public Key floor(Key key) {
		if (key == null) throw new IllegalArgumentException("called floor() with null key");
	    Key k = st.floorKey(key);
	    if (k == null) throw new NoSuchElementException("all keys are greater than " + key);
	    return k;
	}
	
}
