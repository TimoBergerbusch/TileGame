package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachEdgeBottomTile extends Tile {
    public BeachEdgeBottomTile(int id) {
        super(Assets.beachEdgeBottom, id);
    }

    public BeachEdgeBottomTile(int id, String name) {
        super(Assets.beachEdgeBottom, id, name);
    }
}
