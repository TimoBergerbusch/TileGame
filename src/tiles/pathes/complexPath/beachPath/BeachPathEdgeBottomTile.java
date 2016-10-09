package tiles.pathes.complexPath.beachPath;

import gfx.Assets;
import tiles.Tile;

public class BeachPathEdgeBottomTile extends Tile {
    public BeachPathEdgeBottomTile(int id) {
        super(Assets.beachPath[2], id);
    }

    public BeachPathEdgeBottomTile(int id, String name) {
        super(Assets.beachPath[2], id, name);
    }
}
