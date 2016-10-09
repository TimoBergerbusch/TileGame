package tiles.pathes.simplePath.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathLeftTile extends Tile{
    public GridPathLeftTile(int id) {
        super(Assets.gridPath[3], id);
//        super(Assets.lightStonePathLeft, id);
    }

    public GridPathLeftTile(int id, String name) {
        super(Assets.gridPath[3], id, name);
//        super(Assets.lightStonePathLeft, id, name);
    }
}
