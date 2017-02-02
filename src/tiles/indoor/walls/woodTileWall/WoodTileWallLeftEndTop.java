package tiles.indoor.walls.woodTileWall;

import gfx.*;
import tiles.*;

public class WoodTileWallLeftEndTop extends Tile {
    public WoodTileWallLeftEndTop(int id) {
        super(Assets.woodTileWallEndLeftTop, id);
    }

    public WoodTileWallLeftEndTop(int id, String name) {
        super(Assets.woodTileWallEndLeftTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

