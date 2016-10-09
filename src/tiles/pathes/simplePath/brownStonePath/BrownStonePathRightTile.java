package tiles.pathes.simplePath.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathRightTile extends Tile {
    public BrownStonePathRightTile(int id) {
        super(Assets.brownStonePath[4], id);
//        super(Assets.lightStonePathRight, id);
    }

    public BrownStonePathRightTile(int id, String name) {
        super(Assets.brownStonePath[4], id, name);
//        super(Assets.lightStonePathRight, id, name);
    }
}
