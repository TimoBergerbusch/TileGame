package tiles.pathes.complexPath.mudPath;

import gfx.Assets;
import tiles.Tile;


public class MudPathOutsideEdgeBottomRightTile extends Tile {
    public MudPathOutsideEdgeBottomRightTile(int id) {
        super(Assets.mudPath[12], id);
    }

    public MudPathOutsideEdgeBottomRightTile(int id, String name) {
        super(Assets.mudPath[12], id, name);
    }
}