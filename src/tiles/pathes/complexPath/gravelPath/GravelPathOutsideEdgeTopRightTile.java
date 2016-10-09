package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathOutsideEdgeTopRightTile extends Tile {
    public GravelPathOutsideEdgeTopRightTile(int id) {
        super(Assets.gravelPath[10], id);
    }

    public GravelPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.gravelPath[10], id, name);
    }
}
