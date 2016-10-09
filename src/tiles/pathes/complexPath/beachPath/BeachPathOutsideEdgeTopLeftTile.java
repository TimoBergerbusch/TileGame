package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathOutsideEdgeTopLeftTile extends Tile {
    public BeachPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.beachPath[9], id);
    }

    public BeachPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.beachPath[9], id, name);
    }
}
