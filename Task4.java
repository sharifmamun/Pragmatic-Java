import java.util.Scanner;

public class Task4 {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String 	noun,
				verb,
				adverb,
				adjective;
		
		System.out.print("Enter a noun: ");
		noun = reader.nextLine();
		System.out.print("Enter a verb: ");
		verb = reader.nextLine();
		System.out.print("Enter a adjective: ");
		adjective = reader.nextLine();
		System.out.print("Enter a adverb: ");
		adverb = reader.nextLine();
		
		System.out.println("Do you " + verb + " your " + adjective +
				" " + noun + " " + adverb + "? That's hilarious!");
		reader.close();
	}
}
