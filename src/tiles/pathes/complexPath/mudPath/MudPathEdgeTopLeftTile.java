package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;

public class MudPathEdgeTopLeftTile extends Tile {
    public MudPathEdgeTopLeftTile(int id) {
        super(Assets.mudPath[5], id);
    }

    public MudPathEdgeTopLeftTile(int id, String name) {
        super(Assets.mudPath[5], id, name);
    }
}