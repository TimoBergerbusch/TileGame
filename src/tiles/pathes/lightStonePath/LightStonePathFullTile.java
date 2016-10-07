package tiles.pathes.lightStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightStonePathFullTile extends Tile{
    public LightStonePathFullTile(int id) {
        super(Assets.lightStonePathFull, id);
    }

    public LightStonePathFullTile(int id, String name) {
        super(Assets.lightStonePathFull, id, name);
    }
}
