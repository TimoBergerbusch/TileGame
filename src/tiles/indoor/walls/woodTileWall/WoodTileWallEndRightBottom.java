package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallEndRightBottom extends Tile {
    public WoodTileWallEndRightBottom(int id) {
        super(Assets.woodTileWallEndRightBottom, id);
    }

    public WoodTileWallEndRightBottom(int id, String name) {
        super(Assets.woodTileWallEndRightBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
