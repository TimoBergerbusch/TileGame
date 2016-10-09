package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeTopTile extends Tile {
    public SandPathEdgeTopTile(int id) {
        super(Assets.sandPath[1], id);
    }

    public SandPathEdgeTopTile(int id, String name) {
        super(Assets.sandPath[1], id, name);
    }
}
