package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeBottomLeftTile extends Tile {
    public LightGravelPathEdgeBottomLeftTile(int id) {
        super(Assets.lightGravelPath[7], id);
    }

    public LightGravelPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.lightGravelPath[7], id, name);
    }
}
