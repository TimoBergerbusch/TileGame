package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathOutsideEdgeBottomRightTile extends Tile {
    public DirtPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.dirtPath[12], id);
    }

    public DirtPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.dirtPath[12], id, name);
    }
}
