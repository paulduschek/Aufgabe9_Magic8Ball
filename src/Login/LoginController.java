package Login;

import Main.MainController;
import Main.MainModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
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

public class LoginController implements Initializable {

    @FXML
    private TextField UsernameField;
    @FXML
    private PasswordField PasswordField;

    Stage stage;
    LoginModel model;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model = new LoginModel();
    }

    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("Login.fxml"));
            Parent root = fxmlLoader.load();

            LoginController login = fxmlLoader.getController();
            login.setStage(stage);

            stage.setTitle("Main");
            stage.setScene(new Scene(root, 600, 300));
            stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Something wrong with main.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }

    public void forward()
    {
        MainController.show(new Stage());
        stage.close();
    }

    public void Login()
    {
        boolean b = model.checkLogin(UsernameField.getText(), PasswordField.getText());
        if(b == true)
        {
            forward();
        }
        else{
            System.out.println("Something went wrong!");
        }
    }

}
