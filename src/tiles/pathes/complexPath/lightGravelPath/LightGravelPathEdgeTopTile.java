package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeTopTile extends Tile {
    public LightGravelPathEdgeTopTile(int id) {
        super(Assets.lightGravelPath[1], id);
    }

    public LightGravelPathEdgeTopTile(int id, String name) {
        super(Assets.lightGravelPath[1], id, name);
    }
}
