/**
 * @author Paul Duschek
 * @version 1.0, 8.12.2020
 */

import Login.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        LoginController.show(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
