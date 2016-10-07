package tiles;

import gfx.Assets;

public class FarneTile extends Tile {

    public FarneTile(int id) {
        super(Assets.farne, id);
    }

    public FarneTile(int id, String name) {
        super(Assets.farne, id, name);
    }
}
