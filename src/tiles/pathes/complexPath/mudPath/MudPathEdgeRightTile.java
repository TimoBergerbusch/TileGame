package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;

public class MudPathEdgeRightTile extends Tile {
    public MudPathEdgeRightTile(int id) {
        super(Assets.mudPath[4], id);
    }

    public MudPathEdgeRightTile(int id, String name) {
        super(Assets.mudPath[4], id, name);
    }
}