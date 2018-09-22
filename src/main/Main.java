package main;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("config.fxml"));
        stage.setTitle("No Name Poké Game");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("\\resources\\images\\pokeball.png")));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

