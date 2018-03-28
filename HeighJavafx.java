import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HeighJavafx extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) 
	
	{
		// Scene title
		primaryStage.setTitle("CM TO FEET");

		// it creates the grid pane for the scene
		GridPane grid = new GridPane();

		// The demetion of the scene
		Scene myScene = new Scene(grid, 400, 400);

		// Setting the Scene in the Stage
		primaryStage.setScene(myScene);

		// The instructions
		// Create all the varivals first and then operate with them
		Label instructionlb = new Label("Enter the height in centmeter ");
		Label heightlb = new Label("Height ");

		// a text box to where we can write/type
		TextField heighTxt = new TextField();

		// Creating a button
		Button calculatorBt = new Button("Calculate ");

		calculatorBt.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// heightTxt.getText();
				int height = Integer.parseInt(heighTxt.getText());

				//
				System.out.println(height);
				primaryStage.setScene(resultScene(primaryStage, height));
				System.out.println("Button Works");
			}

		});

					// this will make things to appear when it runs
					grid.add(instructionlb, 0, 0);
					grid.add(heightlb, 0, 1);
					grid.add(heighTxt, 1, 1);
					// button is instructions
					grid.add(calculatorBt, 0, 2);
			
					// it shows the stage
					primaryStage.show();
	}

	Scene resultScene(Stage primaryStage, int input) {
		GridPane grid = new GridPane();
		
		double cmToFeet = input * 0.0328084;// calculate from cm to feets
		double cmToInches = input * 0.396701;// calculate from centimeter to inches
		
		//it will print out the result of the "inputs" and the convertion. 
		Label cmToFeetLb	= new Label(input + " cm is" + " feet is " + cmToFeet);
		Label cmToInchesLb = new Label(input + " cm is " + " feet is " + cmToInches);
		
		grid.add(cmToFeetLb, 0, 0);
		grid.add(cmToInchesLb, 0, 3);
		
		Scene myScene = new Scene(grid, 300, 300);
		return myScene;
		
		
	}
	
}