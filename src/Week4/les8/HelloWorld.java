package Week4.les8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Ashwin on 03-Mar-16.
 */

public class HelloWorld extends Application
                        implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(this);

        Button btn1 = new Button("Click me");
        btn1.setOnAction(this);

        StackPane root = new StackPane();
        root.getChildren().addAll(btn, btn1);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(ActionEvent event) {

        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
