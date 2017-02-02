package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallLeftEndBottom extends Tile {
    public StripeWallLeftEndBottom(int id) {
        super(Assets.stripeWallEndLeftBottom, id);
    }

    public StripeWallLeftEndBottom(int id, String name) {
        super(Assets.stripeWallEndLeftBottom, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
