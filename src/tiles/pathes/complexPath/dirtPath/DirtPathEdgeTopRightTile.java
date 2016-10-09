package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeTopRightTile extends Tile {
    public DirtPathEdgeTopRightTile(int id) {
        super(Assets.dirtPath[6], id);
    }

    public DirtPathEdgeTopRightTile(int id, String name) {
        super(Assets.dirtPath[6], id, name);
    }
}
