package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeTopTile extends Tile {
    public GravelPathEdgeTopTile(int id) {
        super(Assets.gravelPath[1], id);
    }

    public GravelPathEdgeTopTile(int id, String name) {
        super(Assets.gravelPath[1], id, name);
    }
}
