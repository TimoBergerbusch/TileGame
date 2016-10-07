package entities.statics;

import java.awt.*;

import gfx.Assets;
import messages.Message;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines a metal Sign as a subclass of {@link StaticInteractableEntity}
 */
public class MetalSign extends StaticInteractableEntity {

    //Constructors

    /**
     * creates a new {@link MetalSign} at the given x/y-position with the default {@link Message}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public MetalSign(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.height = bounds.y = height / 2;
    }

    /**
     * creates a new {@link MetalSign} at the given x/y-position with a given {@link Message} using
     * {@link MetalSign#MetalSign(Handler, float, float)}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     * @param message the {@link Message} of this Sign
     * @see MetalSign#MetalSign(Handler, float, float)
     */
    public MetalSign(Handler handler, float x, float y, Message message) {
        this(handler, x, y);
        setMessage(message);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.metalSign, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        message.render(g);
    }
}
