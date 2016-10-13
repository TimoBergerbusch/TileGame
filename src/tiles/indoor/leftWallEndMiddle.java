package tiles.indoor;

import gfx.*;
import tiles.*;

public class LeftWallEndMiddle extends Tile {
    public LeftWallEndMiddle(int id) {
        super(Assets.leftWallEndMiddle, id);
    }

    public LeftWallEndMiddle(int id, String name) {
        super(Assets.leftWallEndMiddle, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
