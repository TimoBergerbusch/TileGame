package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeLeftTile extends Tile {
    public BeachEdgeLeftTile(int id, String name) {
        super(Assets.beachEdgeLeft, id, name);
    }

    public BeachEdgeLeftTile(int id) {
        super(Assets.beachEdgeLeft, id);
    }
}
