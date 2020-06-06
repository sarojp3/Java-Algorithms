
//Reading a sequence of strings from standard input and print out one that occurs with highest frequency 

public class FrequencyCounter {
	
	public static void main(String[] args) {
		
		//Creating a Symbol Table
		ST<String,Integer> st = new ST<String,Integer>();
		
		//Reading the string and updating the frequency
		while(!StdIn.isEmpty()) {
			String word = StdIn.readString();
			if(!st.contains(word)) st.put(word, 1);
			else st.put(word, st.get(word)+1);	
		}
		
		//Printing the string with maximum frequency
		String max = "";
		st.put(max, 0);
		for(String word:st.keys()) {
			if(st.get(word)>st.get(max)) {
				max = word;
			}
		}
		System.out.print(max + " " + st.get(max));
		
	}
}
