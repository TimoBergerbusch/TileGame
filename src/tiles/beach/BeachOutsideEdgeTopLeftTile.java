package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachOutsideEdgeTopLeftTile extends Tile {
    public BeachOutsideEdgeTopLeftTile(int id) {
        super(Assets.beachOutsideTopLeftEdge, id);
    }

    public BeachOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.beachOutsideTopLeftEdge, id, name);
    }
}
