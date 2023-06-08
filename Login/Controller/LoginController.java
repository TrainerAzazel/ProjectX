package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class LoginController {

    @FXML
    TextField emailAddress;

    @FXML
    Hyperlink ForgotPass;

    // @FXML
    // Hyperlink signIn;

    @FXML
    PasswordField passwordField;

    @FXML
    Button createAccount;

    @FXML
    Label warning;

    public void login(ActionEvent event) throws IOException {

        String username = emailAddress.getText();
        String password = passwordField.getText();

        if (username.equals("123") && password.equals("123")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            warning.setVisible(true);
        }
    }
}