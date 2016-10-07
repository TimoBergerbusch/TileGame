package tiles.Bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallCornerTopRightTile extends BushwallTile {
    public BushwallCornerTopRightTile(int id) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 90), id);
    }

    public BushwallCornerTopRightTile(int id, String name) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 90), id, name);
    }
}
