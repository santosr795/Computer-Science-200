import javax.swing.*;
public class areaSquare {

	public static void main(String[] args) {
	double sideOfSquare, areaSquare; 
	String repetetion; 
	do {
		sideOfSquare = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the side of the Square you want to find the area"));
		
		if(sideOfSquare < 0) {
			JOptionPane.showMessageDialog(null,"You cannot find the area of this Square");
		}
		else {
			areaSquare = sideOfSquare * sideOfSquare; 
			JOptionPane.showMessageDialog(null,"The area of the square is " + areaSquare);
		}
		
		repetetion = JOptionPane.showInputDialog(null, "Do you want to compute the of another Square?? yes or no");
		
	}while(repetetion.equalsIgnoreCase("Yes"));
	
	
	}//End of main 

}
