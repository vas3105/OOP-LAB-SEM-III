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
     TextField tf1;
     TextArea tf2;
     Button b1;
    @Override
    public void start(Stage st) 
    {
    Label l1=new Label("enter the number ");
    Label l2=new Label("Result: ");
    tf1=new TextField();
    tf2=new TextArea();
    tf2.setPrefHeight(200);
    tf2.setPrefWidth(200);
    HBox h1=new HBox();
    h1.getChildren().addAll(l1,tf1);
    b1=new Button("Compute");
    
    HBox h2=new HBox();
    h2.getChildren().addAll(l2,tf2);
   FlowPane root =new FlowPane();
   root.setHgap(15);
   root.setVgap(15);
   root.setPadding(new Insets(20));
   root.getChildren().addAll(h1,h2,b1);
   Scene sc=new Scene(root,500,500);
    st.setScene(sc);
    st.setTitle("Multiplication Table");
    st.show();
    b1.setOnAction(this);
    }
    @Override
    public void handle(ActionEvent e)
    {
        int number =Integer.parseInt(tf1.getText());
        int sum;
        StringBuilder sb=new StringBuilder();
            for(int i=1;i<11;i++)
            {
               sum=i*number;
               sb.append(number).append(" * ").append(i).append(" = ").append(sum).append("\n");
            }
            tf2.setText(sb.toString());
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
