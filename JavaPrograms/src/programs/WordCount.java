package programs;

public class WordCount {
	public static void main(String[] args) {
		
		String  ani = "cat dog";
		
		int count =0;
		
		for(int i =1; i<ani.length(); i++) {
			
			count+=i;
			
		}
		System.out.println(count);
	}

}
