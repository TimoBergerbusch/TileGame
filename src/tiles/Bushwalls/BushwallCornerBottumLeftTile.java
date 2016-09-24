package tiles.bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallCornerBottumLeftTile extends BushwallTile {
    public BushwallCornerBottumLeftTile(int id) {
        super(Utils.rotateImage(Assets.bushwallCornerTopLeft,270), id);
    }
}
