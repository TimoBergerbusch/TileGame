package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeLeftTile extends Tile {
    public DirtPathEdgeLeftTile(int id) {
        super(Assets.dirtPath[3], id);
    }

    public DirtPathEdgeLeftTile(int id, String name) {
        super(Assets.dirtPath[3], id, name);
    }
}
