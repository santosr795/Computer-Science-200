import java.util.Scanner;
import javax.swing.JOptionPane;


public class Gui {
	public static void main (String [] args){
	
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String: "); 
		String stringInput = scan.next();
		
		System.out.print("Enter an integer: "); 
		int intInput = scan.nextInt();
		
		System.out.print("Enter a byte: ");
		byte byteInput = scan.nextByte();

		System.out.print("Enter a short: ");
		short shortInput = scan.nextShort();
		
		System.out.print("Enter a long");
		long longInput  = scan.nextLong();
		
		System.out.print("Enter a float: ");
		float floatInput = scan.nextFloat();
		
		System.out.print("Enter a double: ");
		double doubleInput = scan.nextDouble();
		
		System.out.print("Enter a char: ");
		char charInput = scan.next().charAt(0);
		
		System.out.print("Enter a True or False");
		boolean booInput = scan.nextBoolean();		
		
		JOptionPane.showMessageDialog(null, "String entered is " + stringInput);
		JOptionPane.showMessageDialog(null, "int entered is " + intInput);
		JOptionPane.showMessageDialog(null, "byte entered is " + byteInput);
		JOptionPane.showMessageDialog(null, "short entered is " + shortInput);
		JOptionPane.showMessageDialog(null, "long entered is " + longInput);
		JOptionPane.showMessageDialog(null, "float entered is " + floatInput);
		JOptionPane.showMessageDialog(null, "double entered is " + doubleInput);
		JOptionPane.showMessageDialog(null, "char entered is " + charInput);
		JOptionPane.showMessageDialog(null, "bootlean entered is " + booInput);


	}

}