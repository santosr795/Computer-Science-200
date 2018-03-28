import java.util.Scanner; //Import Scanner class

public class UserName{

	public static void main(String [] args){

	Scanner keyboard = new Scanner(System.in);
	String username;
	String password;
	
	System.out.println("Enter your username : ");
	username = keyboard.nextLine();
	
	System.out.println("Password: ");
	password = keyboard.nextLine();
	//System.out.println("Password: " + password);
	
	System.out.println("Hello " + username + " Welcome to CSC 200 class, and your passWord is " + password);
		}
}