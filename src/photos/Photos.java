// Muneer Hamdan myh16, Gabriel Ignacio
package photos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Photos extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    
        StackPane root = new StackPane();


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Photo Library");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
