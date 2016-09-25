package tiles.water;

import java.awt.image.BufferedImage;

import tiles.Tile;

public abstract class WaterTile extends Tile {
    public WaterTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public boolean isSolid() {
        return true;
    }
}
