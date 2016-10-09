package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathOutsideEdgeBottomLeftTile extends Tile {
    public DirtPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.dirtPath[11], id);
    }

    public DirtPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.dirtPath[11], id, name);
    }
}
