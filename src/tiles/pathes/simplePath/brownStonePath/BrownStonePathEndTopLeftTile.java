package tiles.pathes.simplePath.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathEndTopLeftTile extends Tile{
    public BrownStonePathEndTopLeftTile(int id) {
        super(Assets.brownStonePath[5], id);
//        super(Assets.lightStonePathEndTopLeft, id);
    }

    public BrownStonePathEndTopLeftTile(int id, String name) {
        super(Assets.brownStonePath[5], id, name);
//        super(Assets.lightStonePathEndTopLeft, id, name);
    }
}
