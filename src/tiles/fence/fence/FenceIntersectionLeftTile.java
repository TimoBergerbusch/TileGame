package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceIntersectionLeftTile extends FenceTile {
    public FenceIntersectionLeftTile(int id) {
        super(Assets.fenceIntersectionLeft, id);
    }

    public FenceIntersectionLeftTile(int id, String name) {
        super(Assets.fenceIntersectionLeft, id, name);
    }
}
