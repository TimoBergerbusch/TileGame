package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachOutsideEdgeBottomLeftTile extends Tile {
    public BeachOutsideEdgeBottomLeftTile(int id) {
        super(Assets.beachOutsideBottomLeftEdge, id);
    }

    public BeachOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.beachOutsideBottomLeftEdge, id, name);
    }
}
