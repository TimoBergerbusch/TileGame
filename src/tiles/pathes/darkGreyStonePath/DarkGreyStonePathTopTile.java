package tiles.pathes.darkGreyStonePath;

import gfx.Assets;
import tiles.Tile;

public class DarkGreyStonePathTopTile extends Tile {
    public DarkGreyStonePathTopTile(int id) {
        super(Assets.darkGreyStonePath[1], id);
    }

    public DarkGreyStonePathTopTile(int id, String name) {
        super(Assets.darkGreyStonePath[1], id, name);
    }
}
