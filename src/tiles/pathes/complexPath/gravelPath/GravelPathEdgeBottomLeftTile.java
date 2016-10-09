package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathEdgeBottomLeftTile extends Tile {
    public GravelPathEdgeBottomLeftTile(int id) {
        super(Assets.gravelPath[7], id);
    }

    public GravelPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.gravelPath[7], id, name);
    }
}
