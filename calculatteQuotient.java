import java.util.*; 
import javax.swing.JOptionPane;
/* Requirements Anaylsis (English Description)
 * Create a program that allows a user to divide one number
 * by another number.  The program should ask the user for the numerator.
 * Then the program should ask the user for the denominator.  If the denominator
 * is equal to 0, the user should be given an error message and asked to enter
 * another denominator.  The user will continue to be asked for a denominator
 * as long as they keep entering 0.  Once a user enters a value other than 0
 * for the denominator, the program should calculate the quotient and display it 
 * to the screen.
 * 
 * Design (Algorithm)
 * Calculate Quotient
 * 1. Ask the user for the numerator
 * 2. Save the numerator
 * 3. Ask the user for the denominator
 * 4. Save the denominator
 * 5. If denominator is equal to 0 go to step 6, else go to step 7
 * 6.      Print error message
 * 7. Go back to step 3 if denominator is equal to 0, else go to step 8
 * 8. Calculate quotient
 * 9. Print quotient
 * 10. END  
 *
 * 
 */
public class calculatteQuotient {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		double numerator, denominator, total ; 
		
		do {
			System.out.println("Enter first that Number You Want to divide");
			numerator = keyBoard.nextDouble();
			System.out.println("Enter the Second Number");
			denominator = keyBoard.nextDouble();
				if(denominator == 0) {
				System.out.println("You cannot divide by zero");
				}
		}while(denominator == 0);

	total = numerator/denominator;
		
		System.out.print("The Quotient is "+total);
	}//End Main

}
