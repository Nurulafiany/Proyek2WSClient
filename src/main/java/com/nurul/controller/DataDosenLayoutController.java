/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nurul.controller;

import com.nurul.ws.RoomWS;
import com.nurul.ws.RoomWS_Service;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class DataDosenLayoutController implements Initializable {

    @FXML
    private Label lblNama;
    @FXML
    private Label lblKataSandi;
    @FXML
    private Label lblFakultas;
    @FXML
    private Label lblJurusan;
    @FXML
    private TextField txtNama;
    @FXML
    private PasswordField txtKataSandi;
    @FXML
    private ComboBox<?> cmbFakultas;
    @FXML
    private ComboBox<?> cmbJurusan;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private TableColumn<?, String> colNIK;
    @FXML
    private TableColumn<?, String> colNama;
    @FXML
    private TableColumn<?, String> colFakultas;
    @FXML
    private TableColumn<?, String> colJurusan;
    @FXML
    private Label lblDataMahasiswa;
    @FXML
    private Label lblTahunAkademik;
    @FXML
    private ComboBox<?> cmbTahunAkademik;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RoomWS roomWS = new RoomWS_Service().getRoomWSPort();

    }

}
