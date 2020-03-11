package gui;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    private Button btSub;

    @FXML
    private Button btMult;

    @FXML
    public void onBtSumAction(){
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sum = number1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        }catch (NumberFormatException e){
            Alerts.showAlert("Error", "parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public void onBtSubAction(){
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double sub = number1 - number2;
            labelResult.setText(String.format("%.2f", sub));
        }catch (NumberFormatException e){
            Alerts.showAlert("Error", "parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public void onBtMultAction(){
        try {
            Locale.setDefault(Locale.US);
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double mult = number1 * number2;
            labelResult.setText(String.format("%.2f", mult));
        }catch (NumberFormatException e){
            Alerts.showAlert("Error", "parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber2);
    }
}
