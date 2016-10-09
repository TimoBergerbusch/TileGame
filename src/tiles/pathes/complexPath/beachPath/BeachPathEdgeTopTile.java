package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeTopTile extends Tile {
    public BeachPathEdgeTopTile(int id) {
        super(Assets.beachPath[1], id);
    }

    public BeachPathEdgeTopTile(int id, String name) {
        super(Assets.beachPath[1], id, name);
    }
}
