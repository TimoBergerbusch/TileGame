package tiles.fence.fence;

import gfx.Assets;
import tiles.fence.FenceTile;

public class FenceCornerBottomLeftTile extends FenceTile {
    public FenceCornerBottomLeftTile(int id) {
        super(Assets.fenceCornerBottumLeft, id);
    }

    public FenceCornerBottomLeftTile(int id, String name) {
        super(Assets.fenceCornerBottumLeft, id, name);
    }
}
