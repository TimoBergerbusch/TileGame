package entities.creatures.persons;

import java.awt.*;

import gfx.*;
import messages.*;
import tilegame.*;
import utils.*;

public class Grandparent extends PersonWithGender {
    public Grandparent(Handler handler, float x, float y, boolean shouldMove, boolean isMale) {
        super(handler, x, y, Assets.grandparent, shouldMove, isMale);
    }

    public Grandparent(Handler handler, float x, float y, boolean shouldMove, boolean isMale, Direction direction) {
        super(handler, x, y, Assets.grandparent, shouldMove, isMale, direction);
    }

    public Grandparent(Handler handler, float x, float y, boolean shouldMove, boolean isMale, Message message) {
        super(handler, x, y, Assets.grandparent, shouldMove, isMale, message);
    }

    public Grandparent(Handler handler, float x, float y, boolean shouldMove, boolean isMale, Direction direction, Message message) {
        super(handler, x, y, Assets.grandparent, shouldMove, isMale, direction, message);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
    }

    @Override
    public void die() {

    }
}