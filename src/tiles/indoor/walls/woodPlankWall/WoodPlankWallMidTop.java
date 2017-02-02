package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallMidTop extends Tile {
    public WoodPlankWallMidTop(int id) {
        super(Assets.woodPlankWallMidTop, id);
    }

    public WoodPlankWallMidTop(int id, String name) {
        super(Assets.woodPlankWallMidTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
