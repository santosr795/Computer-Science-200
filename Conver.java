import java.util.Scanner; 
	public class Conver{
		public static void main(String[]args){
			Scanner keyboard = new Scanner(System.in);
			int feet;
			int inches = 12;
		System.out.println("Enter feets to conver to inches:");
		feet = keyboard.nextInt();
		int product = feet * inches;
		System.out.println("Inches: " + product);
		
		
	

	}
}