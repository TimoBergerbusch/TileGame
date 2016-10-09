package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeRightTile extends Tile {
    public PavingPathEdgeRightTile(int id) {
        super(Assets.pavingPath[4], id);
    }

    public PavingPathEdgeRightTile(int id, String name) {
        super(Assets.pavingPath[4], id, name);
    }
}
