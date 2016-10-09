package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeTopLeftTile extends Tile {
    public BeachPathEdgeTopLeftTile(int id) {
        super(Assets.beachPath[5], id);
    }

    public BeachPathEdgeTopLeftTile(int id, String name) {
        super(Assets.beachPath[5], id, name);
    }
}
