package entities.statics;

import java.awt.*;

import entities.StaticInteractableEntity;
import gfx.Assets;
import messages.Message;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines a Statue as a subclass of {@link StaticInteractableEntity}
 */
public class Statue extends StaticInteractableEntity {

    //Constructors

    /**
     * creates a new Statue at a given position, using {@link StaticEntity#StaticEntity(Handler,
     * float, float, int, int)}
     *
     * @param handler the {@link Handler} of the {@link tilegame.Game}
     * @param x       the x-Position of the {@link Statue}
     * @param y       the y-Position of the {@link Statue}
     * @see StaticEntity
     */
    public Statue(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = Tile.TILE_WIDTH;
        bounds.height = Tile.TILE_HEIGHT;
        Message.setXOffset(60);
        Message.setYOffset(80);
    }

    /**
     * creates a new Statue at a given position with a given {@link Message} using {@link
     * Statue#Statue(Handler, float, float)}
     *
     * @param handler the {@link Handler} of a {@link tilegame.Game}
     * @param x       the x-Position of the {@link Statue}
     * @param y       the y-Position of the {@link Statue}
     * @param message the {@link Message} to show during {@link #interact()}
     * @see Statue#Statue(Handler, float, float)
     */
    public Statue(Handler handler, float x, float y, Message message) {
        this(handler, x, y);
        this.message = message;
    }

    //Methods

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.statue, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

        message.render(g);
    }


}
