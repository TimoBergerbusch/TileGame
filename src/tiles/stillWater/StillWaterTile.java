package tiles.stillWater;

import java.awt.image.BufferedImage;

import gfx.Assets;
import tiles.Tile;

public abstract class StillWaterTile extends Tile {
    public StillWaterTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public boolean isSolid() {
        return true;
    }
}
