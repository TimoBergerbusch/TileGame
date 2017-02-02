package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallMidMid extends Tile {
    public WoodPlankWallMidMid(int id) {
        super(Assets.woodPlankWallMidMid, id);
    }

    public WoodPlankWallMidMid(int id, String name) {
        super(Assets.woodPlankWallMidMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
