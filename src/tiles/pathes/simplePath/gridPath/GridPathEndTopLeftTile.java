package tiles.pathes.simplePath.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathEndTopLeftTile extends Tile{
    public GridPathEndTopLeftTile(int id) {
        super(Assets.gridPath[5], id);
//        super(Assets.lightStonePathEndTopLeft, id);
    }

    public GridPathEndTopLeftTile(int id, String name) {
        super(Assets.gridPath[5], id, name);
//        super(Assets.lightStonePathEndTopLeft, id, name);
    }
}
