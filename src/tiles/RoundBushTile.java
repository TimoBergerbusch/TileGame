package tiles;

import gfx.Assets;

public class RoundBushTile extends Tile {
    public RoundBushTile(int id) {
        super(Assets.roundBush, id);
    }

    public RoundBushTile(int id, String s) {
        super(Assets.roundBush, id, s);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
