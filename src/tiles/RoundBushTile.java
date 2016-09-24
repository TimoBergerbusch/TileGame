package tiles;

import java.awt.image.BufferedImage;

import gfx.Assets;

public class RoundBushTile extends Tile {
    public RoundBushTile(int id) {
        super(Assets.roundBush, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
