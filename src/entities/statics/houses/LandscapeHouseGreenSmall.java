package entities.statics.houses;

import java.awt.*;

import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;

/**
 * defines a green House as a subclass of {@link StaticEntity}
 */
public class LandscapeHouseGreenSmall extends StaticEnterAbleEntity {
    //Constructors

    /**
     * creates a new {@link LandscapeHouseGreen} at the given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public LandscapeHouseGreenSmall(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH * 5, Tile.TILE_HEIGHT * 5);
        bounds.x = 0;
        bounds.y = (int) (1.5 * Tile.TILE_HEIGHT);
        bounds.width = width;
        bounds.height = (int) (height - 1.8 * Tile.TILE_HEIGHT);

        computeEnterBounds(Tile.TILE_WIDTH);
    }

    //Implemented Methods
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.landscapeHouseGreenSmall, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
//        g.setColor(Color.yellow);
//        g.fillRect((int) (x + enterBounds.x - handler.getGameCamera().getXOffset()), (int) (y + enterBounds.y - handler.getGameCamera().getYOffset()), enterBounds.width, enterBounds.height);
    }
}
