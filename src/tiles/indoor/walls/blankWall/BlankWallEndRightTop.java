package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallEndRightTop extends Tile {
    public BlankWallEndRightTop(int id) {
        super(Assets.blankWallEndRightTop, id);
    }

    public BlankWallEndRightTop(int id, String name) {
        super(Assets.blankWallEndRightTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
