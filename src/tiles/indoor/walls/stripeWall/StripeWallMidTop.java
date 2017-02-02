package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallMidTop extends Tile {
    public StripeWallMidTop(int id) {
        super(Assets.stripeWallMidTop, id);
    }

    public StripeWallMidTop(int id, String name) {
        super(Assets.stripeWallMidTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
