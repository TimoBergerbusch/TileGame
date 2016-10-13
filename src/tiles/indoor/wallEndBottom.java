package tiles.indoor;

import gfx.*;
import tiles.*;

public class WallEndBottom extends Tile {
    public WallEndBottom(int id) {
        super(Assets.wallEndBottom, id);
    }

    public WallEndBottom(int id, String name) {
        super(Assets.wallEndBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
