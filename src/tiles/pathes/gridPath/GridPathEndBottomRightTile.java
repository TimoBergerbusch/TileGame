package tiles.pathes.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathEndBottomRightTile extends Tile {
    public GridPathEndBottomRightTile(int id) {
        super(Assets.gridPath[8], id);
//        super(Assets.lightStonePathEndBottomRight, id);
    }

    public GridPathEndBottomRightTile(int id, String name) {
        super(Assets.gridPath[8], id, name);
//        super(Assets.lightStonePathEndBottomRight, id, name);
    }
}
