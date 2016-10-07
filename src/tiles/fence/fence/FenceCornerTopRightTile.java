package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceCornerTopRightTile extends FenceTile {
    public FenceCornerTopRightTile(int id) {
        super(Assets.fenceCornerTopRight, id);
    }

    public FenceCornerTopRightTile(int id, String name) {
        super(Assets.fenceCornerTopRight, id, name);
    }
}
