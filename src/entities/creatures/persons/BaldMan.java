package entities.creatures.persons;

import java.awt.*;

import gfx.*;
import messages.*;
import tilegame.*;

public class BaldMan extends Person {

    /**
     * creates a new {@link BaldMan}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link BaldMan}
     * @param y       the y-position of the {@link BaldMan}
     */
    public BaldMan(Handler handler, float x, float y, boolean shouldMove) {
        super(handler, x, y, Assets.baldMan, false);
    }

    /**
     * creates a new {@link BaldMan} with an individual {@link Message}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link BaldMan}
     * @param y       the y-position of the {@link BaldMan}
     */
    public BaldMan(Handler handler, float x, float y,boolean shouldMove, Message message) {
        super(handler, x, y, Assets.baldMan, false, message);
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
//        g.setColor(Color.green);
//        g.fillRect((int) (walkingBounds.x - handler.getGameCamera().getXOffset()), (int) (walkingBounds.y - handler.getGameCamera().getYOffset()), walkingBounds.width, walkingBounds.height);

        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }


    @Override
    public void die() {

    }
}
