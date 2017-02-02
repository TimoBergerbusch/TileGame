package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallLeftEndMid extends Tile {
    public WoodPlankWallLeftEndMid(int id) {
        super(Assets.woodPlankWallEndLeftMid, id);
    }

    public WoodPlankWallLeftEndMid(int id, String name) {
        super(Assets.woodPlankWallEndLeftMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
