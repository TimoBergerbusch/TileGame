package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeTopRightTile extends Tile {
    public BeachPathEdgeTopRightTile(int id) {
        super(Assets.beachPath[6], id);
    }

    public BeachPathEdgeTopRightTile(int id, String name) {
        super(Assets.beachPath[6], id, name);
    }
}
