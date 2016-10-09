package tiles.pathes.complexPath.pavingPath;

import tiles.Tile;
import gfx.Assets;


public class PavingPathFullTile extends Tile {
    public PavingPathFullTile(int id) {
        super(Assets.pavingPath[0], id);
    }

    public PavingPathFullTile(int id, String name) {
        super(Assets.pavingPath[0], id, name);
    }
}

