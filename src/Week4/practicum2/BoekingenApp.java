package Week4.practicum2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ComboBox;

/**
 * Created by Ashwin on 07-Mar-16.
 */
public class BoekingenApp extends Application implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        HBox hb1 = new HBox();
        Label label1 = new Label("Voer uw gegevens in!");
        hb1.getChildren().add(label1);

        HBox hb2 = new HBox();
        Label label2 = new Label("naam:");
        TextField tf2 = new TextField();
        hb2.getChildren().addAll(label2, tf2);

        HBox hb3 = new HBox();
        Label label3 = new Label("adres:");
        TextField tf3 = new TextField();
        hb3.getChildren().addAll(label3, tf3);

        HBox hb4 = new HBox();
        Label label4 = new Label("aankomstdatum");
        DatePicker dp4 = new DatePicker();
        hb4.getChildren().addAll(label4, dp4);

        HBox hb5 = new HBox();
        Label label5 = new Label("vertrekdatum");
        DatePicker dp5 = new DatePicker();
        hb5.getChildren().addAll(label5, dp5);

        HBox hb6 = new HBox();
        Label label6 = new Label("kamertype");
        ComboBox cb6 = new ComboBox();
        hb6.getChildren().addAll(label6, cb6);

        root.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6);
        Scene scene = new Scene(root, 350, 175);

        primaryStage.setTitle("Tweepersoonsboekinge");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void handle(ActionEvent event) {

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
