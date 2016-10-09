package tiles.pathes.complexPath.sandPath;

import tiles.Tile;
import gfx.Assets;


public class SandPathFullTile extends Tile {
    public SandPathFullTile(int id) {
        super(Assets.sandPath[0], id);
    }

    public SandPathFullTile(int id, String name) {
        super(Assets.sandPath[0], id, name);
    }
}

