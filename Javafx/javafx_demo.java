import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

public class Trial extends Application {

    @Override
    public void start(Stage st) {
        
        // Create a Label with the text "Welcome to JavaFX programming"
        Label l1 = new Label("Welcome to JavaFX programming");
        
       //set text color 
        l1.setStyle("-fx-text-fill: magenta");

        // Create a FlowPane layout with horizontal and vertical spacing
        FlowPane root = new FlowPane();
        root.setHgap(20);  // Horizontal gap between elements
        root.setVgap(20);  // Vertical gap between elements
        root.setPadding(new Insets(30)); // Padding around the edges of the FlowPane
        
        // Add the Label to the FlowPane layout
        root.getChildren().add(l1);

        // Create a Scene with the FlowPane as its root and set its size
        Scene sc = new Scene(root, 500, 200);

        
        st.setScene(sc);
        
        // Set the title of the Stage
        st.setTitle("This is the first JavaFX Application");

        // Show the Stage, making it visible on the screen
        st.show();
    }

    // The main method
    public static void main(String[] args) {
        launch(args);  
    }
}
