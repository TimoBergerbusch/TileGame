package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeTopRightTile extends Tile {
    public LightGravelPathEdgeTopRightTile(int id) {
        super(Assets.lightGravelPath[6], id);
    }

    public LightGravelPathEdgeTopRightTile(int id, String name) {
        super(Assets.lightGravelPath[6], id, name);
    }
}
