package Week4.practicum2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
        hb1.setPrefWidth(350);

        HBox hb2 = new HBox();
        Label label2 = new Label("naam:");
        TextField tf2 = new TextField();
        tf2.setPrefWidth(300);
        tf2.setAlignment();
        hb2.getChildren().addAll(label2, tf2);
        hb2.setPrefWidth(350);

        HBox hb3 = new HBox();
        Label label3 = new Label("adres:");
        TextField tf3 = new TextField();
        hb3.getChildren().addAll(label3, tf3);
        hb3.setPrefWidth(350);

        HBox hb4 = new HBox();
        Label label4 = new Label("aankomstdatum:");
        DatePicker dp4 = new DatePicker();
        hb4.getChildren().addAll(label4, dp4);
        hb4.setPrefWidth(350);

        HBox hb5 = new HBox();
        Label label5 = new Label("vertrekdatum:");
        DatePicker dp5 = new DatePicker();
        hb5.getChildren().addAll(label5, dp5);
        hb5.setPrefWidth(350);

        HBox hb6 = new HBox();
        Label label6 = new Label("kamertype:");
        ComboBox cb6 = new ComboBox();
        hb6.getChildren().addAll(label6, cb6);
        hb6.setPrefWidth(350);

        HBox hb7 = new HBox();
        Button btn1 = new Button("reset");
        Button btn2 = new Button("boek");
        hb7.getChildren().addAll(btn1, btn2);
        hb7.setAlignment(Pos.CENTER_RIGHT);
        hb7.setPrefWidth(350);

        root.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6, hb7);
        Scene scene = new Scene(root, 450, 300);

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
