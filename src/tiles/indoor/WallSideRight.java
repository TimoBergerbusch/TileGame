package tiles.indoor;

import gfx.*;
import tiles.*;

public class WallSideRight extends Tile {
    public WallSideRight(int id) {
        super(Assets.wallSideRight, id);
    }

    public WallSideRight(int id, String name) {
        super(Assets.wallSideRight, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
