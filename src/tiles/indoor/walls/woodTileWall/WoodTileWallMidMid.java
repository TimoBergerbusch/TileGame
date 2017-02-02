package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallMidMid extends Tile {
    public WoodTileWallMidMid(int id) {
        super(Assets.woodTileWallMidMid, id);
    }

    public WoodTileWallMidMid(int id, String name) {
        super(Assets.woodTileWallMidMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
