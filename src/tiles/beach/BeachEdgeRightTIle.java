package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeRightTile extends Tile {

    public BeachEdgeRightTile(int id) {
        super(Assets.beachEdgeRight, id);
    }

    public BeachEdgeRightTile(int id, String name) {
        super(Assets.beachEdgeRight, id, name);
    }
}
