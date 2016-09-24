package entities.creatures;

import entities.Entity;

public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 32, DEFAULT_CREATURE_HEIGHT = 46;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = yMove = 0;
    }

    public void move() {
        x += xMove;
        y += yMove;
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
