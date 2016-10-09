package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeTopLeftTile extends Tile {
    public PavingPathEdgeTopLeftTile(int id) {
        super(Assets.pavingPath[5], id);
    }

    public PavingPathEdgeTopLeftTile(int id, String name) {
        super(Assets.pavingPath[5], id, name);
    }
}
