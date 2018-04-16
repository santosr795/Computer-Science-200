import java.util.Scanner; 
/* Requirements Analysis (English Description)
 * Create a program that checks whether a user has entered
 * the correct password for their account.  The program will
 * ask the user to enter their password.  If the password is correct
 * tell the user they have access to their account.  If the user enters
 * an incorrect password give them a second chance to enter their password.
 * If they enter the correct password the second time tell them they have
 * access to their account otherwise tell them they have run out of chances
 * and they should contact the help desk to access their account.
 * You can assume that the real password for this user is test123.
 * 
 * Design (Algorithm)
 * 
 */
public class passWord {
	public static void main(String[]args) {
		String password;
	Scanner keyboard = new Scanner(System.in); 
	System.out.println("Password");
	 password = keyboard.next(); 
	
	if(password.equals("Test123")) {
		System.out.print("Welcome user");
		
			
		}
	else {
		System.out.println("Enter your password again ");
		String passWord = keyboard.next();
			if (passWord.equals("Test123")){
				System.out.println("welcome User");
			}
			else {
				System.out.print("You have ran out chances");
			}
	} 
	}

	

}
