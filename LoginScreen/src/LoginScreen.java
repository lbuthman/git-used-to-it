/**
 *Version 1 of a login screen. Merely a starting place;
 * v1.0 - created 3/5/17
 * Luke Buthman
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class LoginScreen extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
