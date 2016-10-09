package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeBottomLeftTile extends Tile {
    public DirtPathEdgeBottomLeftTile(int id) {
        super(Assets.dirtPath[7], id);
    }

    public DirtPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.dirtPath[7], id, name);
    }
}
