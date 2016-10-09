package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeBottomRightTile extends Tile {
    public LightGravelPathEdgeBottomRightTile(int id) {
        super(Assets.lightGravelPath[8], id);
    }

    public LightGravelPathEdgeBottomRightTile(int id, String name) {
        super(Assets.lightGravelPath[8], id, name);
    }
}
