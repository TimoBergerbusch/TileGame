package tiles.Bushwalls;

import gfx.Assets;
import utils.Utils;

public class BushwallSideTile extends BushwallTile {
    public BushwallSideTile(int id) {
        super(Utils.rotateImage(Assets.bushwallDown, 90.0), id);
    }

    public BushwallSideTile(int id, String name) {
        super(Utils.rotateImage(Assets.bushwallDown, 90), id, name);
    }
}
