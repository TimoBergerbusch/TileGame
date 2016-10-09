package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathOutsideEdgeTopLeftTile extends Tile {
    public DirtPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.dirtPath[9], id);
    }

    public DirtPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.dirtPath[9], id, name);
    }
}
