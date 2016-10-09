package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathOutsideEdgeBottomRightTile extends Tile {
    public BeachPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.beachPath[12], id);
    }

    public BeachPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.beachPath[12], id, name);
    }
}
