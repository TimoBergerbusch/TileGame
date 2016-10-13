package entities.statics.houses;

import java.awt.*;

import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;

/**
 * defines a new red House as a subclass of {@link StaticEntity}
 */
public class LandscapeHouseRed extends StaticEntity {
    //Constructors

    /**
     * creates a new {@link LandscapeHouseRed} at a given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public LandscapeHouseRed(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH * 5, Tile.TILE_HEIGHT * 5);
        bounds.x = 0;
        bounds.y = (int) (1.5 * Tile.TILE_HEIGHT);
        bounds.width = width;
        bounds.height = (int) (height - 2.25 * Tile.TILE_HEIGHT);
    }

    //Implemented Methods
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.landscapeHouseRed, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
