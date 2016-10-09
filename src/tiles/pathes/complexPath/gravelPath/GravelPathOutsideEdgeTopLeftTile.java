package tiles.pathes.complexPath.gravelPath;

import gfx.Assets;
import tiles.Tile;

public class GravelPathOutsideEdgeTopLeftTile extends Tile {
    public GravelPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.gravelPath[9], id);
    }

    public GravelPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.gravelPath[9], id, name);
    }
}
