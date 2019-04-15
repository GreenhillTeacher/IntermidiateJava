package com.suarez;
/*
Sprite
Testing JavaFx
 */
//import javafx.
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
public class Sprite {
    private int sX;
    private int sY;
    private double scale;
    public Sprite()
    {
        scale = 1;
    }
    public Sprite( int sX, int sY, double scale)
    {
        setCoordinates (sX,sY);
        setScale(scale);
    }
    public Sprite setCoordinates(int sX, int sY)
    {
        this.sX= sX;
        this.sY =sY;
        return this;
    }
    public Sprite setScale( double scale)
    {
        this.scale = scale;
        return this;
    }
    public void draw(GraphicsContext gc)
    {
        gc.setFill(Color.CORAL);
        gc.fillOval(sX,sY + 15*scale, 90*scale, 120*scale);
    }
}
