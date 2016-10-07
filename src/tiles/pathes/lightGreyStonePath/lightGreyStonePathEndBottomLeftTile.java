package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathEndBottomLeftTile extends Tile {
    public LightGreyStonePathEndBottomLeftTile(int id) {
        super(Assets.lightGreyStonePath[7], id);
//        super(Assets.lightStonePathEndBottomLeft, id);
    }

    public LightGreyStonePathEndBottomLeftTile(int id, String name) {
        super(Assets.lightGreyStonePath[7], id, name);
//        super(Assets.lightStonePathEndBottomLeft, id, name);
    }
}
