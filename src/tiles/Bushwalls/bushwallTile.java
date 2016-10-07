package tiles.bushwalls;

import java.awt.image.BufferedImage;

import tiles.Tile;

public abstract class BushwallTile extends Tile {


    public BushwallTile(BufferedImage texture, int id) {
        super(texture, id);
    }

    public BushwallTile(BufferedImage texture, int id, String name) {
        super(texture, id, name);
    }

    public boolean isSolid() {
        return true;
    }
}
