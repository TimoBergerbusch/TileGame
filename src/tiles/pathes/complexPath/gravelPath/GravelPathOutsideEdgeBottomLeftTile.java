package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathOutsideEdgeBottomLeftTile extends Tile {
    public GravelPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.gravelPath[11], id);
    }

    public GravelPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.gravelPath[11], id, name);
    }
}
