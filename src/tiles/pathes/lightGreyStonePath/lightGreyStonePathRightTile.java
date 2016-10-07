package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathRightTile extends Tile {
    public LightGreyStonePathRightTile(int id) {
        super(Assets.lightGreyStonePath[4], id);
//        super(Assets.lightStonePathRight, id);
    }

    public LightGreyStonePathRightTile(int id, String name) {
        super(Assets.lightGreyStonePath[4], id, name);
//        super(Assets.lightStonePathRight, id, name);
    }
}
