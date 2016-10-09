package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeTopRightTile extends Tile {
    public SandPathEdgeTopRightTile(int id) {
        super(Assets.sandPath[6], id);
    }

    public SandPathEdgeTopRightTile(int id, String name) {
        super(Assets.sandPath[6], id, name);
    }
}
