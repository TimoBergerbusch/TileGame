package tiles.pathes.complexPath.cavePath;

import tiles.Tile;
import gfx.Assets;


public class CavePathFullTile extends Tile {
    public CavePathFullTile(int id) {
        super(Assets.cavePath[0], id);
    }

    public CavePathFullTile(int id, String name) {
        super(Assets.cavePath[0], id, name);
    }
}

