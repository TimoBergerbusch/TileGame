package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallEndRightBottom extends Tile {
    public StripeWallEndRightBottom(int id) {
        super(Assets.stripeWallEndRightBottom, id);
    }

    public StripeWallEndRightBottom(int id, String name) {
        super(Assets.stripeWallEndRightBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
