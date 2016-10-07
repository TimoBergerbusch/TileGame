package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeTopTile extends Tile {
    public BeachEdgeTopTile(int id) {
        super(Assets.beachEdgeTop, id);
    }

    public BeachEdgeTopTile(int id, String name) {
        super(Assets.beachEdgeTop, id, name);
    }
}
