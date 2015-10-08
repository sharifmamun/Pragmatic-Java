import java.util.Calendar;
import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args){
		Calendar date = Calendar.getInstance();
		Scanner reader = new Scanner(System.in);
		int age, retirementAge, currentYear,
			remainingYear, retirementYear;
		
		System.out.print("What is your current age? ");
		age = reader.nextInt();
		
		// Run at least once!
		// Go on, if input is valid
		// Otherwise, retry
		do {
			System.out.print("At what age you would like to retire? ");
			retirementAge = reader.nextInt();
			if (retirementAge < age)
				System.out.println(""
						+ "You entered something wrong, "
						+ "retirement age should be sometime in future!"
				);
		} while(retirementAge < age);
		
		reader.close();
		
		remainingYear = retirementAge-age;
		currentYear = date.get(Calendar.YEAR);
		retirementYear = currentYear + remainingYear;
		
		System.out.println("You have " + remainingYear + " years left until you can retire.");
		System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
	}
}
