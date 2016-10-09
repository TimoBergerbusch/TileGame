package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathOutsideEdgeBottomRightTile extends Tile {
    public SandPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.sandPath[12], id);
    }

    public SandPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.sandPath[12], id, name);
    }
}
