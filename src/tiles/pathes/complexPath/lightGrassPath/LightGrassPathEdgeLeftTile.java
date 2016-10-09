package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeLeftTile extends Tile {
    public LightGrassPathEdgeLeftTile(int id) {
        super(Assets.lightGrassPath[3], id);
    }

    public LightGrassPathEdgeLeftTile(int id, String name) {
        super(Assets.lightGrassPath[3], id, name);
    }
}
