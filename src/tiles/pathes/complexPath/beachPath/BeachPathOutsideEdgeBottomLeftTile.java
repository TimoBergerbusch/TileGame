package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathOutsideEdgeBottomLeftTile extends Tile {
    public BeachPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.beachPath[11], id);
    }

    public BeachPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.beachPath[11], id, name);
    }
}
