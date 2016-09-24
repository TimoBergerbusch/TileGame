package tiles.Bushwalls;

import java.awt.image.BufferedImage;

import gfx.Assets;
import utils.Utils;

/**
 * Created by Timo Bergerbusch on 25.09.2016.
 */
public class BushwallSideTile extends BushwallTile {
    public BushwallSideTile(int id) {
        super(Utils.rotateImage(Assets.bushwallDown, 90.0), id);
    }
}
