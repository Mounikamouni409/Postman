package programs;

public class CharacterReplace {

	public static void main(String[] args) {
		String input = "Mounika";
		
		char chars[] = input.toCharArray();
		for(int i =0;i<chars.length;i++) {
			if(chars[i]=='o') {
				chars[i]='a';
				
			}
		}
		
		System.out.println(chars);
		
		/* String  words = "My name Mounika";
	      
	        char chars[] = words.toCharArray();
	        for(int i = 0; i<chars.length;i++){
	           if(chars[i]=='m'||chars[i]=='M') {
	             chars[i]='a';
	               
	           }
	           else if(chars[i]=='n'){
	               chars[i]='b';
	           }
	           else if(chars[i]=='a'){
	               chars[i]='c';
	           }
	        }
	        System.out.println(chars); // output is ay bcae aoubikc */
	}

}
