package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathOutsideEdgeTopRightTile extends Tile {
    public SandPathOutsideEdgeTopRightTile(int id) {
        super(Assets.sandPath[10], id);
    }

    public SandPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.sandPath[10], id, name);
    }
}
