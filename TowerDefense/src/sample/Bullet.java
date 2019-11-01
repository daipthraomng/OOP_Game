package sample;

import javafx.scene.image.Image;

public class Bullet implements GameEntity {
    private int x_pos;
    private int y_pos;
    private Image bullet;


    public Bullet(int x_pos, int y_pos)
    {
        super();
        this.x_pos = x_pos;
        this.y_pos = y_pos;
    }
    public void move()
    {

    }
    @Override
    public void loadImage(String path) {

    }

}
