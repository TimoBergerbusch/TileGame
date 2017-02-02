package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallMidTop extends Tile {
    public WoodTileWallMidTop(int id) {
        super(Assets.woodTileWallMidTop, id);
    }

    public WoodTileWallMidTop(int id, String name) {
        super(Assets.woodTileWallMidTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
