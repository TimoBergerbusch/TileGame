package tiles.pathes.complexPath.darkGrassPath;

import tiles.Tile;
import gfx.Assets;


public class DarkGrassPathFullTile extends Tile {
    public DarkGrassPathFullTile(int id) {
        super(Assets.darkGrassPath[0], id);
    }

    public DarkGrassPathFullTile(int id, String name) {
        super(Assets.darkGrassPath[0], id, name);
    }
}

