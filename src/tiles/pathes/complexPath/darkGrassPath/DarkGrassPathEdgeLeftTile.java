package tiles.pathes.complexPath.darkGrassPath;

import gfx.Assets;
import tiles.Tile;

public class DarkGrassPathEdgeLeftTile extends Tile {
    public DarkGrassPathEdgeLeftTile(int id) {
        super(Assets.darkGrassPath[3], id);
    }

    public DarkGrassPathEdgeLeftTile(int id, String name) {
        super(Assets.darkGrassPath[3], id, name);
    }
}
