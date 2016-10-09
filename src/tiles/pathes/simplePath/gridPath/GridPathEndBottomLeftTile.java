package tiles.pathes.simplePath.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathEndBottomLeftTile extends Tile {
    public GridPathEndBottomLeftTile(int id) {
        super(Assets.gridPath[7], id);
//        super(Assets.lightStonePathEndBottomLeft, id);
    }

    public GridPathEndBottomLeftTile(int id, String name) {
        super(Assets.gridPath[7], id, name);
//        super(Assets.lightStonePathEndBottomLeft, id, name);
    }
}
