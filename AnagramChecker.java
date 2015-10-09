import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args){
		String firstString, secondString;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		firstString = reader.nextLine();
		System.out.print("Enter the second string: ");
		secondString = reader.nextLine();
		reader.close();
		
		if (isAnagram(firstString, secondString))
			System.out.printf("\"%s\" and \"%s\" are anagrams.\n", firstString, secondString);
		
		System.out.println("Program Terminated.");
	}
	
	/**
	 * This program checks if two strings
	 * are reverse to each other
	 * @param firstString
	 * @param secondString
	 * @return boolean
	 */
	@SuppressWarnings("unused")
	private static boolean isReverse(String firstString, String secondString){
		if (firstString.length() != secondString.length())
			return false;
		
		for(int i=0, j=firstString.length()-1; i<firstString.length(); i++,j--){
			if (firstString.charAt(i) == secondString.charAt(j))
				continue;
			else
				return false;
		}
		return true;
	}
	/**
	 * Checks equal strings
	 * are angrams are not
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	private static boolean isAnagram(String firstString, String secondString){
		if (firstString.length() != secondString.length())
			return false;
		
		char[] firstArray = firstString.toLowerCase().toCharArray(),
			   secondArray= secondString.toLowerCase().toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		for (int i=0; i< firstArray.length; i++) {
			if (firstArray[i] == secondArray[i]){
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
