package dev.lin_blackberry.magic_eight_ball;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    @Override
    public void start(Stage stage) throws IOException {
    	scene = new Scene(loadFXML("eightball"), WIDTH, HEIGHT);
        scene.getStylesheets().add(App.class.getResource("eightball.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    static void addToView(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}