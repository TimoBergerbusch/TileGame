package gfx;


import entities.Entity;
import tilegame.Game;

public class GameCamera {

    private Game game;
    private float xOffset, yOffset;

    public GameCamera(Game game, float xOffset, float yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.game = game;
    }

    public void move(float xAmt, float yAmt) {
        xOffset += xAmt;
        yOffset += yAmt;
    }

    public void centerOnEntity(Entity e) {
        xOffset = e.getX() - game.getWidth() / 2 + e.getWidth() / 2;
        yOffset = e.getY() - game.getHeight() / 2 + e.getHeight() / 2;
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
