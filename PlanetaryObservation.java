package packageOne;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PlanetaryObservation extends Application {
  @Override 
  public void start(Stage primaryStage) {
    GridPane basePane = new GridPane();
    basePane.setAlignment(Pos.CENTER);
    basePane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    basePane.setHgap(5.5);
    basePane.setVgap(5.5);
    
    
    
    // Create a scene and place it in the stage
    Scene mainScene = new Scene(basePane,500,450);
    primaryStage.setResizable(false);
    primaryStage.setAlwaysOnTop(true);
    primaryStage.setTitle("Planetary Observation"); // Set the stage title
    primaryStage.setScene(mainScene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 