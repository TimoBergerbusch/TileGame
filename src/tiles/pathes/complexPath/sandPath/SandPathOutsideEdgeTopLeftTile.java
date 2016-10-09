package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathOutsideEdgeTopLeftTile extends Tile {
    public SandPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.sandPath[9], id);
    }

    public SandPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.sandPath[9], id, name);
    }
}
