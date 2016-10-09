package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeBottomRightTile extends Tile {
    public GravelPathEdgeBottomRightTile(int id) {
        super(Assets.gravelPath[8], id);
    }

    public GravelPathEdgeBottomRightTile(int id, String name) {
        super(Assets.gravelPath[8], id, name);
    }
}
