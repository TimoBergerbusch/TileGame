package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeBottomLeftTile extends Tile {
    public SandPathEdgeBottomLeftTile(int id) {
        super(Assets.sandPath[7], id);
    }

    public SandPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.sandPath[7], id, name);
    }
}
