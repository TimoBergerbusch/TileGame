package tiles.water;

import java.awt.image.BufferedImage;

import tiles.Tile;

public abstract class WaterTile extends Tile {
    public WaterTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public WaterTile(BufferedImage texture, int id, String name) {
        super(texture, id, name);
    }

    public boolean isSolid() {
        return true;
    }
}
