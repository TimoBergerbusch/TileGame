package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeBottomRightTile extends Tile {
    public BeachEdgeBottomRightTile(int id) {
        super(Assets.beachEdgeBottomRight, id);
    }

    public BeachEdgeBottomRightTile(int id, String name) {
        super(Assets.beachEdgeBottomRight, id, name);
    }
}
