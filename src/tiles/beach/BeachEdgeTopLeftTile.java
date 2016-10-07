package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeTopLeftTile extends Tile {
    public BeachEdgeTopLeftTile(int id) {
        super(Assets.beachEdgeTopLeft, id);
    }

    public BeachEdgeTopLeftTile(int id, String name) {
        super(Assets.beachEdgeTopLeft, id, name);
    }
}
