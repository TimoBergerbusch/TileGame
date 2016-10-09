package tiles.pathes.complexPath.lightGrassPath;

import tiles.Tile;
import gfx.Assets;


public class LightGrassPathFullTile extends Tile {
    public LightGrassPathFullTile(int id) {
        super(Assets.lightGrassPath[0], id);
    }

    public LightGrassPathFullTile(int id, String name) {
        super(Assets.lightGrassPath[0], id, name);
    }
}

