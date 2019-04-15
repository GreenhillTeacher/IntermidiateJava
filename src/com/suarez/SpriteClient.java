package com.suarez;
/*
Sprite Client class...testing
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;

public class SpriteClient extends Application {
    private Sprite s1,s2,s3;
    public void start (Stage stage)
    {
        GraphicsContext gc =  JIGRaphicsUtility.setUpGraphics(stage, "Sprites", 900,600);
        s1 = new Sprite(100,50,.5);
        s2 = new Sprite(200,150,1);
        s3 = new Sprite(300,250,1.5);
        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc);

    }
    public static void main (String [] args)
    {
        launch(args);
    }
}
