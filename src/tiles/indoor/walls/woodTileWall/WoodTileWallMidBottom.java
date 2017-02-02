package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallMidBottom extends Tile {
    public WoodTileWallMidBottom(int id) {
        super(Assets.woodTileWallMidBottom, id);
    }

    public WoodTileWallMidBottom(int id, String name) {
        super(Assets.woodTileWallMidBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
