package entities.creatures.persons;

import java.awt.*;
import java.awt.image.*;

import messages.*;
import tilegame.*;

public class Grandmother extends Person {

    /**
     * creates a new {@link Grandmother}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Grandmother}
     * @param y       the y-position of the {@link Grandmother}
     * @param texture the texture of the {@link Grandmother}
     */
    public Grandmother(Handler handler, float x, float y, BufferedImage[] texture) {
        super(handler, x, y, texture);
    }

    /**
     * creates a new {@link Grandmother} with an individual {@link Message}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Grandmother}
     * @param y       the y-position of the {@link Grandmother}
     * @param texture the texture of the {@link Grandmother}
     */
    public Grandmother(Handler handler, float x, float y, BufferedImage[] texture, Message message) {
        super(handler, x, y, texture, message);
    }


    @Override
    public void tick() {

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
