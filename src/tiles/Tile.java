package tiles;


import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public abstract class Tile {

    //Class
    public static final int TILE_WIDTH = 64, TILE_HEIGHT = 64;
    protected final int id;
    protected BufferedImage texture;
    protected ImageIcon textureIcon;
    protected String name;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        name = "Untitled(" + id + ")";

        textureIcon = new ImageIcon(texture.getScaledInstance(50,50,Image.SCALE_SMOOTH));

        StaticTiles.tiles[id] = this;
    }

    public Tile(BufferedImage texture, int id, String name) {
        this(texture, id);

        this.name = name;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public ImageIcon getTextureIcon() {
        return textureIcon;
    }
}
