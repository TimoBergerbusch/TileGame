package tiles.beach;

import gfx.Assets;
import tiles.Tile;

public class BeachOutsideEdgeBottomRightTile extends Tile {
    public BeachOutsideEdgeBottomRightTile(int id) {
        super(Assets.beachOutsideBottomRightEdge, id);
    }

    public BeachOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.beachOutsideBottomRightEdge, id, name);
    }
}
