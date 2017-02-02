package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallMidBottom extends Tile {
    public WoodPlankWallMidBottom(int id) {
        super(Assets.woodPlankWallMidBottom, id);
    }

    public WoodPlankWallMidBottom(int id, String name) {
        super(Assets.woodPlankWallMidBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
