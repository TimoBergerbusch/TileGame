package tiles.pathes.simplePath.darkGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class DarkGreyStonePathBottomTile extends Tile{
    public DarkGreyStonePathBottomTile(int id) {
        super(Assets.darkGreyStonePath[2], id);
    }

    public DarkGreyStonePathBottomTile(int id, String name) {
        super(Assets.darkGreyStonePath[2], id, name);
    }
}
