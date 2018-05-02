/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nurul.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class LoginLayoutController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Label lblUsername;
    @FXML
    private Label lblPassword;
    @FXML
    private ImageView imgMarnat;
    @FXML
    private Label lblLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        imgMarnat.setImage(new Image("8076-200.png"));

    }

    @FXML
    private void LoginOnAction(ActionEvent event) {
    }

}
