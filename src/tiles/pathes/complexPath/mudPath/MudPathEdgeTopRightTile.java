package tiles.pathes.complexPath.mudPath;

import gfx.Assets;
import tiles.Tile;

public class MudPathEdgeTopRightTile extends Tile {
    public MudPathEdgeTopRightTile(int id) {
        super(Assets.mudPath[6], id);
    }

    public MudPathEdgeTopRightTile(int id, String name) {
        super(Assets.mudPath[6], id, name);
    }
}