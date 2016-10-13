package tiles.indoor;

import gfx.*;
import tiles.*;

public class RightWallEndMiddle extends Tile {
    public RightWallEndMiddle(int id) {
        super(Assets.rightWallEndMiddle, id);
    }

    public RightWallEndMiddle(int id, String name) {
        super(Assets.rightWallEndMiddle, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
