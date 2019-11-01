package sample;

public class Spawner implements GameTile {
    private int Spa_X;
    private int Spa_y;
    // Một stack các lính đi ra private

    public Spawner()
    {

    }
    @Override
    public void loadImage(String path) {

    }

    public int getSpa_X() {
        return Spa_X;
    }

    public int getSpa_y() {
        return Spa_y;
    }

    public void setSpa_X(int spa_X) {
        Spa_X = spa_X;
    }

    public void setSpa_y(int spa_y) {
        Spa_y = spa_y;
    }
    public void SetPosition(int spa_X, int spa_y)
    {
        setSpa_X(spa_X);
        setSpa_y(spa_y);
    }
}
