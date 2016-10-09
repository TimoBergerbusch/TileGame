package entities.creatures.persons;

import java.awt.image.*;

import entities.creatures.*;
import gfx.*;
import messages.*;
import tilegame.*;
import tiles.*;
import utils.*;

import static utils.Direction.*;

public abstract class Person extends InteractableCreature {

    BufferedImage[] texture;
    Direction direction;
    Animation animUp, animDown, animLeft, animRight;

    /**
     * creates a new {@link Person} using {@link Creature#Creature(Handler, float, float, int, int)}
     * extending {@link InteractableCreature}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-Position of the {@link Creature}
     * @param y       the y-Position of the {@link Creature}
     * @see Creature
     */
    public Person(Handler handler, float x, float y, BufferedImage[] texture) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, (int) (Tile.TILE_HEIGHT * 1.25));
        this.texture = texture;

        animUp = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getArrayPart(texture, 4, 5));
        animDown = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getArrayPart(texture, 6, 7));
        animLeft = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getArrayPart(texture, 8, 9));
        animRight = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getArrayPart(texture, 10, 11));

        direction = DOWN;

//        bounds.x = (int) (width * 0.3);
        bounds.x = 0;
        bounds.y = (int) (height * 0.5);
//        bounds.width = (int) (width * 0.475);
        bounds.width = width;
        bounds.height = (int) (height * 0.46);
    }

    /**
     * creates a new {@link Person} using {@link Creature#Creature(Handler, float, float, int, int)}
     * extending {@link InteractableCreature} with an individual {@link Message}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-Position of the {@link Creature}
     * @param y       the y-Position of the {@link Creature}
     * @see Creature
     */
    public Person(Handler handler, float x, float y, BufferedImage[] texture, Message message) {
        this(handler, x, y, texture);
        setMessage(message);
    }

    @Override
    public void interact() {
        Player player = handler.getWorld().getEntityManager().getPlayer();
        switch (player.getDirection()) {
            case DOWN:
                this.direction = UP;
                break;
            case LEFT:
                this.direction = RIGHT;
                break;
            case RIGHT:
                this.direction = LEFT;
                break;
            default:
                this.direction = DOWN;
                break;
        }

        super.interact();
    }

    public BufferedImage getCurrentAnimationFrame() {
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
                    return texture[1];
                case LEFT:
                    return texture[2];
                case RIGHT:
                    return texture[3];
                default:
                    return texture[0];
            }
        }
    }
}
