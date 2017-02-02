package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallLeftEndBottom extends Tile {
    public BlankWallLeftEndBottom(int id) {
        super(Assets.blankWallEndLeftBottom, id);
    }

    public BlankWallLeftEndBottom(int id, String name) {
        super(Assets.blankWallEndLeftBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
