package programs;

public class StringReversal {

	public static void main(String[] args) {
		
		String s = "Mounika";
		String rev = "";
		
		for(int i=s.length()-1;i>0;i--) {
			rev=rev+s;
		}
		System.out.println(rev);

	}

}
