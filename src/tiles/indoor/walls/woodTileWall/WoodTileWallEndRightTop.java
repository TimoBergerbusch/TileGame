package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallEndRightTop extends Tile {
    public WoodTileWallEndRightTop(int id) {
        super(Assets.woodTileWallEndRightTop, id);
    }

    public WoodTileWallEndRightTop(int id, String name) {
        super(Assets.woodTileWallEndRightTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
