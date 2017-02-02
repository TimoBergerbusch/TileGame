package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallLeftEndBottom extends Tile {
    public WoodPlankWallLeftEndBottom(int id) {
        super(Assets.woodPlankWallEndLeftBottom, id);
    }

    public WoodPlankWallLeftEndBottom(int id, String name) {
        super(Assets.woodPlankWallEndLeftBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
