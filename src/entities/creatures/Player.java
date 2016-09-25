package entities.creatures;

import java.awt.*;
import java.awt.image.BufferedImage;

import gfx.Animation;
import tilegame.Handler;

import gfx.Assets;
import utils.Direction;

import static utils.Direction.DOWN;
import static utils.Direction.LEFT;
import static utils.Direction.RIGHT;
import static utils.Direction.UP;

public class Player extends Creature {

    //Animations
    private Animation animDown;
    private Animation animUp;
    private Animation animLeft;
    private Animation animRight;

    private Direction direction;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);

        bounds.x = 13;
        bounds.y = 44;
        bounds.width = 38;
        bounds.height = 45;

        //animation
        direction = Direction.DOWN;
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

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }

    private BufferedImage getCurrentAniamtionFrame() {
        if (xMove < 0) {
            direction = LEFT;
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            direction = RIGHT;
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            direction = UP;
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {
            direction = DOWN;
            return animDown.getCurrentFrame();
        } else {
            switch (direction) {
                case UP:
                    return Assets.playerStillUp;
                case LEFT:
                    return Assets.playerStillLeft;
                case RIGHT:
                    return Assets.playerStillRight;
                default:
                    return Assets.playerStillDown;
            }
        }
    }
}
