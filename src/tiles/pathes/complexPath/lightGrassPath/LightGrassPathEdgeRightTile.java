package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeRightTile extends Tile {
    public LightGrassPathEdgeRightTile(int id) {
        super(Assets.lightGrassPath[4], id);
    }

    public LightGrassPathEdgeRightTile(int id, String name) {
        super(Assets.lightGrassPath[4], id, name);
    }
}
