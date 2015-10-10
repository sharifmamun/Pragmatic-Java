import java.util.Random;
import java.util.Scanner;

public class Magic8BallTask33 {

	@SuppressWarnings("unused")
	private static Random randNum = new Random(System.currentTimeMillis());
	
	private static int randomNumberGenerator(int max) {
		return (int)(Math.random() * (max));
	}
	
	public static void main(String[] args) {
		String options[] = {"Yes", "No", "May be", "Ask again later"};
		
		Scanner reader = new Scanner(System.in);		
		System.out.print("What's your question? ");
		reader.nextLine();
		reader.close();
		
		System.out.print(options[randomNumberGenerator(options.length)]);
	}
}
