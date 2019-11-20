package passwordGenerator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField generatedField;

    @FXML
    private MenuItem close;

    public void generate(javafx.event.ActionEvent actionEvent) {
        generatedField.setText("It Works!");

    }

    public void close(ActionEvent actionEvent) {
        Platform.exit();

    }
}
