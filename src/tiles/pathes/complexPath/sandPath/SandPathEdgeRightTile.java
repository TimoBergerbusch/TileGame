package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeRightTile extends Tile {
    public SandPathEdgeRightTile(int id) {
        super(Assets.sandPath[4], id);
    }

    public SandPathEdgeRightTile(int id, String name) {
        super(Assets.sandPath[4], id, name);
    }
}
