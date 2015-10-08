import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		double length, width, areaInFeet, areaInMeter;
		final double conversionValue = 0.09290304;
		
		System.out.print("What is the length of the room in feet? ");
		length = reader.nextDouble();
		System.out.print("What is the width of the room in feet? ");
		width = reader.nextDouble();		
		reader.close();
		
		// Show the user what they have entered
		System.out.println("You entered dimernsions of " + length + " feet by " + width + " feet.");
		
		// Calculate area in square feet and meter
		areaInFeet = length * width;
		areaInMeter = areaInFeet * conversionValue;
		
		System.out.printf("The area is\n%.0f square feet\n%.3f square meters", areaInFeet, areaInMeter);
	}
}
