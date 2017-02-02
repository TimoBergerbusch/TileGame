package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallEndRightMid extends Tile {
    public WoodPlankWallEndRightMid(int id) {
        super(Assets.woodPlankWallEndRightMid, id);
    }

    public WoodPlankWallEndRightMid(int id, String name) {
        super(Assets.woodPlankWallEndRightMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
