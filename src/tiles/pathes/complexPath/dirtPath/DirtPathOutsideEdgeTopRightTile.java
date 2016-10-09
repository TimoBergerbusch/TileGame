package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathOutsideEdgeTopRightTile extends Tile {
    public DirtPathOutsideEdgeTopRightTile(int id) {
        super(Assets.dirtPath[10], id);
    }

    public DirtPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.dirtPath[10], id, name);
    }
}
