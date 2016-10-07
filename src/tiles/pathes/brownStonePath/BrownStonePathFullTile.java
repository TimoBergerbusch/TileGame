package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathFullTile extends Tile{
    public BrownStonePathFullTile(int id) {
        super(Assets.brownStonePath[0], id);
//        super(Assets.lightStonePathFull, id);
    }

    public BrownStonePathFullTile(int id, String name) {
        super(Assets.brownStonePath[0], id, name);
//        super(Assets.lightStonePathFull, id, name);
    }
}
