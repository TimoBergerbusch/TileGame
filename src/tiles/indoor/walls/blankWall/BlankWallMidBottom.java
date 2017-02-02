package tiles.indoor.walls.blankWall;

import gfx.*;
import tiles.*;

public class BlankWallMidBottom extends Tile {
    public BlankWallMidBottom(int id) {
        super(Assets.blankWallMidBottom, id);
    }

    public BlankWallMidBottom(int id, String name) {
        super(Assets.blankWallMidBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
