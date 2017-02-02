package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallLeftEndMid extends Tile {
    public BlankWallLeftEndMid(int id) {
        super(Assets.blankWallEndLeftMid, id);
    }

    public BlankWallLeftEndMid(int id, String name) {
        super(Assets.blankWallEndLeftMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
