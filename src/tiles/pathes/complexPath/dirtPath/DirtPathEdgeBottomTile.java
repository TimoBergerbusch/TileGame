package tiles.pathes.complexPath.dirtPath;

import gfx.Assets;
import tiles.Tile;

public class DirtPathEdgeBottomTile extends Tile {
    public DirtPathEdgeBottomTile(int id) {
        super(Assets.dirtPath[2], id);
    }

    public DirtPathEdgeBottomTile(int id, String name) {
        super(Assets.dirtPath[2], id, name);
    }
}
