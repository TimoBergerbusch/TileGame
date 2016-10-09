package tiles.pathes.simplePath.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathFullTile extends Tile{
    public LightGreyStonePathFullTile(int id) {
        super(Assets.lightGreyStonePath[0], id);
//        super(Assets.lightStonePathFull, id);
    }

    public LightGreyStonePathFullTile(int id, String name) {
        super(Assets.lightGreyStonePath[0], id, name);
//        super(Assets.lightStonePathFull, id, name);
    }
}
