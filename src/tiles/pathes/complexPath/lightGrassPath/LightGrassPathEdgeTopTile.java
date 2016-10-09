package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeTopTile extends Tile {
    public LightGrassPathEdgeTopTile(int id) {
        super(Assets.lightGrassPath[1], id);
    }

    public LightGrassPathEdgeTopTile(int id, String name) {
        super(Assets.lightGrassPath[1], id, name);
    }
}
