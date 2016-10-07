package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeTopRightTile extends Tile {
    public BeachEdgeTopRightTile(int id) {
        super(Assets.beachEdgeTopRight, id);
    }

    public BeachEdgeTopRightTile(int id, String name) {
        super(Assets.beachEdgeTopRight, id, name);
    }
}
