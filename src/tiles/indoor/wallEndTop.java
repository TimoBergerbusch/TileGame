package tiles.indoor;

import gfx.*;
import tiles.*;

public class WallEndTop extends Tile {
    public WallEndTop(int id) {
        super(Assets.wallEndTop, id);
    }

    public WallEndTop(int id, String name) {
        super(Assets.wallEndTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
