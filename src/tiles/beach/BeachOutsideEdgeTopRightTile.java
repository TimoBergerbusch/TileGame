package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachOutsideEdgeTopRightTile extends Tile {
    public BeachOutsideEdgeTopRightTile(int id) {
        super(Assets.beachOutsideTopRightEdge, id);
    }

    public BeachOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.beachOutsideTopRightEdge, id, name);
    }
}
