package tiles.pathes.complexPath.darkGrassPath;

import gfx.Assets;
import tiles.Tile;

public class DarkGrassPathEdgeBottomTile extends Tile {
    public DarkGrassPathEdgeBottomTile(int id) {
        super(Assets.darkGrassPath[2], id);
    }

    public DarkGrassPathEdgeBottomTile(int id, String name) {
        super(Assets.darkGrassPath[2], id, name);
    }
}
