package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallEndRightBottom extends Tile {
    public WoodPlankWallEndRightBottom(int id) {
        super(Assets.woodPlankWallEndRightBottom, id);
    }

    public WoodPlankWallEndRightBottom(int id, String name) {
        super(Assets.woodPlankWallEndRightBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
