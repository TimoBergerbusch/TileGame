package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeBottomTile extends Tile {
    public GravelPathEdgeBottomTile(int id) {
        super(Assets.gravelPath[2], id);
    }

    public GravelPathEdgeBottomTile(int id, String name) {
        super(Assets.gravelPath[2], id, name);
    }
}
