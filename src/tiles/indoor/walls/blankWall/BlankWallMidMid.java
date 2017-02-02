package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallMidMid extends Tile {
    public BlankWallMidMid(int id) {
        super(Assets.blankWallMidMid, id);
    }

    public BlankWallMidMid(int id, String name) {
        super(Assets.blankWallMidMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
