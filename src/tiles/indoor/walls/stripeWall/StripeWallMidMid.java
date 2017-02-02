package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallMidMid extends Tile {
    public StripeWallMidMid(int id) {
        super(Assets.stripeWallMidMid, id);
    }

    public StripeWallMidMid(int id, String name) {
        super(Assets.stripeWallMidMid, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
