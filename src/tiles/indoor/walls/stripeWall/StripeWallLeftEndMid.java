package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallLeftEndMid extends Tile {
    public StripeWallLeftEndMid(int id) {
        super(Assets.stripeWallEndLeftMid, id);
    }

    public StripeWallLeftEndMid(int id, String name) {
        super(Assets.stripeWallEndLeftMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
