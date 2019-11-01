package sample;

public class Target implements GameTile {
    private int Target_x;
    private int Target_y;
    // Số lượng đã đi vào
    @Override
    public void loadImage(String path) {

    }

    public void setTarget_x(int target_x) {
        Target_x = target_x;
    }

    public void setTarget_y(int target_y) {
        Target_y = target_y;
    }
}
