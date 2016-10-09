package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;


public class MudPathEdgeBottomRightTile extends Tile {
    public MudPathEdgeBottomRightTile(int id) {
        super(Assets.mudPath[8], id);
    }

    public MudPathEdgeBottomRightTile(int id, String name) {
        super(Assets.mudPath[8], id, name);
    }
}