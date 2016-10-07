package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathLeftTile extends Tile{
    public LightGreyStonePathLeftTile(int id) {
        super(Assets.lightGreyStonePath[3], id);
    }

    public LightGreyStonePathLeftTile(int id, String name) {
        super(Assets.lightGreyStonePath[3], id, name);
    }
}
