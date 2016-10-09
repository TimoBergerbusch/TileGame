package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathFullTile extends Tile {


    public GravelPathFullTile(int id) {
        super(Assets.gravelPath[0], id);
    }

    public GravelPathFullTile(int id, String name) {
        super(Assets.gravelPath[0], id, name);
    }
}
