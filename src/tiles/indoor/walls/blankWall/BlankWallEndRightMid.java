package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallEndRightMid extends Tile {
    public BlankWallEndRightMid(int id) {
        super(Assets.blankWallEndRightMid, id);
    }

    public BlankWallEndRightMid(int id, String name) {
        super(Assets.blankWallEndRightMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
