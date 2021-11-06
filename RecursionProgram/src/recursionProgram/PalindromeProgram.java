/* Alexis Olivo-Alvarez

INEW-2338 2801

6 NOV 2021

Write a recursive method to test if a string is a palindrome */

package recursionProgram;

import java.util.Scanner; // for input

public class PalindromeProgram {
	
	public static boolean palindromeTester(String p, int i, int j) { //takes string, index for front char, and index for back char
		
		if (i == j) { // BASE CASE: if i and j are equal, then all letters of the palindrome have been tried, indicating it is a palindrome
			return true;
		}
		
		if (p.charAt(i) == p.charAt(j)) { //if character at front and back match, adjust index and try next characters
			
			return palindromeTester(p, i + 1, j- 1);
		}
		
		return false; //if characters dont match or base case isnt reached, return false
	}

	public static void main(String[] args) {
		
		//initialization
		Scanner input = new Scanner(System.in); //scanner input
		String palindrome; //palindrome string
		 boolean isPalindrome; //palindrome bool
		 int fIndex = 0; //front index
		 int bIndex; //back index
		 
		 //getting palindrome
		 System.out.println("Please enter the phrase you would like to test: ");
		 palindrome = input.nextLine();
		 bIndex = palindrome.length() - 1;
		 
		 //calling method
		 isPalindrome = palindromeTester(palindrome, fIndex, bIndex);
		 
		 //displaying results
		 if (isPalindrome) {
			 System.out.println("\n Your sentence is a palindrome.");
		 }
		 else {
			 System.out.println("\n Your sentence is not a palindrome.");
		 }
	}

}
