package entities;

import java.awt.*;

import tilegame.Handler;

/**
 * a class to represent every element of the game, which can't be shown as a {@link tiles.Tile}, or
 * which should have custom <code>CollisionBounds</code>
 */
public abstract class Entity {

    /**
     * the default health a standart an {@link Entity} starts with
     */
    private static final int DEFAULT_HEALTH = 10;

    /**
     * the {@link Handler} to the {@link tilegame.Game}
     */
    protected Handler handler;
    /**
     * the x/y-position of the {@link Entity}
     */
    protected float x, y;
    /**
     * the width/height of the {@link Entity}
     */
    protected int width, height;
    /**
     * the health an {@link Entity} has
     */
    protected int health;
    /**
     * defines the bounds to detect collision of this {@link Entity} with a {@link
     * entities.creatures.Player}
     */
    protected Rectangle bounds;
    /**
     * defines whether or not the {@link Entity} should be remove from the game or not. <ul><li>true
     * = should<em>not</em> removed</li><li>false = should be removed</li></ul>
     */
    private boolean active = true;

    //Constructors

    /**
     * creates a new {@link Entity}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @param width   the width of the {@link Entity}
     * @param height  the height of the {@link Entity}
     */
    public Entity(Handler handler, float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.handler = handler;
        health = DEFAULT_HEALTH;

        bounds = new Rectangle(0, 0, width, height);
    }

    //Methods

    /**
     * describes what an {@link Entity} should do every Gametick
     */
    public abstract void tick();

    /**
     * draws the {@link Entity} to the Canvas
     *
     * @param g the {@link Graphics}-Object to draw with
     */
    public abstract void render(Graphics g);

    /**
     * defines whether or not an {@link Entity} should allways be drawn behind the {@link
     * entities.creatures.Player}
     *
     * @return <ul><li>true = should <em>always</em> be drawn behind the {@link
     * entities.creatures.Player}</li><li>false = should follow the renderStartegy</li></ul>
     */
    public boolean alwaysInBack() {
        return false;
    }

    /**
     * checks if the {@link entities.creatures.Player#bounds Players Collisionbounds} would
     * intersects with the {@link #bounds} of an other {@link Entity} if moved by the given
     * x/yOffsets
     *
     * @param xOffset the offset on the x-axis
     * @param yOffset the offset on the y-axis
     * @return <code>true</code>, if intersects with the collision bounds of an other {@link
     * Entity}. <code>false</code> otherwise
     */
    protected boolean checkEntityCollision(float xOffset, float yOffset) {
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

    /**
     * returns the collision bounds of this {@link Entity} moved by the given x/yOffsets
     *
     * @param xOffset the offset on the x-axis
     * @param yOffset the offset on the y-axis
     * @return the moved bounds as a {@link Rectangle}
     */
    public Rectangle getCollisionBounds(float xOffset, float yOffset) {
        if (bounds == (null)) {
            return new Rectangle(0, 0, 0, 0);
        }
        return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width, bounds.height);
    }

    /**
     * hurts an {@link Entity} by decreasing the health
     *
     * @param amt the amount of decreasing
     */
    public void hurt(int amt) {
        health -= amt;
        if (health <= 0) {
            active = false;
            die();
        }
    }

    /**
     * defines what to do if the {@link Entity} dies
     */
    public abstract void die();


    //Getters and Setters

    /**
     * Gets defines the bounds to detect collision of this {@link Entity} with a {@link
     * entities.creatures.Player}.
     *
     * @return Value of defines the bounds to detect collision of this {@link Entity} with a {@link
     * entities.creatures.Player}.
     */
    public Rectangle getBounds() {
        return bounds;
    }

    /**
     * StaticSets new defines the bounds to detect collision of this {@link Entity} with a {@link
     * entities.creatures.Player}.
     *
     * @param bounds New value of defines the bounds to detect collision of this {@link Entity} with
     *               a {@link entities.creatures.Player}.
     */
    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    /**
     * Gets the health an {@link Entity} has.
     *
     * @return Value of the health an {@link Entity} has.
     */
    public int getHealth() {
        return health;
    }

    /**
     * StaticSets new the health an {@link Entity} has.
     *
     * @param health New value of the health an {@link Entity} has.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets defines whether or not the {@link Entity} should be remove from the game or not.
     * <ul><li>true = should<em>not</em> removed</li><li>false = should be removed</li></ul>.
     *
     * @return Value of {@link #active}
     */
    public boolean isActive() {
        return active;
    }

    /**
     * StaticSets new defines whether or not the {@link Entity} should be remove from the game or
     * not. <ul><li>true = should<em>not</em> removed</li><li>false = should be removed</li></ul>.
     *
     * @param active New value of {@link #active}
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Gets height.
     *
     * @return Value of height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * StaticSets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(int height) {
        this.height = height;
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
     * StaticSets new y.
     *
     * @param y New value of y.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Gets the width/height of the {@link Entity}.
     *
     * @return Value of the width/height of the {@link Entity}.
     */
    public int getWidth() {
        return width;
    }

    /**
     * StaticSets new the width/height of the {@link Entity}.
     *
     * @param width New value of the width/height of the {@link Entity}.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the {@link Handler} to the {@link tilegame.Game}.
     *
     * @return Value of the {@link Handler} to the {@link tilegame.Game}.
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * StaticSets new the {@link Handler} to the {@link tilegame.Game}.
     *
     * @param handler New value of the {@link Handler} to the {@link tilegame.Game}.
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * Gets the x/y-position of the {@link Entity}.
     *
     * @return Value of the x/y-position of the {@link Entity}.
     */
    public float getX() {
        return x;
    }

    /**
     * StaticSets new the x/y-position of the {@link Entity}.
     *
     * @param x New value of the x/y-position of the {@link Entity}.
     */
    public void setX(float x) {
        this.x = x;
    }
}
