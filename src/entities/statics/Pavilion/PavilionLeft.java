package entities.statics.Pavilion;


import java.awt.*;

import entities.statics.StaticEntity;
import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class PavilionLeft extends StaticEntity {

    public PavilionLeft(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);
        bounds.x = 5;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = 10;
        bounds.height = (int) (0.75 * Tile.TILE_HEIGHT);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.pavilionLeft, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

        g.setColor(Color.red);
        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
