package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallLeftEndMid extends Tile {
    public WoodTileWallLeftEndMid(int id) {
        super(Assets.woodTileWallEndLeftMid, id);
    }

    public WoodTileWallLeftEndMid(int id, String name) {
        super(Assets.woodTileWallEndLeftMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
