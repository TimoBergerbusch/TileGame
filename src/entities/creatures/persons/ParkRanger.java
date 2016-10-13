package entities.creatures.persons;

import java.awt.*;

import gfx.*;
import messages.*;
import tilegame.*;

public class ParkRanger extends PersonWithGender {
    public ParkRanger(Handler handler, float x, float y, boolean shouldMove, boolean isMale) {
        super(handler, x, y, Assets.parkRanger, shouldMove, isMale);
    }

    public ParkRanger(Handler handler, float x, float y, boolean shouldMove, boolean isMale, Message message) {
        super(handler, x, y, Assets.parkRanger, shouldMove, isMale, message);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
    }

    @Override
    public void die() {

    }
}
