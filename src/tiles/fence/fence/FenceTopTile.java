package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceTopTile extends FenceTile {

    public FenceTopTile(int id) {
        super(Assets.fenceTop, id);
    }

    public FenceTopTile(int id, String name) {
        super(Assets.fenceTop, id, name);
    }
}
