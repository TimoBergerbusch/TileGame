package tiles.indoor.walls.stripeWall;

import gfx.*;
import tiles.*;

public class StripeWallLeftEndTop extends Tile {
    public StripeWallLeftEndTop(int id) {
        super(Assets.stripeWallEndLeftTop, id);
    }

    public StripeWallLeftEndTop(int id, String name) {
        super(Assets.stripeWallEndLeftTop, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}

