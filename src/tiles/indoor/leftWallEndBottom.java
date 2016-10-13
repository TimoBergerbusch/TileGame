package tiles.indoor;

import gfx.*;
import tiles.*;

public class LeftWallEndBottom extends Tile {
    public LeftWallEndBottom(int id) {
        super(Assets.leftWallEndBottom, id);
    }

    public LeftWallEndBottom(int id, String name) {
        super(Assets.leftWallEndBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
