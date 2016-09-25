package gfx;


import entities.Entity;
import tilegame.Handler;
import tiles.Tile;

public class GameCamera {

    private Handler handler;
    private float xOffset, yOffset;

    public GameCamera(Handler handler, float xOffset, float yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.handler = handler;
    }

    public void move(float xAmt, float yAmt) {
        xOffset += xAmt;
        yOffset += yAmt;

        checkBlankSpace();
    }

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

    public void centerOnEntity(Entity e) {
        xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
        yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight() / 2;

        checkBlankSpace();
    }


    /**
     * Sets new yOffset.
     *
     * @param yOffset New value of yOffset.
     */
    public void setYOffset(float yOffset) {
        this.yOffset = yOffset;
    }

    /**
     * Gets xOffset.
     *
     * @return Value of xOffset.
     */
    public float getXOffset() {
        return xOffset;
    }

    /**
     * Sets new xOffset.
     *
     * @param xOffset New value of xOffset.
     */
    public void setXOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    /**
     * Gets yOffset.
     *
     * @return Value of yOffset.
     */
    public float getYOffset() {
        return yOffset;
    }
}
