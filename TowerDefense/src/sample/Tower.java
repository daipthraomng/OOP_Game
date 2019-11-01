package sample;

public interface Tower extends GameTile {
    abstract void putTower(int x, int y);
    abstract void shoot();
    abstract boolean findEnemy();

}
