package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceRightTile extends FenceTile {
    public FenceRightTile(int id) {
        super(Assets.fenceRight, id);
    }

    public FenceRightTile(int id, String name) {
        super(Assets.fenceRight, id, name);
    }
}
