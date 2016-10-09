package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeLeftTile extends Tile {
    public LightGravelPathEdgeLeftTile(int id) {
        super(Assets.lightGravelPath[3], id);
    }

    public LightGravelPathEdgeLeftTile(int id, String name) {
        super(Assets.lightGravelPath[3], id, name);
    }
}
