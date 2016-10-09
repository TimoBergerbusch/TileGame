package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;

public class MudPathEdgeTopTile extends Tile {
    public MudPathEdgeTopTile(int id) {
        super(Assets.mudPath[1], id);
    }

    public MudPathEdgeTopTile(int id, String name) {
        super(Assets.mudPath[1], id, name);
    }
}