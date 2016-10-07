package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceIntersectionRightTile extends FenceTile {
    public FenceIntersectionRightTile(int id) {
        super(Assets.fenceIntersectionRight, id);
    }

    public FenceIntersectionRightTile(int id, String name) {
        super(Assets.fenceIntersectionRight, id, name);
    }
}
