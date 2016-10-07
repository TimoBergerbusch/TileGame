package tiles.bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallCornerBottomLeftTile extends BushwallTile {
    public BushwallCornerBottomLeftTile(int id) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 270), id);
    }

    public BushwallCornerBottomLeftTile(int id, String name) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft, 270), id, name);
    }
}
