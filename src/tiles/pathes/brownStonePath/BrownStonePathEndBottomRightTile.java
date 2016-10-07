package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathEndBottomRightTile extends Tile {
    public BrownStonePathEndBottomRightTile(int id) {
        super(Assets.brownStonePath[8], id);
//        super(Assets.lightStonePathEndBottomRight, id);
    }

    public BrownStonePathEndBottomRightTile(int id, String name) {
        super(Assets.brownStonePath[8], id, name);
//        super(Assets.lightStonePathEndBottomRight, id, name);
    }
}
