package main;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Canvas canvas;

    private GraphicsContext gc ;

    AnimateObjects animate=new AnimateObjects();
    @FXML private void drawCanvas(ActionEvent event) {
        gc.drawImage(new Image(getClass().getResourceAsStream("\\resources\\images\\title.png")),0,0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gc = canvas.getGraphicsContext2D();
        animate.start();
    }
    public class AnimateObjects extends AnimationTimer
    {
        public void handle(long now) {
            gc.drawImage(new Image(getClass().getResourceAsStream("\\resources\\images\\title.png")),0,0);
        }
    }
}
