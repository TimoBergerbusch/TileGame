package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeTopTile extends Tile {
    public PavingPathEdgeTopTile(int id) {
        super(Assets.pavingPath[1], id);
    }

    public PavingPathEdgeTopTile(int id, String name) {
        super(Assets.pavingPath[1], id, name);
    }
}
