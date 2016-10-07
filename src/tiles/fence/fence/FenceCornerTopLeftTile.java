package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceCornerTopLeftTile extends FenceTile {
    public FenceCornerTopLeftTile(int id) {
        super(Assets.fenceCornerTopLeft, id);
    }

    public FenceCornerTopLeftTile(int id, String name) {
        super(Assets.fenceCornerTopLeft, id, name);
    }

}
