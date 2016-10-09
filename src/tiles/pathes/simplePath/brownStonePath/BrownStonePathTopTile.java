package tiles.pathes.simplePath.brownStonePath;

import gfx.Assets;
import tiles.Tile;

public class BrownStonePathTopTile extends Tile {
    public BrownStonePathTopTile(int id) {
        super(Assets.brownStonePath[1], id);
//        super(Assets.lightStonePathTop, id);
    }

    public BrownStonePathTopTile(int id, String name) {
        super(Assets.brownStonePath[1], id, name);
//        super(Assets.lightStonePathTop, id, name);
    }
}
