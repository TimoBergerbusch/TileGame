package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathOutsideEdgeTopRightTile extends Tile {
    public LightGravelPathOutsideEdgeTopRightTile(int id) {
        super(Assets.lightGravelPath[10], id);
    }

    public LightGravelPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.lightGravelPath[10], id, name);
    }
}
