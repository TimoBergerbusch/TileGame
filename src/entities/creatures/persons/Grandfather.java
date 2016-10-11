package entities.creatures.persons;

import java.awt.*;
import java.awt.image.*;

import messages.*;
import tilegame.*;

public class Grandfather extends Person {

    /**
     * creates a new {@link Grandfather}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link Grandfather}
     * @param y       the y-position of the {@link Grandfather}
     * @param texture the texture of the {@link Grandfather}
     */
    public Grandfather(Handler handler, float x, float y, BufferedImage[] texture, boolean bool) {
        super(handler, x, y, texture, bool);
    }

    /**
     * creates a new {@link Grandfather} with an individual {@link Message}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link Grandfather}
     * @param y       the y-position of the {@link Grandfather}
     * @param texture the texture of the {@link Grandfather}
     */
    public Grandfather(Handler handler, float x, float y, BufferedImage[] texture, boolean bool, Message message) {
        super(handler, x, y, texture, bool, message);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }

    @Override
    public void die() {

    }
}
