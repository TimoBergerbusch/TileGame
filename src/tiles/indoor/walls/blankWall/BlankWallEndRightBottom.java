package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallEndRightBottom extends Tile {
    public BlankWallEndRightBottom(int id) {
        super(Assets.blankWallEndRightBottom, id);
    }

    public BlankWallEndRightBottom(int id, String name) {
        super(Assets.blankWallEndRightBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
