package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;


public class MudPathOutsideEdgeTopLeftTile extends Tile {
    public MudPathOutsideEdgeTopLeftTile(int id) {
        super(Assets.mudPath[9], id);
    }

    public MudPathOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.mudPath[9], id, name);
    }
}