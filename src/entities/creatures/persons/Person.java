package entities.creatures.persons;

import java.awt.*;
import java.awt.image.*;
import java.util.*;

import entities.creatures.*;
import gfx.*;
import messages.*;
import tilegame.*;
import tiles.*;
import utils.*;

import static utils.Direction.*;

public abstract class Person extends InteractableCreature {

    protected BufferedImage[] texture;
    protected Direction direction;
    protected Animation animUp, animDown, animLeft, animRight;
    protected boolean shouldMove;
    private float movesX = 0, movesY = 0;
    protected Rectangle walkingBounds;

    /**
     * creates a new {@link Person} using {@link Creature#Creature(Handler, float, float, int, int)}
     * extending {@link InteractableCreature}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-Position of the {@link Creature}
     * @param y       the y-Position of the {@link Creature}
     * @see Creature
     */
    public Person(Handler handler, float x, float y, BufferedImage[] texture, boolean shouldMove) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, (int) (Tile.TILE_HEIGHT * 1.25));
        this.texture = texture;
        walkingBounds = new Rectangle((int) (x - 1 * Tile.TILE_WIDTH), (int) (y - 1 * Tile.TILE_HEIGHT), 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);

        animUp = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getPersonAnimation(UP, texture));
        animDown = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getPersonAnimation(DOWN, texture));
        animLeft = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getPersonAnimation(LEFT, texture));
        animRight = new Animation(Creature.DEFAULT_ANIMATION_SPEED, Utils.getPersonAnimation(RIGHT, texture));

        direction = DOWN;

        bounds.x = 0;
        bounds.y = (int) (height * 0.5);
        bounds.width = width;
        bounds.height = (int) (height * 0.46);

        this.speed = Tile.TILE_WIDTH / 16;
        this.shouldMove = shouldMove;
    }

    /**
     * creates a new {@link Person} using {@link Creature#Creature(Handler, float, float, int, int)}
     * extending {@link InteractableCreature}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-Position of the {@link Creature}
     * @param y       the y-Position of the {@link Creature}
     * @see Creature
     */
    public Person(Handler handler, float x, float y, BufferedImage[] texture, boolean shouldMove, Direction direction) {
        this(handler, x, y, texture, shouldMove);
        this.direction = direction;
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
    public Person(Handler handler, float x, float y, BufferedImage[] texture, boolean shouldMove, Message message) {
        this(handler, x, y, texture, shouldMove);
        setMessage(message);
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
    public Person(Handler handler, float x, float y, BufferedImage[] texture, boolean shouldMove, Direction direction, Message message) {
        this(handler, x, y, texture, shouldMove, direction);
        setMessage(message);
    }

    @Override
    public void tick() {
        if (!Message.isShown) {
            animUp.tick();
            animDown.tick();
            animLeft.tick();
            animRight.tick();

            if (shouldMove)
                randomMove();
            move();
        }
    }

    private void randomMove() {
        randomMoveX();
        if (xMove == 0)
            randomMoveY();
    }

    private void randomMoveX() {
        if (movesX < Tile.TILE_WIDTH / speed) {
            movesX++;
        } else {
            xMove = randomMoveAxis();
            movesX = 0;
        }

        Rectangle newBounds = bounds.getBounds();
        newBounds.setLocation((int) (x + xMove), (int) y);
        if (!newBounds.intersects(walkingBounds))
            xMove = 0;
    }

    private void randomMoveY() {
        if (movesY < Tile.TILE_HEIGHT / speed) {
            movesY++;
        } else {
            yMove = randomMoveAxis();
            movesY = 0;
        }

        Rectangle newBounds = bounds.getBounds();
        newBounds.setLocation((int) x + bounds.x, (int) (y + bounds.y + yMove));
        if (!newBounds.intersects(walkingBounds))
            yMove = 0;
    }

    private float randomMoveAxis() {
        float move = 0f;
        int rndBound = 10;
        Random rnd = new Random();
        switch (rnd.nextInt(rndBound)) {
            case 0:
                move = -speed;
                break;
            case 1:
                move = speed;
                break;
            default:
                move = 0f;
        }
        return move;
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

    /**
     * Sets new shouldMove.
     *
     * @param shouldMove New value of shouldMove.
     */
    public void setShouldMove(boolean shouldMove) {
        this.shouldMove = shouldMove;
    }
}
