package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathOutsideEdgeBottomLeftTile extends Tile {
    public LightGravelPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.lightGravelPath[11], id);
    }

    public LightGravelPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.lightGravelPath[11], id, name);
    }
}
