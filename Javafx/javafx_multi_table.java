import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;
public class javafx_multi_table extends Application implements EventHandler<ActionEvent> {
     TextField tf1; // TextField to input the number
     TextArea tf2;  // TextArea to display the multiplication table
     Button b1; //button to compute
    @Override
    public void start(Stage st) 
    {
    Label l1=new Label("enter the number "); //input label
    Label l2=new Label("Result: "); //result label
    tf1=new TextField();
    // Initialize the TextArea for displaying the result
    tf2=new TextArea(); 
         //set width and height of textarea
    tf2.setPrefHeight(200);
    tf2.setPrefWidth(200);
    HBox h1=new HBox();
    h1.getChildren().addAll(l1,tf1);  // Add the label and TextField to the HBox

    b1=new Button("Compute");
    
    HBox h2=new HBox();
    h2.getChildren().addAll(l2,tf2);
   FlowPane root =new FlowPane();
 // Set the horizontal and vertical gap between elements
   root.setHgap(15);
   root.setVgap(15);
   root.setPadding(new Insets(20));// Add padding around the edges of the FlowPane
 // Add all components (HBox and Button) to the FlowPane
   root.getChildren().addAll(h1,h2,b1);
   Scene sc=new Scene(root,500,500); //set height and width of the scene
    st.setScene(sc);
    st.setTitle("Multiplication Table"); //set title
    st.show();
    b1.setOnAction(this);
    }
    @Override
     // Handle the button click event to compute the multiplication table
    public void handle(ActionEvent e)
    {
         // Parse the input number from the TextField
        int number =Integer.parseInt(tf1.getText());
        int sum;
        StringBuilder sb=new StringBuilder();
            for(int i=1;i<11;i++)
            {
               sum=i*number; //do the multiplication
               sb.append(number).append(" * ").append(i).append(" = ").append(sum).append("\n");
            }
            tf2.setText(sb.toString());
        // Set the generated multiplication table to the TextArea
    }

    public static void main(String[] args) {
        launch(args);
    }
}
