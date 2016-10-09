package tiles.pathes.complexPath.darkGrassPath;

import gfx.Assets;
import tiles.Tile;

public class DarkGrassPathEdgeTopTile extends Tile {
    public DarkGrassPathEdgeTopTile(int id) {
        super(Assets.darkGrassPath[1], id);
    }

    public DarkGrassPathEdgeTopTile(int id, String name) {
        super(Assets.darkGrassPath[1], id, name);
    }
}
