package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathOutsideEdgeTopRightTile extends Tile {
    public PavingPathOutsideEdgeTopRightTile(int id) {
        super(Assets.pavingPath[10], id);
    }

    public PavingPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.pavingPath[10], id, name);
    }
}
