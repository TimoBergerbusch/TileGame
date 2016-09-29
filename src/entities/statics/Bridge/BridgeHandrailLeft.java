package entities.statics.Bridge;

import java.awt.*;

import entities.statics.StaticEntity;
import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines the left side of a bridge handrail as a subclass of {@link StaticEntity}
 */
public class BridgeHandrailLeft extends StaticEntity {
    //Constructors

    /**
     * creates a new {@link BridgeHandrailLeft} at the given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public BridgeHandrailLeft(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
        bounds.x = bounds.width = Tile.TILE_WIDTH / 2;
    }

    //Implemented Methods
    
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.bridgeHandrailLeft, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);

    }
}
