package tiles.pathes.simplePath.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathBottomTile extends Tile{
    public LightGreyStonePathBottomTile(int id) {
//        super(Assets.lightStonePathBottom, id);
        super(Assets.lightGreyStonePath[2], id);
    }

    public LightGreyStonePathBottomTile(int id, String name) {
        super(Assets.lightGreyStonePath[2], id, name);
//        super(Assets.lightStonePathBottom, id, name);
    }
}
