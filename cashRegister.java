import javax.swing.*;
/* Requirements Analysis (English Description)
 * Create a program that allows a user to calculate the total
 * amount due for items that a customer is purchasing at a store.
 * The program will ask the user for the price of the item and if
 * that item's price is greater than or equal to 0 that item's price
 * will be added to the total. This program will continue until the
 * user enters a negative number.  Once the user enters a negative number
 * the program will end by displaying the total.
 * 
 * Algorithm (Design)
 * Cash Register
 * 1. Ask the user for the price of the item
 * 2. Save the price of the item
 * 3. As long as the price of the item is greater than or equal to 0 go to step 4, else go to step 8
 * 4.     Add the price of item to the total
 * 5.     Ask the user for the price of the next item
 * 6.     Save the price of the next item
 * 7. Go back to step 3
 * 8. Print the total
 * 9. END
 * 
 */
import java.util.Scanner;
public class cashRegister {

	public static void main(String[] args) {
		double total = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the price of the iteam");
		double iteamPrice = keyboard.nextDouble();
	
		while(iteamPrice >= 0) {
			total = total + iteamPrice;
			System.out.println("What is the price of the next iteam");
			iteamPrice = keyboard.nextDouble();
			
		}
		System.out.println("The Total is " + total);
		/*double iteamPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"What is the price of the Iteam "));
			int numberIteam = Integer.parseInt(JOptionPane.showInputDialog(null, "Numbers of Iteams"));	
		while(iteamPrice >= 0) {
			
			System.out.println(iteamPrice);
			
			double grandTotal = 0;
			double product = iteamPrice * numberIteam;
			
			System.out.println(product);
			grandTotal = product + grandTotal; 
			System.out.println(grandTotal);
		}
		*/
	}

}
