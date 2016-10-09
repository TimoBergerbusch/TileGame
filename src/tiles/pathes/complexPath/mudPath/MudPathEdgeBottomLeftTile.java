package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;


public class MudPathEdgeBottomLeftTile extends Tile {
    public MudPathEdgeBottomLeftTile(int id) {
        super(Assets.mudPath[7], id);
    }

    public MudPathEdgeBottomLeftTile(int id, String name) {
        super(Assets.mudPath[7], id, name);
    }
}