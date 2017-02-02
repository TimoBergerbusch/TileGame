package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallEndRightTop extends Tile {
    public WoodPlankWallEndRightTop(int id) {
        super(Assets.woodPlankWallEndRightTop, id);
    }

    public WoodPlankWallEndRightTop(int id, String name) {
        super(Assets.woodPlankWallEndRightTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
