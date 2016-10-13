package tiles.indoor;

import gfx.*;
import tiles.*;

public class RightWallEndTop extends Tile {
    public RightWallEndTop(int id) {
        super(Assets.rightWallEndTop, id);
    }

    public RightWallEndTop(int id, String name) {
        super(Assets.rightWallEndTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
