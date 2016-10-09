package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeRightTile extends Tile {

    public GravelPathEdgeRightTile(int id) {
        super(Assets.gravelPath[4], id);
    }

    public GravelPathEdgeRightTile(int id, String name) {
        super(Assets.gravelPath[4], id, name);
    }
}
