package tiles.pathes.complexPath.pavingPath;

import gfx.Assets;
import tiles.Tile;

public class PavingPathEdgeBottomLeftTile extends Tile {
    public PavingPathEdgeBottomLeftTile(int id) {
        super(Assets.pavingPath[7], id);
    }

    public PavingPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.pavingPath[7], id, name);
    }
}
