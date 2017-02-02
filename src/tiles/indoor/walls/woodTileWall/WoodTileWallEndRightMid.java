package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallEndRightMid extends Tile {
    public WoodTileWallEndRightMid(int id) {
        super(Assets.woodTileWallEndRightMid, id);
    }

    public WoodTileWallEndRightMid(int id, String name) {
        super(Assets.woodTileWallEndRightMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
