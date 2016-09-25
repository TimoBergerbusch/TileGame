package entities.creatures;

import java.awt.*;
import java.awt.image.BufferedImage;

import gfx.Animation;
import tilegame.Handler;

import gfx.Assets;

public class Player extends Creature {

    //Animations
    private Animation animDown;
    private Animation animUp;
    private Animation animLeft;
    private Animation animRight;

    private int direction;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);

        bounds.x = 5;
        bounds.y = 44;
        bounds.width = 50;
        bounds.height = 50;

        //animation
        direction = 0;
        animDown = new Animation(500, Assets.player_down);
        animUp = new Animation(500, Assets.player_up);
        animLeft = new Animation(500, Assets.player_left);
        animRight = new Animation(500, Assets.player_right);
    }

    @Override
    public void tick() {
        //animation
        animDown.tick();
        animUp.tick();
        animLeft.tick();
        animRight.tick();

        //Movement
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        xMove = yMove = 0;

        if (handler.getKeyManager().up)
            yMove = -speed;
        if (handler.getKeyManager().down)
            yMove = speed;
        if (handler.getKeyManager().left)
            xMove = -speed;
        if (handler.getKeyManager().right)
            xMove = speed;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAniamtionFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
    }

    private BufferedImage getCurrentAniamtionFrame() {
        if (xMove < 0) {
            direction = 2;
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            direction = 3;
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            direction = 0;
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {
            direction = 1;
            return animDown.getCurrentFrame();
        } else {
            if (direction == 0)
                return Assets.playerStillUp;
            else if (direction == 1)
                return Assets.playerStillDown;
            else if (direction == 2)
                return Assets.playerStillLeft;
            else
                return Assets.playerStillRight;
        }
    }
}
