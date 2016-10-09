package tiles.pathes.complexPath.mudPath;

import gfx.Assets;
import tiles.Tile;

public class MudPathFullTile extends Tile {
    public MudPathFullTile(int id) {
        super(Assets.mudPath[0], id);
    }

    public MudPathFullTile(int id, String name) {
        super(Assets.mudPath[0], id, name);
    }
}