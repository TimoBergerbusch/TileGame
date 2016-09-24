package tiles.bushwalls;

import java.awt.image.BufferedImage;

import tiles.Tile;

public abstract class BushwallTile extends Tile {


    public BushwallTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public boolean isSolid(){
        return true;
    }
}
