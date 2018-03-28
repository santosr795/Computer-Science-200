import javax.swing.JOptionPane; 
public class Pets {

	public static void main(String[] args) {
		String name;
		int total, numberCats, numberDogs ;
		
		 name = JOptionPane.showInputDialog("Enter your name");
		 numberCats = Integer.parseInt(JOptionPane.showInputDialog(null, name + " how many dogs you own? ")); 
		 numberDogs = Integer.parseInt(JOptionPane.showInputDialog(null, name + " now do you have any cats? " ));
		 
		 total = numberCats + numberDogs; 
		 
		 JOptionPane.showMessageDialog(null, name +" has " + total + " pets."  );
		 
		
	
	}

}
