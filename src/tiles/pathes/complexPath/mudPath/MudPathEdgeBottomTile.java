package tiles.pathes.complexPath.mudPath;

import tiles.Tile;
import gfx.Assets;

public class MudPathEdgeBottomTile extends Tile {
    public MudPathEdgeBottomTile(int id) {
        super(Assets.mudPath[2], id);
    }

    public MudPathEdgeBottomTile(int id, String name) {
        super(Assets.mudPath[2], id, name);
    }
}