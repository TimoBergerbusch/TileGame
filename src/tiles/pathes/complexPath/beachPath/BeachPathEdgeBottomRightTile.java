package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeBottomRightTile extends Tile {
    public BeachPathEdgeBottomRightTile(int id) {
        super(Assets.beachPath[8], id);
    }

    public BeachPathEdgeBottomRightTile(int id, String name) {
        super(Assets.beachPath[8], id, name);
    }
}
