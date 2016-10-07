package tiles.pathes.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathRightTile extends Tile {
    public GridPathRightTile(int id) {
        super(Assets.gridPath[4], id);
    }

    public GridPathRightTile(int id, String name) {
        super(Assets.gridPath[4], id, name);
    }
}
