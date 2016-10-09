package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeBottomRightTile extends Tile {
    public LightGrassPathEdgeBottomRightTile(int id) {
        super(Assets.lightGrassPath[8], id);
    }

    public LightGrassPathEdgeBottomRightTile(int id, String name) {
        super(Assets.lightGrassPath[8], id, name);
    }
}
