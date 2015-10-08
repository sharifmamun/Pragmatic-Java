import java.util.Scanner;

public class Task5 {

	public static void main(String[] args){
		int num1, num2;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("What is the first number? ");
		num1 = Integer.parseInt(reader.nextLine());
		System.out.print("What is the first number? ");
		num2 = Integer.parseInt(reader.nextLine());
		reader.close();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
}
