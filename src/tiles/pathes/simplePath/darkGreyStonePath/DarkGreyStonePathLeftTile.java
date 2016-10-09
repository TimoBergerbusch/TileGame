package tiles.pathes.simplePath.darkGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class DarkGreyStonePathLeftTile extends Tile{
    public DarkGreyStonePathLeftTile(int id) {
        super(Assets.darkGreyStonePath[3], id);
    }

    public DarkGreyStonePathLeftTile(int id, String name) {
        super(Assets.darkGreyStonePath[3], id, name);
    }
}
