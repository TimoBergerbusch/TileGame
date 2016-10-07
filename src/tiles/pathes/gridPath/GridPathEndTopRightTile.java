package tiles.pathes.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathEndTopRightTile extends Tile {
    public GridPathEndTopRightTile(int id) {
        super(Assets.gridPath[6], id);
//        super(Assets.lightStonePathEndTopRight, id);
    }

    public GridPathEndTopRightTile(int id, String name) {
        super(Assets.gridPath[6], id, name);
//        super(Assets.lightStonePathEndTopRight, id, name);
    }
}
