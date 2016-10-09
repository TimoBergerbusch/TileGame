package tiles.pathes.simplePath.gridPath;

import gfx.Assets;
import tiles.Tile;

public class GridPathTopTile extends Tile {
    public GridPathTopTile(int id) {
        super(Assets.gridPath[1], id);
//        super(Assets.lightStonePathTop, id);
    }

    public GridPathTopTile(int id, String name) {
        super(Assets.gridPath[1], id, name);
//        super(Assets.lightStonePathTop, id, name);
    }
}
