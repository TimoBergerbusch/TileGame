package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeRightTile extends Tile {
    public DirtPathEdgeRightTile(int id) {
        super(Assets.dirtPath[4], id);
    }

    public DirtPathEdgeRightTile(int id, String name) {
        super(Assets.dirtPath[4], id, name);
    }
}
