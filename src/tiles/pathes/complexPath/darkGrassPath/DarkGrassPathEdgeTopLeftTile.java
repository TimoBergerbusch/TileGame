package tiles.pathes.complexPath.darkGrassPath;

import gfx.Assets;
import tiles.Tile;

public class DarkGrassPathEdgeTopLeftTile extends Tile {
    public DarkGrassPathEdgeTopLeftTile(int id) {
        super(Assets.darkGrassPath[5], id);
    }

    public DarkGrassPathEdgeTopLeftTile(int id, String name) {
        super(Assets.darkGrassPath[5], id, name);
    }
}
