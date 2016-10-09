package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeBottomRightTile extends Tile {
    public SandPathEdgeBottomRightTile(int id) {
        super(Assets.sandPath[8], id);
    }

    public SandPathEdgeBottomRightTile(int id, String name) {
        super(Assets.sandPath[8], id, name);
    }
}
