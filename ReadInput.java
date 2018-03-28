import java.util.Scanner; //Import Scanner class

public class ReadInput {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner (System.in);
		String name;	 
		String lastname;

		System.out.println("Hello, Enter your Name:" );
		name = keyboard.nextLine();
		System.out.println("Name: " + name);

		System.out.println("Last Name");
		lastname = keyboard.nextLine();
		System.out.println("Last Name: " + lastname);
		
	}
}