package tiles.pathes.complexPath.dirtPath;

import tiles.Tile;
import gfx.Assets;


public class DirtPathFullTile extends Tile {
    public DirtPathFullTile(int id) {
        super(Assets.dirtPath[0], id);
    }

    public DirtPathFullTile(int id, String name) {
        super(Assets.dirtPath[0], id, name);
    }
}

