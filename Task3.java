import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("What is the quote? ");
		String quote = reader.nextLine();
		System.out.print("Who said it? ");
		String quoter = reader.nextLine();
		
		System.out.println(quoter + " says, \"" + quote + "\"");
		reader.close();
	}
}
