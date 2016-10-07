package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathEndTopLeftTile extends Tile{
    public LightGreyStonePathEndTopLeftTile(int id) {
        super(Assets.lightGreyStonePath[5], id);
//        super(Assets.lightStonePathEndTopLeft, id);
    }

    public LightGreyStonePathEndTopLeftTile(int id, String name) {
        super(Assets.lightGreyStonePath[5], id, name);
//        super(Assets.lightStonePathEndTopLeft, id, name);
    }
}
