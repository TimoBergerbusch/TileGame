package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeBottomTile extends Tile {
    public PavingPathEdgeBottomTile(int id) {
        super(Assets.pavingPath[2], id);
    }

    public PavingPathEdgeBottomTile(int id, String name) {
        super(Assets.pavingPath[2], id, name);
    }
}
