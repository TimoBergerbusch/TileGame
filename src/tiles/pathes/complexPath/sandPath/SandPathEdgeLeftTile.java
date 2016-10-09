package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeLeftTile extends Tile {
    public SandPathEdgeLeftTile(int id) {
        super(Assets.sandPath[3], id);
    }

    public SandPathEdgeLeftTile(int id, String name) {
        super(Assets.sandPath[3], id, name);
    }
}
