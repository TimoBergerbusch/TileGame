package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeTopLeftTile extends Tile {
    public DirtPathEdgeTopLeftTile(int id) {
        super(Assets.dirtPath[5], id);
    }

    public DirtPathEdgeTopLeftTile(int id, String name) {
        super(Assets.dirtPath[5], id, name);
    }
}
