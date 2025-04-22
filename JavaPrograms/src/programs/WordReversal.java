package programs;

public class WordReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Java Programming";
		String words[] = s.split(" ");
		String rev = " ";
		
		for(int i = words.length-1;i>=0;i--) {
			rev= rev+ words[i]+" ";
		}
		System.out.println(rev.trim());

	}

}
