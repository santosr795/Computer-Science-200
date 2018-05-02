import java.util.*;
/* Requirements Analysis (English Description)
 * Create a program that allows a professor to enter the names
 * and the final exam scores of their students from one class.  
 * The program should display the name and the score of teh student
 * who scored the highest on the final exam.  Ignore any students
 * whose score is less than 0 or greater than 100.  There are only
 * 4 students in this class.    
 * 
 */
public class highestScore {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		double score, highScore;
		highScore  = -1;
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Enter the Name of the Student ");
			name = keyboard.next();
			
			System.out.println("Enter Student Score ");
			score = keyboard.nextDouble();
			
			if (score > 100 || score < 0) {
				System.out.println("Error");
			}
			else {
				if(score >= highScore) {
					highScore = score;
					System.out.println(name + " has the highest Score " + highScore );
					
				
									}
			}
				
		}
		

	}

}
