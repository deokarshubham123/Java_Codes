package assignments;

public class CharToString {

	public static void main(String[] args) {
		char ch ='a';
		String st = Character.toString(ch);
		System.out.println("The string is: "+ st);
		
		String str="Hello";
		for(int i=0; i<str.length(); i++) {
			char ch1 = str.charAt(i);
			System.out.println("character: "+ch1);
		}

	}

}
