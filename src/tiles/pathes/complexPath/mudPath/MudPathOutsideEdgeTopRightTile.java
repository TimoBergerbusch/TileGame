package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;


public class MudPathOutsideEdgeTopRightTile extends Tile {
    public MudPathOutsideEdgeTopRightTile(int id) {
        super(Assets.mudPath[10], id);
    }

    public MudPathOutsideEdgeTopRightTile(int id, String name) {
        super(Assets.mudPath[10], id, name);
    }
}