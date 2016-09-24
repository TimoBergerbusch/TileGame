package tiles.bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallCornerBottumRightTile extends BushwallTile {
    public BushwallCornerBottumRightTile(int id) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft,180), id);
    }
}
