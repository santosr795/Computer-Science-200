import java.util.*;
/* Requirements Analysis (English Description)
 * Create a program that allows a user to find the sum
 * of exactly five numbers.  The user will be asked for one number
 * at a time.  After the user enters give numbers, the program
 * should display the sum of these five numbers.
 * 
 */
public class addingNumbers {
	public static void main(String []args) {
	Scanner keyboard = new Scanner(System.in);
	double numberOne, numberTwo,total; 
	
	
	total=0;
	
	
	for( int i = 1 ; i <=5; i++){
		System.out.println("Enter the next Number");
		numberOne = keyboard.nextDouble();
		total = numberOne + total;
	}
		System.out.println(total);
	}//End Main 
	
}
