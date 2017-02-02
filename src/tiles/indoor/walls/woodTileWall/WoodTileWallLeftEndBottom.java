package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallLeftEndBottom extends Tile {
    public WoodTileWallLeftEndBottom(int id) {
        super(Assets.woodTileWallEndLeftBottom, id);
    }

    public WoodTileWallLeftEndBottom(int id, String name) {
        super(Assets.woodTileWallEndLeftBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
