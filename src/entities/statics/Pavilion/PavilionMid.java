package entities.statics.Pavilion;


import java.awt.*;

import entities.statics.StaticEntity;
import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines the middle part of a Pavilion
 */
public class PavilionMid extends StaticEntity {

    //Constructors

    /**
     * creates a new {@link PavilionMid}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public PavilionMid(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 0;
        bounds.height = 0;
    }

    //Implemented Methods
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.pavilionMid, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

        g.setColor(Color.red);
        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
