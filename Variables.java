import java.util.Scanner;
/*
 * Requirement Analysis 
 * Creates a program that allows users find the sum of tow numbers,
 * The program will ask the user for the first number and store. Then the progrom will ask for 
 * another number and the program will find the sum of number one and number two. 
 * Finally the program will show the sum of the two numbers.
 * 
 * Design (algorithm) 
 * add Two Numbers
 * 1. ask the user for the first name 
 * 2. ask save the first Number 
 * ask the sure for the second number
 * 4. save the second number
 * 5. Calculate the sum 
 *6. Print the sum
 * 7. END
 */
public class Variables {
	public static void main(String []args) {
		
	Scanner keyboard = new Scanner(System.in); 
	
	System.out.print("Enter the first number"); 
	int firstNum = keyboard.nextInt();
	
	System.out.print("Enter the second number");
	int secondNum = keyboard.nextInt();
	
	int sum = firstNum + secondNum; 
	System.out.print("The sum is " + sum);
	
		
	}
}
