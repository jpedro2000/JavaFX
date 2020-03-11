package sample;

import gui.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.EOFException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
            primaryStage.setTitle("Calculator");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
