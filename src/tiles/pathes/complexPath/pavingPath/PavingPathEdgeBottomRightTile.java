package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeBottomRightTile extends Tile {
    public PavingPathEdgeBottomRightTile(int id) {
        super(Assets.pavingPath[8], id);
    }

    public PavingPathEdgeBottomRightTile(int id, String name) {
        super(Assets.pavingPath[8], id, name);
    }
}
