package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeTopRightTile extends Tile {
    public PavingPathEdgeTopRightTile(int id) {
        super(Assets.pavingPath[6], id);
    }

    public PavingPathEdgeTopRightTile(int id, String name) {
        super(Assets.pavingPath[6], id, name);
    }
}
