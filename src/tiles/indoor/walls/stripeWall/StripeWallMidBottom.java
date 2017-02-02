package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallMidBottom extends Tile {
    public StripeWallMidBottom(int id) {
        super(Assets.stripeWallMidBottom, id);
    }

    public StripeWallMidBottom(int id, String name) {
        super(Assets.stripeWallMidBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
