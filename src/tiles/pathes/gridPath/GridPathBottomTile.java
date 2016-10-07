package tiles.pathes.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathBottomTile extends Tile{
    public GridPathBottomTile(int id) {
        super(Assets.gridPath[2], id);
    }

    public GridPathBottomTile(int id, String name) {
        super(Assets.gridPath[2], id, name);
    }
}
