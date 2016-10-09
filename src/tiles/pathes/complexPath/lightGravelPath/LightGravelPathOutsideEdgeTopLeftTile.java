package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathOutsideEdgeTopLeftTile extends Tile {
    public LightGravelPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.lightGravelPath[9], id);
    }

    public LightGravelPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.lightGravelPath[9], id, name);
    }
}
