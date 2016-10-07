package tiles.beach;

import java.awt.image.BufferedImage;

import gfx.Assets;
import tiles.Tile;

public class BeachTile extends Tile{


    public BeachTile(int id) {
        super(Assets.beach, id);
    }

    public BeachTile(int id, String name) {
        super(Assets.beach, id, name);
    }
}
