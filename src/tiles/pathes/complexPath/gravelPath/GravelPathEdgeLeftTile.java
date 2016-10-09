package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeLeftTile extends Tile {
    public GravelPathEdgeLeftTile(int id, String name) {
        super(Assets.gravelPath[5], id, name);
    }

    public GravelPathEdgeLeftTile(int id) {
        super(Assets.gravelPath[5], id);
    }
}
