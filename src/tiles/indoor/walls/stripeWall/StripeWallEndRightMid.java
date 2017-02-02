package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallEndRightMid extends Tile {
    public StripeWallEndRightMid(int id) {
        super(Assets.stripeWallEndRightMid, id);
    }

    public StripeWallEndRightMid(int id, String name) {
        super(Assets.stripeWallEndRightMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
