package tiles.bushwalls;

import gfx.Assets;

public class BushwallDownTile extends BushwallTile {

    public BushwallDownTile(int id) {
        super(Assets.bushwallDown, id);
    }

    public BushwallDownTile(int id, String name) {
        super(Assets.bushwallDown, id, name);
    }
}
