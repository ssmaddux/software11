package s1p.software1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class mainformcontroller implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onExitButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("I am clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am initialized");
    }
}