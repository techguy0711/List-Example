/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.example;

import java.awt.Color;
import java.awt.Frame;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author kristhian
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<String> ListBox;
    @FXML
    private TextField InputField;
    @FXML
    private Button addBTN;
    
    @FXML
    private Button removeBTN;
    @FXML
    private Button clearBTN;
    @FXML
    private Button clearBTN1;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void AddList(MouseEvent event) throws IOException {
        ObservableList<String> items = ListBox.getItems();
        items.add(InputField.getText());
        //Input Validation
        if(InputField.getText().equals("")) {
        Frame frame = new Frame();
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(0,0,255));
        UI.put("Panel.background",new ColorUIResource(0,0,255));
        UI.put("OptionPane.messageForeground", Color.GREEN);
        JOptionPane.showMessageDialog(frame,
        "Please fill in the required yellow field\nthen select your choice from buttons bellow.\nThank You...",
        "Field Left Empty",
        JOptionPane.PLAIN_MESSAGE);
        }
        InputField.clear();
    }

    @FXML
    private void RemoveList(MouseEvent event) throws IOException {
         ObservableList<String> items = ListBox.getItems();
                 //Input Validation
         if(items.contains(InputField.getText())){
         items.remove(InputField.getText());
    }

        else {
            Frame frame = new Frame();
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(0,0,255));
        UI.put("Panel.background",new ColorUIResource(0,0,255));
        UI.put("OptionPane.messageForeground", Color.GREEN);
        JOptionPane.showMessageDialog(frame,
        "You are trying to remove an item that does not exist, \nPlease try again... \nThanks!\n",
        "Does not Exists",
        JOptionPane.PLAIN_MESSAGE);
        }
        if(InputField.getText().equals("")) {
        Frame frame = new Frame();
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(0,0,255));
        UI.put("Panel.background",new ColorUIResource(0,0,255));
        UI.put("OptionPane.messageForeground", Color.GREEN);
        JOptionPane.showMessageDialog(frame,
        "Please fill in the required yellow field\nthen select your choice from buttons bellow.\nThank You...",
        "Field Left Empty",
        JOptionPane.PLAIN_MESSAGE);
        }

        InputField.clear();
    }

    @FXML
    private void ClearList(MouseEvent event) throws IOException {
        ObservableList<String> items = ListBox.getItems();
        items.clear();
        InputField.clear();
    }

    @FXML
    private void Quit(MouseEvent event) {exit(-1);}
    
}
