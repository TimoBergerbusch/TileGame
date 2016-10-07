package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathBottomTile extends Tile{
    public BrownStonePathBottomTile(int id) {
//        super(Assets.lightStonePathBottom, id);
        super(Assets.brownStonePath[2], id);
    }

    public BrownStonePathBottomTile(int id, String name) {
        super(Assets.brownStonePath[2], id, name);
//        super(Assets.lightStonePathBottom, id, name);
    }
}
