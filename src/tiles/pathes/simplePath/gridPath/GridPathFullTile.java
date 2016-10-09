package tiles.pathes.simplePath.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathFullTile extends Tile {
    public GridPathFullTile(int id) {
        super(Assets.gridPath[0], id);
    }

    public GridPathFullTile(int id, String name) {
        super(Assets.gridPath[0], id, name);
    }
}
