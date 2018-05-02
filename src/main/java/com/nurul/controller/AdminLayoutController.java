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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AdminLayoutController implements Initializable {

    @FXML
    private ImageView imgDosen;
    @FXML
    private ImageView imgMahasiswa;
    @FXML
    private ImageView imgLogout;
    @FXML
    private Label lblAdminMenu;
    @FXML
    private Button btnDataDosen;
    @FXML
    private Button btnDataMahasiswa;
    @FXML
    private Button btnLogout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        imgDosen.setImage(new Image("8076-200.png"));
    }

    @FXML
    private void LogoutOnAction(ActionEvent event) {
    }

    @FXML
    private void MatKulOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDataDosenOnAction(MouseEvent event) {
    }

    @FXML
    private void DataDosenOnAction(ActionEvent event) {
    }

    @FXML
    private void btnDataMahasiswaOnAction(MouseEvent event) {
    }

    @FXML
    private void DataMahasiswaOnAction(ActionEvent event) {
    }

    @FXML
    private void btnLogoutOnAction(MouseEvent event) {
    }

}
