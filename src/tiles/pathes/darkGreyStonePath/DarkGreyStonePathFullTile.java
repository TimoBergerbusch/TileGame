package tiles.pathes.darkGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class DarkGreyStonePathFullTile extends Tile{
    public DarkGreyStonePathFullTile(int id) {
        super(Assets.darkGreyStonePath[0], id);
    }

    public DarkGreyStonePathFullTile(int id, String name) {
        super(Assets.darkGreyStonePath[0], id, name);
    }
}
