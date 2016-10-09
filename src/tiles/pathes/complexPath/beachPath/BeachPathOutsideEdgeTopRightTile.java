package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathOutsideEdgeTopRightTile extends Tile {
    public BeachPathOutsideEdgeTopRightTile(int id) {
        super(Assets.beachPath[10], id);
    }

    public BeachPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.beachPath[10], id, name);
    }
}
