package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathOutsideEdgeBottomLeftTile extends Tile {
    public PavingPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.pavingPath[11], id);
    }

    public PavingPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.pavingPath[11], id, name);
    }
}
