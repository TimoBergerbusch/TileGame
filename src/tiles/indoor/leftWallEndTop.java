package tiles.indoor;

import gfx.*;
import tiles.*;

public class LeftWallEndTop extends Tile {
    public LeftWallEndTop(int id) {
        super(Assets.leftWallEndTop, id);
    }

    public LeftWallEndTop(int id, String name) {
        super(Assets.leftWallEndTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
