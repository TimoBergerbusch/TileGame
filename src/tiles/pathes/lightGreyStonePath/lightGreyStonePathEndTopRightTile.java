package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathEndTopRightTile extends Tile {
    public LightGreyStonePathEndTopRightTile(int id) {
        super(Assets.lightGreyStonePath[6], id);
//        super(Assets.lightStonePathEndTopRight, id);
    }

    public LightGreyStonePathEndTopRightTile(int id, String name) {
        super(Assets.lightGreyStonePath[6], id, name);
//        super(Assets.lightStonePathEndTopRight, id, name);
    }
}
