package tiles.indoor.walls.woodPlankWall;

import gfx.*;
import tiles.*;

public class WoodPlankWallLeftEndTop extends Tile {
    public WoodPlankWallLeftEndTop(int id) {
        super(Assets.woodPlankWallEndLeftTop, id);
    }

    public WoodPlankWallLeftEndTop(int id, String name) {
        super(Assets.woodPlankWallEndLeftTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

