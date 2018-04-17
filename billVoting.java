import java.util.Scanner; 
import javax.swing.JOptionPane;
/*Program Analysis
 *This program will go throught many IF/Else Statements going throught many simulating the ways the bill can be become a law.
 The program will end only if the goes throught the entire program without any false statement,
 the program will also end with it hits false Statement. THe program will first ask The user enter the amount of votes in the House 
 if Representatives, if more than 251 votes the proram will continue to the next state, if its less than it will end. The program
 will continue to the Senate where it will ask the user for the amount of votes for the bill, if is more than 51 the program will
 continue running or else will stop. This Will next will got to the Excutive branch where is only to posible input "Veto" and "Pass".
 if pass the program will end. If Veto the program will loop back to the House of Represetive, whre the program will only if there is
 input of 290 more votes. Finally the program Will go to the senate asking for an intup more than 67 votes. Every time the program
 it will either inform the user that the bill has either become a law or it has fail. 
 * ?*/

public class billVoting{
	public static void main(String []args){
	String message;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter the amount of votes for yes in the bill in the House of Representative ");
	int houseVote = keyboard.nextInt();

if(houseVote >= 251){
 System.out.println( "The Bill has pass The House of Representative ");

 System.out.println("Enter the vote for yes in the Senate");
 int senateVote = keyboard.nextInt(); 

 	if (senateVote >= 51){
	System.out.println( "The bill has pass the Senate"); 

	System.out.println("Now the president has either Pass or Veto the bill");
	String excutive = keyboard.next(); 
		if (excutive.equalsIgnoreCase("Pass")){

			 message = "The bill has become a law"; 
		}//End 3rd IF 
			else{
		System.out.println("The bill has gone back to the The Congress to have to over write the president Veto. Vote again for the bill"); 
		int houseSecondVote = keyboard.nextInt();

		 	if(houseSecondVote >= 290){
		 	System.out.println("The vote has pass The House of Represative now it moves on to the Senate. \n Senate will now vote again.");
			int senateSecondVote = keyboard.nextInt();

				if(senateSecondVote >= 67) {
				message = "The bill has become a law";
					}
				else {
				System.out.println("The bill has complete fail to become a law");
					}			
		 }

		 else{
		 System.out.println( "The bill has die in the House");
		 }
		}//End 3rd Else
			}//End second IF
			
	

	}//End first IF

else {
	System.out.println("The bill has fail to pass");
}//End first else 



//JOptionPane.showMessageDialog(null, message);
	
	}//End Main
}//end of class 

