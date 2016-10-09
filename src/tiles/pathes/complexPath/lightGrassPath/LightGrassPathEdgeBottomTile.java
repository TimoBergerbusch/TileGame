package tiles.pathes.complexPath.lightGrassPath;

import gfx.Assets;
import tiles.Tile;

public class LightGrassPathEdgeBottomTile extends Tile {
    public LightGrassPathEdgeBottomTile(int id) {
        super(Assets.lightGrassPath[2], id);
    }

    public LightGrassPathEdgeBottomTile(int id, String name) {
        super(Assets.lightGrassPath[2], id, name);
    }
}
