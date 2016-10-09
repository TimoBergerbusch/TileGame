package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathFullTile extends Tile {


    public BeachPathFullTile(int id) {
        super(Assets.beachPath[0], id);
    }

    public BeachPathFullTile(int id, String name) {
        super(Assets.beachPath[0], id, name);
    }
}
