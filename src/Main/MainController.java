package Main;

import Login.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Paul Duschek
 * @version 1.0, 8.12.2020
 */

public class MainController implements Initializable {

    @FXML
    private Label replyLabel;
    @FXML
    private TextField QuestionTextField;

    Stage stage;
    MainModel model;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            model = new MainModel();
    }

    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("Main.fxml"));
            Parent root = fxmlLoader.load();
            stage.setTitle("Main");
            stage.setScene(new Scene(root, 600, 300));
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with main.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }

    public void getReply()
    {
        replyLabel.setText(model.getRandomReply(QuestionTextField.getText()));
    }

}
