package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import javax.net.ssl.SSLEngine;

//Màn chơi : class định nghĩa trạng thái bắt đầu của trò chơi
public class GameStage  {
    private final static int SCREEN_HEIGHT = 720;
    private final static int SCREEN_WIDTH = 1200;
    private final static String GAME_TITLE= "Tower Defense";

    GraphicsContext mainGr ;
    private Canvas mainCanvas;
    private Scene mainScene;
    private Stage mainStage;
    private Group root;


    public GameStage()
    {
        mainCanvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        mainGr = mainCanvas.getGraphicsContext2D();
        root = new Group();
        root.getChildren().add(mainCanvas);
        mainScene = new Scene(root);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        mainStage.setTitle(GAME_TITLE);

    }

    public Stage getMainStage() {
        return mainStage;
    }
}
