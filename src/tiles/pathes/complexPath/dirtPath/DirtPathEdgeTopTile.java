package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeTopTile extends Tile {
    public DirtPathEdgeTopTile(int id) {
        super(Assets.dirtPath[1], id);
    }

    public DirtPathEdgeTopTile(int id, String name) {
        super(Assets.dirtPath[1], id, name);
    }
}
