package tiles.pathes.complexPath.lightGravelPath;

import tiles.Tile;
import gfx.Assets;


public class LightGravelPathFullTile extends Tile {
    public LightGravelPathFullTile(int id) {
        super(Assets.lightGravelPath[0], id);
    }

    public LightGravelPathFullTile(int id, String name) {
        super(Assets.lightGravelPath[0], id, name);
    }
}

