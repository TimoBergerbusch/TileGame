package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallEndRightTop extends Tile {
    public StripeWallEndRightTop(int id) {
        super(Assets.stripeWallEndRightTop, id);
    }

    public StripeWallEndRightTop(int id, String name) {
        super(Assets.stripeWallEndRightTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
