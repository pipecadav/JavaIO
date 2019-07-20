package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.dao.UserDAOImpl;

public class Controller {

    UserDAOImpl fileImplementation = new UserDAOImpl();

    @FXML
    Button addRecord;

    @FXML
    Button loadFileData;

    @FXML
    Button openFile;

    @FXML
    TextField cedulaField;

    @FXML
    TextField nameField;

    @FXML
    TextField lastNameField;


    /**
     * Constructor
     */
    public Controller() {
    }

    @FXML
    private void handleAddRecord(){
        fileImplementation.addUser(cedulaField.getText(), nameField.getText(), lastNameField.getText());
        System.out.println("saved");
    }

    @FXML
    private void handleLoadFileData(){
        fileImplementation.createFile();
        System.out.println("loaded");
    }

    @FXML
    private void handleOpen(){
        //fileImplementation.readFile();
        fileImplementation.readFile2();
        System.out.println("opened");
    }
}
