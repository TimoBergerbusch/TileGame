package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathOutsideEdgeBottomLeftTile extends Tile {
    public SandPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.sandPath[11], id);
    }

    public SandPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.sandPath[11], id, name);
    }
}
