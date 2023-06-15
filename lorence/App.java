import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/login.fxml"));
            Scene scene = new Scene(root);
            // Disables resizing of window
            Image icon = new Image("C:/path/to/src/images/logo.jpg");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setTitle("Cinema");
            stage.getIcons().add(icon);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}