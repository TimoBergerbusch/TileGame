package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeRightTile extends Tile {
    public LightGravelPathEdgeRightTile(int id) {
        super(Assets.lightGravelPath[4], id);
    }

    public LightGravelPathEdgeRightTile(int id, String name) {
        super(Assets.lightGravelPath[4], id, name);
    }
}
