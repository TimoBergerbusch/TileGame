package tiles;


import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Tile {

    //Static
    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0);
    public static Tile roundBushTile = new RoundBushTile(1);
    public static Tile farnTile = new FarneTile(2);

    //Class
    public static final int TILE_WIDTH = 32, TILE_HEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILE_HEIGHT, TILE_HEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
