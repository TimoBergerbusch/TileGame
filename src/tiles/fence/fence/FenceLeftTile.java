package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceLeftTile extends FenceTile {
    public FenceLeftTile(int id) {
        super(Assets.fenceLeft, id);
    }

    public FenceLeftTile(int id, String name) {
        super(Assets.fenceLeft, id, name);
    }
}
