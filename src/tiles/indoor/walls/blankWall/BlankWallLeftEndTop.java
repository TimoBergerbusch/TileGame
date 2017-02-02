package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallLeftEndTop extends Tile {
    public BlankWallLeftEndTop(int id) {
        super(Assets.blankWallEndLeftTop, id);
    }

    public BlankWallLeftEndTop(int id, String name) {
        super(Assets.blankWallEndLeftTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

