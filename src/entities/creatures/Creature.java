package entities.creatures;

import entities.Entity;
import tilegame.Handler;
import tiles.Tile;

public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 5.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 64, DEFAULT_CREATURE_HEIGHT = 96;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = yMove = 0;
    }

    public void move() {
        if (!checkEntityCollision(xMove, 0))
            moveX();
        if (!checkEntityCollision(0, yMove))
            moveY();
    }

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

    protected boolean collisionWithTile(int x, int y) {
        return handler.getWorld().getTile(x, y).isSolid();
    }

    //Getters and Setters

    /**
     * Gets health.
     *
     * @return Value of health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets speed.
     *
     * @return Value of speed.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets new speed.
     *
     * @param speed New value of speed.
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * Sets new health.
     *
     * @param health New value of health.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets new xMove.
     *
     * @param xMove New value of xMove.
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
     * Sets new yMove.
     *
     * @param yMove New value of yMove.
     */
    public void setYMove(float yMove) {
        this.yMove = yMove;
    }

    /**
     * Gets xMove.
     *
     * @return Value of xMove.
     */
    public float getXMove() {
        return xMove;
    }
}
