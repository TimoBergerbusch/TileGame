package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeTopRightTile extends Tile {
    public LightGrassPathEdgeTopRightTile(int id) {
        super(Assets.lightGrassPath[6], id);
    }

    public LightGrassPathEdgeTopRightTile(int id, String name) {
        super(Assets.lightGrassPath[6], id, name);
    }
}
