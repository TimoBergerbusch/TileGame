package tiles.fence;

import java.awt.image.BufferedImage;

import tiles.Tile;

public abstract class FenceTile extends Tile {
    public FenceTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public boolean isSolid(){
        return true;
    }
}
