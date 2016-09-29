package gfx;


import entities.Entity;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines a virtual camera to move the world around
 */
public class GameCamera {

    /**
     * the {@link Handler} to the {@link tilegame.Game}
     */
    private Handler handler;
    /**
     * defines the amount the world should be drawn to the left
     */
    private float xOffset;
    /**
     * defines the amout the world should be drawn down
     */
    private float yOffset;

    //Constructors

    /**
     * creates a new {@link GameCamera} with given Offsets
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param xOffset the {@link #xOffset}
     * @param yOffset the {@link #yOffset}
     */
    public GameCamera(Handler handler, float xOffset, float yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.handler = handler;
    }

    //Implemented Methods

    /**
     * moves the {@link GameCamera} by the given amounts and calls {@link #checkBlankSpace()}
     *
     * @param xAmt the amount on the x-axis
     * @param yAmt the amount on the y-axis
     * @see #checkBlankSpace()
     */
    public void move(float xAmt, float yAmt) {
        xOffset += xAmt;
        yOffset += yAmt;

        checkBlankSpace();
    }

    /**
     * checks if the {@link GameCamera} shows space outside of the world and sets it so it doesn't
     */
    public void checkBlankSpace() {
        if (xOffset < 0)
            xOffset = 0;
        else if (xOffset > handler.getWorld().getWidth() * Tile.TILE_WIDTH - handler.getWidth())
            xOffset = handler.getWorld().getWidth() * Tile.TILE_WIDTH - handler.getWidth();
        if (yOffset < 0)
            yOffset = 0;
        else if (yOffset > handler.getWorld().getHeight() * Tile.TILE_HEIGHT - handler.getHeight())
            yOffset = handler.getWorld().getHeight() * Tile.TILE_HEIGHT - handler.getHeight();
    }

    /**
     * centers the {@link GameCamera} on a given {@link Entity}
     *
     * @param e the {@link Entity} to be centered on
     */
    public void centerOnEntity(Entity e) {
        xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
        yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight() / 2;

        checkBlankSpace();
    }

    //Getters and Setters

    /**
     * Sets new defines the amout the world should be drawn down.
     *
     * @param yOffset New value of defines the amout the world should be drawn down.
     */
    public void setYOffset(float yOffset) {
        this.yOffset = yOffset;
    }

    /**
     * Gets defines the amout the world should be drawn down.
     *
     * @return Value of defines the amout the world should be drawn down.
     */
    public float getYOffset() {
        return yOffset;
    }

    /**
     * Sets new defines the amount the world should be drawn to the left.
     *
     * @param xOffset New value of defines the amount the world should be drawn to the left.
     */
    public void setXOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    /**
     * Gets defines the amount the world should be drawn to the left.
     *
     * @return Value of defines the amount the world should be drawn to the left.
     */
    public float getXOffset() {
        return xOffset;
    }
}
