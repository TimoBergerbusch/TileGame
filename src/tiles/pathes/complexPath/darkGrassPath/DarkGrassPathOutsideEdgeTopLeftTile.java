package tiles.pathes.complexPath.darkGrassPath;

import gfx.Assets;
import tiles.Tile;

public class DarkGrassPathOutsideEdgeTopLeftTile extends Tile {
    public DarkGrassPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.darkGrassPath[9], id);
    }

    public DarkGrassPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.darkGrassPath[9], id, name);
    }
}
