package sample;
//mở rộng từ đối tượng trò chơi, quản lý các đối tượng quân địch
public interface Enemy extends GameEntity{
    @Override
    void loadImage(String path);
    void move();
    boolean hasDied();
    void show();

}
