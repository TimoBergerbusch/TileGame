package tiles.pathes.complexPath.lightGravelPath;

import gfx.Assets;
import tiles.Tile;

public class LightGravelPathEdgeBottomTile extends Tile {
    public LightGravelPathEdgeBottomTile(int id) {
        super(Assets.lightGravelPath[2], id);
    }

    public LightGravelPathEdgeBottomTile(int id, String name) {
        super(Assets.lightGravelPath[2], id, name);
    }
}
