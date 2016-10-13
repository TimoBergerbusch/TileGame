package tiles.indoor;

import gfx.*;
import tiles.*;

public class RightWallEndBottom extends Tile {
    public RightWallEndBottom(int id) {
        super(Assets.rightWallEndBottom, id);
    }

    public RightWallEndBottom(int id, String name) {
        super(Assets.rightWallEndBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
