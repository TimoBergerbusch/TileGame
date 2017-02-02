package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallMidTop extends Tile {
    public BlankWallMidTop(int id) {
        super(Assets.blankWallMidTop, id);
    }

    public BlankWallMidTop(int id, String name) {
        super(Assets.blankWallMidTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
