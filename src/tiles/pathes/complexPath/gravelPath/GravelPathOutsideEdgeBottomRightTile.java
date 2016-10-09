package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathOutsideEdgeBottomRightTile extends Tile {
    public GravelPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.gravelPath[12], id);
    }

    public GravelPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.gravelPath[12], id, name);
    }
}
