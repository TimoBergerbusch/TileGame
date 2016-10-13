package tiles.indoor;

import gfx.*;
import tiles.*;

public class WallSideLeft extends Tile {
    public WallSideLeft(int id) {
        super(Assets.wallSideLeft, id);
    }

    public WallSideLeft(int id, String name) {
        super(Assets.wallSideLeft, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
