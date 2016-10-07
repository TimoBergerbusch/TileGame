package tiles.pathes.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathEndTopRightTile extends Tile {
    public BrownStonePathEndTopRightTile(int id) {
        super(Assets.brownStonePath[6], id);
//        super(Assets.lightStonePathEndTopRight, id);
    }

    public BrownStonePathEndTopRightTile(int id, String name) {
        super(Assets.brownStonePath[6], id, name);
//        super(Assets.lightStonePathEndTopRight, id, name);
    }
}
