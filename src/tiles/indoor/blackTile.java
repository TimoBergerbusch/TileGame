package tiles.indoor;

import gfx.*;
import tiles.*;

public class BlackTile extends Tile {
    public BlackTile(int id) {
        super(Assets.blackTile, id);
    }

    public BlackTile(int id, String name) {
        super(Assets.blackTile, id, name);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
