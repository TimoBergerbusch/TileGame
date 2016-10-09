package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeTopLeftTile extends Tile {
    public GravelPathEdgeTopLeftTile(int id) {
        super(Assets.gravelPath[5], id);
    }

    public GravelPathEdgeTopLeftTile(int id, String name) {
        super(Assets.gravelPath[5], id, name);
    }
}
