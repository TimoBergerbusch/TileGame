package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeTopRightTile extends Tile {
    public GravelPathEdgeTopRightTile(int id) {
        super(Assets.gravelPath[6], id);
    }

    public GravelPathEdgeTopRightTile(int id, String name) {
        super(Assets.gravelPath[6], id, name);
    }
}
