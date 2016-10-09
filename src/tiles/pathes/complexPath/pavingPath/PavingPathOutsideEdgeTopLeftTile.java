package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathOutsideEdgeTopLeftTile extends Tile {
    public PavingPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.pavingPath[9], id);
    }

    public PavingPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.pavingPath[9], id, name);
    }
}
