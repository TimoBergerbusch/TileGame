package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathEndBottomLeftTile extends Tile {
    public BrownStonePathEndBottomLeftTile(int id) {
        super(Assets.brownStonePath[7], id);
//        super(Assets.lightStonePathEndBottomLeft, id);
    }

    public BrownStonePathEndBottomLeftTile(int id, String name) {
        super(Assets.brownStonePath[7], id, name);
//        super(Assets.lightStonePathEndBottomLeft, id, name);
    }
}
