package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.floor;

public class HelloController {
    @FXML
    private Button binary;

    @FXML
    private Button clear;

    @FXML
    private Button exit;

    @FXML
    private Button hexa;

    @FXML
    private TextField Input;

    @FXML
    private Button nextScreen;

    @FXML
    private Button octa;

    @FXML
    private Label textLabel;


    @FXML
    void binary(MouseEvent event) {

        String input = Input.getText();
        try{
            double txt = Double.parseDouble(input);
            if(floor(txt)==txt){
                int num = Integer.parseInt(Input.getText());
                textLabel.setText(Integer.toBinaryString(num));
            }
            else {
                textLabel.setText("No Input Given");
            }
        }
        catch (NumberFormatException e){
            textLabel.setText("Not a Number!");
        }


    }


    @FXML
    void clear(MouseEvent event) {
        textLabel.setText("No Input");
        Input.setText("Place Decimal Input Here");
    }

    @FXML
    void exit(MouseEvent event) {
         javafx.application.Platform.exit();
    }

    @FXML
    void hexa(MouseEvent event) {
        String input = Input.getText();
        try{
            double txt = Double.parseDouble(input);
            if(floor(txt)==txt){
                int num = Integer.parseInt(Input.getText());
                textLabel.setText(Integer.toHexString(num));
            }
            else {
                textLabel.setText("No Input Given");
            }
        }
        catch (NumberFormatException e){
            textLabel.setText("Not a Number!");
        }


    }

   private Stage stage2;
    @FXML
    void nextScreen(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("newScene.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage2.setTitle("Base Conversion calculator");
        stage2.setScene(scene2);
        stage2.show();

    }

    @FXML
    void octa(MouseEvent event) {
        String input = Input.getText();
        try{
            double txt = Double.parseDouble(input);
            if(floor(txt)==txt){
                int num = Integer.parseInt(Input.getText());
                textLabel.setText(Integer.toOctalString(num));
            }
            else {
                textLabel.setText("No Input Given");
            }
        }
        catch (NumberFormatException e){
            textLabel.setText("Not a Number!");
        }

    }
}