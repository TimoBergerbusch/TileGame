package entities.creatures;

import entities.*;
import tilegame.*;
import tiles.*;

/**
 * defines a creature as a subclass of {@link Entity}
 */
public abstract class Creature extends Entity {

    /**
     * the default speed a {@link Creature} moves with
     */
    public static final float DEFAULT_SPEED = 3.0f;
    /**
     * the default width/height of a {@link Creature}
     */
    public static final int DEFAULT_CREATURE_WIDTH = Tile.TILE_WIDTH, DEFAULT_CREATURE_HEIGHT = (int) (Tile.TILE_HEIGHT * 1.5);

    /**
     * the default speed of the {@link gfx.Animation#speed animation changing time}
     */
    public static final int DEFAULT_ANIMATION_SPEED = 250;

    /**
     * the speed the {@link Creature} moves with
     */
    protected float speed;
    /**
     * the movement in the x/y-direction
     */
    protected float xMove, yMove;

    //Constructors

    /**
     * creates a new {@link Creature} at the given x/y-position with the given width and height
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link Creature}
     * @param y       the y-position of the {@link Creature}
     * @param width   the width of the {@link Creature}
     * @param height  the heigth of the {@link Creature}
     */
    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        speed = DEFAULT_SPEED;
        xMove = yMove = 0;

        bounds.x = (int) (width * 0.3);
        bounds.y = (int) (height * 0.5);
        bounds.width = (int) (width * 0.475);
        bounds.height = (int) (height * 0.46);
    }

    //Implemented Methods

    /**
     * moving the {@link Creature} calling {@link #moveX()} and {@link #moveY()}
     *
     * @see #moveX()
     * @see #moveY()
     */
    public void move() {
        if (!checkEntityCollision(xMove, 0))
            moveX();
        if (!checkEntityCollision(0, yMove))
            moveY();
    }

    /**
     * moving the {@link Creature} on the x-axis
     */
    public void moveX() {
        if (xMove > 0) { // Move Right
            int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILE_WIDTH;
            if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILE_HEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILE_HEIGHT)) {
                x += xMove;
            } else {
                x = tx * Tile.TILE_WIDTH - bounds.x - bounds.width - 1;
            }
        } else if (xMove < 0) { //Move left
            int tx = (int) (x + xMove + bounds.x) / Tile.TILE_WIDTH;
            if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILE_HEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILE_HEIGHT)) {
                x += xMove;
            } else {
                x = tx * Tile.TILE_WIDTH - bounds.x + Tile.TILE_WIDTH;
            }
        }
    }

    /**
     * moving the {@link Creature} on the y-axis
     */
    public void moveY() {
        if (yMove < 0) {//Move Up

            int ty = (int) (y + yMove + bounds.y) / Tile.TILE_HEIGHT;
            if (!collisionWithTile((int) (x + bounds.x) / Tile.TILE_WIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILE_WIDTH, ty)) {
                y += yMove;
            } else {
                y = ty * Tile.TILE_HEIGHT + Tile.TILE_HEIGHT - bounds.y;
            }
        } else if (yMove > 0) {//Move Down

            int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILE_HEIGHT;
            if (!collisionWithTile((int) (x + bounds.x) / Tile.TILE_WIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILE_WIDTH, ty)) {
                y += yMove;
            } else {
                y = ty * Tile.TILE_HEIGHT - bounds.y - bounds.height - 1;
            }
        }
    }

    /**
     * checks whether or not the {@link Tile} at the given position {@link Tile#isSolid()} equals
     * <code>true</code>
     *
     * @param x the x-position
     * @param y the y-position
     * @return <ul><li>true = the {@link Tile} is solid </li><li> false = the {@link Tile} is
     * <em>not</em> solid</li></ul>
     */
    protected boolean collisionWithTile(int x, int y) {
        return handler.getWorld().getTile(x, y).isSolid();
    }

    //Getters and Setters

    /**
     * Gets the speed the {@link Creature} moves with.
     *
     * @return Value of the speed the {@link Creature} moves with.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * StaticSets new the speed the {@link Creature} moves with.
     *
     * @param speed New value of the speed the {@link Creature} moves with.
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * Gets the movement in the xy-direction.
     *
     * @return Value of the movement in the xy-direction.
     */
    public float getXMove() {
        return xMove;
    }

    /**
     * StaticSets new the movement in the xy-direction.
     *
     * @param xMove New value of the movement in the xy-direction.
     */
    public void setXMove(float xMove) {
        this.xMove = xMove;
    }

    /**
     * Gets yMove.
     *
     * @return Value of yMove.
     */
    public float getYMove() {
        return yMove;
    }

    /**
     * StaticSets new yMove.
     *
     * @param yMove New value of yMove.
     */
    public void setYMove(float yMove) {
        this.yMove = yMove;
    }
}
