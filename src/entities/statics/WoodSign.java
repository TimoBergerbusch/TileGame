package entities.statics;

import java.awt.*;

import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class WoodSign extends StaticEntity {

    public WoodSign(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_WIDTH);
        bounds.x = 0;
        bounds.height = bounds.y = height / 2;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.woodSign, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
    }
}
