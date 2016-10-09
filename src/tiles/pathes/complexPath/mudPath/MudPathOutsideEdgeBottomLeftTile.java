package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;


public class MudPathOutsideEdgeBottomLeftTile extends Tile {
    public MudPathOutsideEdgeBottomLeftTile(int id) {
        super(Assets.mudPath[11], id);
    }

    public MudPathOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.mudPath[11], id, name);
    }
}