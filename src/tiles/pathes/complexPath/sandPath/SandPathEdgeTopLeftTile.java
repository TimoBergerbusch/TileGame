package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeTopLeftTile extends Tile {
    public SandPathEdgeTopLeftTile(int id) {
        super(Assets.sandPath[5], id);
    }

    public SandPathEdgeTopLeftTile(int id, String name) {
        super(Assets.sandPath[5], id, name);
    }
}
