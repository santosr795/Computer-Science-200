/* Requirements Analysis (English Description)
 * Create a program that will allow a user to calculate
 * how much a customer owes for the fruits they are buying.
 * The user will be given an option to purchase apples,
 * bananas, or mangoes.  Once the user picks one of the fruits,
 * they will be asked how many of that fruit they would like to
 * purchase.  The customer will then be charged for that many
 * fruits.  The program should end by displaying the amount
 * they owe for the fruits they are purchasing.  Apples cost
 * 30 cents each.  Bananas cost 40 cents each.  Mangoes cost 50 
 * cents each.  The user may only one of these options, and if they
 * type in any other fruit they should be given an error message.
 * 
 */
import java.util.*;

public class FruitStand {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	String amountMessage ="Enter the Amount of ";
	String message, fruit;
	int amountFruits;
	do {
	System.out.println("Enter the Fruit you want to buy: Mangos, Bananas, Apples");
	 fruit = keyboard.nextLine();
	
	if(fruit.equalsIgnoreCase("Mangos")) {
		System.out.print(amountMessage + fruit + " You Want");
		amountFruits = keyboard.nextInt();
		double product = (double)amountFruits * .5;//The (double)is type cast you are basically just converting int into a double.
		message = "Your Total is " + product +  " $ for " + amountFruits + " Mangos"; 
		
	}
	else if (fruit.equalsIgnoreCase("Bananas")) {
		System.out.print(amountMessage + fruit + " You Want");
		amountFruits = keyboard.nextInt();
		double product = amountFruits * .4;
		message = "Your Total is " + product +  " $ For" + amountFruits + " Bananas"; 
	}
	else if(fruit.equalsIgnoreCase("Apples")) {
		System.out.print(amountMessage + fruit + "You Want");
		amountFruits = keyboard.nextInt();
		double product = amountFruits * .3;
		message = "Your Total is " + product +  " $ For " + amountFruits + " Apples"; 
	}
	else {
		message = "Error Fruit not Found";
	}
		
	}while(!fruit.equalsIgnoreCase("Bananas") && !fruit.equalsIgnoreCase("Apples") && !fruit.equalsIgnoreCase("Mangos") );  
System.out.print(message);
}
}