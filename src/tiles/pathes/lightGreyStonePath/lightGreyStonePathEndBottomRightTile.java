package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathEndBottomRightTile extends Tile {
    public LightGreyStonePathEndBottomRightTile(int id) {
        super(Assets.lightGreyStonePath[8], id);
//        super(Assets.lightStonePathEndBottomRight, id);
    }

    public LightGreyStonePathEndBottomRightTile(int id, String name) {
        super(Assets.lightGreyStonePath[8], id, name);
//        super(Assets.lightStonePathEndBottomRight, id, name);
    }
}
