package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathOutsideEdgeBottomRightTile extends Tile {
    public PavingPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.pavingPath[12], id);
    }

    public PavingPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.pavingPath[12], id, name);
    }
}
