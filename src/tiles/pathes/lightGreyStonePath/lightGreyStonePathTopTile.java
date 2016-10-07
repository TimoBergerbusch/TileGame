package tiles.pathes.lightGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class LightGreyStonePathTopTile extends Tile {
    public LightGreyStonePathTopTile(int id) {
        super(Assets.lightGreyStonePath[1], id);
//        super(Assets.lightStonePathTop, id);
    }

    public LightGreyStonePathTopTile(int id, String name) {
        super(Assets.lightGreyStonePath[1], id, name);
//        super(Assets.lightStonePathTop, id, name);
    }
}
