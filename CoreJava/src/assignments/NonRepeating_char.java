package assignments;

public class NonRepeating_char {

	public static void main(String[] args) {
		String inputStr="Selenium";
		boolean flag =true;
		
		for(char i :inputStr.toCharArray()) {
			if(inputStr.indexOf(i)== inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+ i);
				flag =false;
				break;
			}
		}
		if(flag)
			System.out.println("There is no non-repeating character in input string");

	}

}
