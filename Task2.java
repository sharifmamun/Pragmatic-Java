import java.util.Scanner;

/** 
 * Takes a string as input
 * and counts the length of the input string
 * @param void
 * @return void
 */

public class Task2 {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("What is the input string? ");
		
		String input = reader.nextLine();
		reader.close();
		
		System.out.println(input + " has " + input.length() + " characters.");
	}
}