package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeLeftTile extends Tile {
    public PavingPathEdgeLeftTile(int id) {
        super(Assets.pavingPath[3], id);
    }

    public PavingPathEdgeLeftTile(int id, String name) {
        super(Assets.pavingPath[3], id, name);
    }
}
