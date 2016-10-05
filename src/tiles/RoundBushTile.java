package tiles;

import gfx.Assets;

public class RoundBushTile extends Tile {
    public RoundBushTile(int id) {
        super(Assets.roundBush, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

    @Override
    public String toString() {
        return "Round Bush";
    }
}
