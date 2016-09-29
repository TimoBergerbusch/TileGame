package entities;

import java.awt.*;

import tilegame.Handler;

public abstract class Entity {

    public static final int DEFAULT_HEALTH = 10;

    protected Handler handler;
    protected float x, y;
    protected int width, height;
    protected int health;
    protected boolean active = true;
    protected Rectangle bounds;

    public Entity(Handler handler, float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.handler = handler;
        health = DEFAULT_HEALTH;

        bounds = new Rectangle(0, 0, width, height);
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public boolean alwaysInBack() {
        return false;
    }

    public boolean checkEntityCollision(float xOffset, float yOffset) {
        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this))
                continue;
            if (e instanceof EntityBuild) {
                for (Rectangle r : ((EntityBuild) e).getCollisionBoundsOfBuild(0f, 0f)) {
                    if (r.intersects(getCollisionBounds(xOffset, yOffset)))
                        return true;
                }
            }
            if (e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
                return true;
        }
        return false;
    }

    public Rectangle getCollisionBounds(float xOffset, float yOffset) {
        if (bounds == (null)) {
            return new Rectangle(0, 0, 0, 0);
        }
        return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }

    public void hurt(int amt) {
        health -= amt;
        if (health <= 0) {
            active = false;
            die();
        }
    }

    public abstract void die();

    /**
     * Gets height.
     *
     * @return Value of height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets new x.
     *
     * @param x New value of x.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets width.
     *
     * @return Value of width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets y.
     *
     * @return Value of y.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets new width.
     *
     * @param width New value of width.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets x.
     *
     * @return Value of x.
     */
    public float getX() {
        return x;
    }

    /**
     * Sets new y.
     *
     * @param y New value of y.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Sets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Sets new handler.
     *
     * @param handler New value of handler.
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * Gets health.
     *
     * @return Value of health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets active.
     *
     * @return Value of active.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets new bounds.
     *
     * @param bounds New value of bounds.
     */
    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    /**
     * Sets new active.
     *
     * @param active New value of active.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Gets bounds.
     *
     * @return Value of bounds.
     */
    public Rectangle getBounds() {
        return bounds;
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
     * Gets handler.
     *
     * @return Value of handler.
     */
    public Handler getHandler() {
        return handler;
    }
}
