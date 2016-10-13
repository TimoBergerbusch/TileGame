package tiles.indoor;

import gfx.*;
import tiles.*;

public class WallEndMiddle extends Tile {
    public WallEndMiddle(int id) {
        super(Assets.wallEndMiddle, id);
    }

    public WallEndMiddle(int id, String name) {
        super(Assets.wallEndMiddle, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
