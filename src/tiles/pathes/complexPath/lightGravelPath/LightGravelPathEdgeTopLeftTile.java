package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeTopLeftTile extends Tile {
    public LightGravelPathEdgeTopLeftTile(int id) {
        super(Assets.lightGravelPath[5], id);
    }

    public LightGravelPathEdgeTopLeftTile(int id, String name) {
        super(Assets.lightGravelPath[5], id, name);
    }
}
