import javax.swing.JOptionPane;

public class HighJOption {

	public static void main(String[] args) {
	
		String name = JOptionPane.showInputDialog("Enter a Integer: ");
		int input = Integer.parseInt(name);
		// This converts a string into a int. it can be a different data type.
		
		//it convert the inputs from cm into a feets or inches. 
		double cmToFeet = input * 0.0328084;
		double cmToInches = input * .396701;
		System.out.println(name);
		
		//it make the calculation pop like a pop up ad.
		JOptionPane.showMessageDialog(null, input + "Cm is equal to  " + cmToFeet + "Feet");
		JOptionPane.showMessageDialog(null, input + "Cm is equal to " +  cmToInches + "Inches");
		
	}

}
