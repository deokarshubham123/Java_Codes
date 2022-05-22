package assignments;

import java.util.Scanner;

public class Alpha_String {

	public static void main(String[] args) {
		String str;
		String numbers;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter String that contains numbers: ");
		str=sc.nextLine();
		
		numbers=str.replaceAll("[^0-9]", "");
		System.out.println("Numbers are: " +numbers);
	}

}
