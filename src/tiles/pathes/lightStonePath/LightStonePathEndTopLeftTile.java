package tiles.pathes.lightStonePath;

import java.awt.image.BufferedImage;

import gfx.Assets;
import tiles.Tile;

public class LightStonePathEndTopLeftTile extends Tile{
    public LightStonePathEndTopLeftTile(int id) {
        super(Assets.lightStonePathEndTopLeft, id);
    }

    public LightStonePathEndTopLeftTile(int id, String name) {
        super(Assets.lightStonePathEndTopLeft, id, name);
    }
}
