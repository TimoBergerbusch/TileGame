package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeBottomRightTile extends Tile {
    public DirtPathEdgeBottomRightTile(int id) {
        super(Assets.dirtPath[8], id);
    }

    public DirtPathEdgeBottomRightTile(int id, String name) {
        super(Assets.dirtPath[8], id, name);
    }
}
