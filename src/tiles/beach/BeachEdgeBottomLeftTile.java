package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeBottomLeftTile extends Tile {
    public BeachEdgeBottomLeftTile(int id) {
        super(Assets.beachEdgeBottomLeft, id);
    }

    public BeachEdgeBottomLeftTile(int id, String name) {
        super(Assets.beachEdgeBottomLeft, id, name);
    }
}
