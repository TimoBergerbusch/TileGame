package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathLeftTile extends Tile{
    public BrownStonePathLeftTile(int id) {
        super(Assets.brownStonePath[3], id);
//        super(Assets.lightStonePathLeft, id);
    }

    public BrownStonePathLeftTile(int id, String name) {
        super(Assets.brownStonePath[3], id, name);
//        super(Assets.lightStonePathLeft, id, name);
    }
}
