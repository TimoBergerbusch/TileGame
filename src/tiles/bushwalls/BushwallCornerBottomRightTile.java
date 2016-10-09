package tiles.Bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallCornerBottomRightTile extends BushwallTile {
    public BushwallCornerBottomRightTile(int id) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 180), id);
    }

    public BushwallCornerBottomRightTile(int id, String name) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 180), id, name);
    }
}
