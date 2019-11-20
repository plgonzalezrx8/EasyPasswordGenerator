package passwordGenerator;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

public class Controller {
    @FXML
    public CheckBox numbers;
    public CheckBox lowercases;
    public CheckBox symbols;
    public CheckBox uppercases;
    public TextField generatedField;
    public MenuItem close;
    public TextField passwordLength;


    public void generate(javafx.event.ActionEvent actionEvent) {

        int passwordLen = Integer.parseInt(passwordLength.getText());

        if(!lowercases.isSelected() && !uppercases.isSelected() && !symbols.isSelected() && !numbers.isSelected()){
            //checks to make sure that at least one option is selected
            generatedField.setText("Please Select at least one option");

        } else {
            generatedField.setText(RandomString.getAlphaNumericString(passwordLen, numbers.isSelected(), uppercases.isSelected(),
                    lowercases.isSelected(), symbols.isSelected()));
        }



        //insert code here for generate button
    }

    public void close(ActionEvent actionEvent) {
        Platform.exit();

    }
}
