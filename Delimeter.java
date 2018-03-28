import java.util.Scanner;

public class Delimiter{
	public static void main(String []args){
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDeliieter(",");
		
		System.out.println("Enter 3 numbers separeta with a ,");
		int firstNum = keyboard.nextInt(); //Take is first number
		int secondNum = keyboard.nextInt();// This is just a number
		int thridNum = keyboard.nextInt();

	System.out.println(firstNum);
	System.out.println(secondNum);
	System.out.println(thridNum);
	}	
}