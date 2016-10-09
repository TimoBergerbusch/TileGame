package tiles.pathes.complexPath.sandPath;

import gfx.Assets;
import tiles.Tile;

public class SandPathEdgeBottomTile extends Tile {
    public SandPathEdgeBottomTile(int id) {
        super(Assets.sandPath[2], id);
    }

    public SandPathEdgeBottomTile(int id, String name) {
        super(Assets.sandPath[2], id, name);
    }
}
