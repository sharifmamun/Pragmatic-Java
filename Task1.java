import java.util.Scanner;

public class Task1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader;
		String name;
		try { 
			reader = new Scanner(System.in);
			System.out.print("What is your name? ");
			name = reader.nextLine();

			if (name != null && name.length()!=0)
				System.out.println("Hello, "+name+", nice to meet you!");
		} finally {
			System.out.println("Program is Terminated");
		}
	}
}
