package sample;
//mở rộng từ đối tượng trò chơi, quản lý các đối tượng quân địch
public interface Enemy extends GameEntity{
    @Override
    double health;
    double speed = 0;
    double armor = 0;
    int reward = 0;

    void loadImage(String path);
    void move();
    boolean hasDied();
    void show();

}
