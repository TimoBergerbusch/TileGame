package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;

public class MudPathEdgeLeftTile extends Tile {
    public MudPathEdgeLeftTile(int id) {
        super(Assets.mudPath[3], id);
    }

    public MudPathEdgeLeftTile(int id, String name) {
        super(Assets.mudPath[3], id, name);
    }
}