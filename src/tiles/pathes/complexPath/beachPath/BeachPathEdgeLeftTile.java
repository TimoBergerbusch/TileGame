package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeLeftTile extends Tile {
    public BeachPathEdgeLeftTile(int id, String name) {
        super(Assets.beachPath[3], id, name);
    }

    public BeachPathEdgeLeftTile(int id) {
        super(Assets.beachPath[3], id);
    }
}
