package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeTopLeftTile extends Tile {
    public LightGrassPathEdgeTopLeftTile(int id) {
        super(Assets.lightGrassPath[5], id);
    }

    public LightGrassPathEdgeTopLeftTile(int id, String name) {
        super(Assets.lightGrassPath[5], id, name);
    }
}
