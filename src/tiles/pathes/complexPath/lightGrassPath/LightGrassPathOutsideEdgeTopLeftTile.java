package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathOutsideEdgeTopLeftTile extends Tile {
    public LightGrassPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.lightGrassPath[9], id);
    }

    public LightGrassPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.lightGrassPath[9], id, name);
    }
}
