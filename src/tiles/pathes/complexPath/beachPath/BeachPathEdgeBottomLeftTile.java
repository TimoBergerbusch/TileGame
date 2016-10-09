package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeBottomLeftTile extends Tile {
    public BeachPathEdgeBottomLeftTile(int id) {
        super(Assets.beachPath[7], id);
    }

    public BeachPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.beachPath[7], id, name);
    }
}
