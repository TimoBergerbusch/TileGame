package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeRightTile extends Tile {

    public BeachPathEdgeRightTile(int id) {
        super(Assets.beachPath[4], id);
    }

    public BeachPathEdgeRightTile(int id, String name) {
        super(Assets.beachPath[4], id, name);
    }
}
