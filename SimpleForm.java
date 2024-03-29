import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. Create & configure user interface controls
		// name label
		Label helloLabel = new Label("Enter your Name: ");
		// name textbox
		TextField nameTextBox = new TextField();
		// Button
		Button goButton = new Button();
		goButton.setText("Click Me!");

		// Add a button Click Handler
		// Button Click handler = the code you want to run
		// when person clicks on the button
		// 2. Make a layout manager
		goButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				// Logic for what should happen when you push button
					System.out.println("You Clicked Button!");
			}
		});
		VBox root = new VBox();
		root.setSpacing(10);

		// 3. Add controls to the layout manager
		root.getChildren().add(helloLabel);
		root.getChildren().add(nameTextBox);
		root.getChildren().add(goButton);

		// 4. Add layout manager to scene

		// 5. Add scene to a stage
		// both 4&5th step
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.setTitle("Example 01");

		// 6. Show the app
		primaryStage.show();

	}

}