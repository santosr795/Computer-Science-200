import java.util.Scanner;
public class Operation {
	
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(",")
		double  firstNum, secondNum;
		boolean next; 
		
	
	System.out.println("Enter first Number: ");
	firstNum = keyboard.nextDouble();
	
	System.out.println("Enter second Number: ");
	secondNum = keyboard.nextDouble();

	System.out.println("First Number: " + firstNum);
	System.out.println("Second Number: " + secondNum);

	System.out.println(firstNum >= secondNum);
	System.out.println(secondNum == firstNum);
	
	System.out.println("Do you want to continue" );
	con = keyboard.Boolean();
	

		}
	}