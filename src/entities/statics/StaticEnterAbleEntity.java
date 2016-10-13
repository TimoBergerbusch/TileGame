package entities.statics;

import java.awt.*;

import entities.*;
import tilegame.*;
import tiles.*;
import utils.*;

public abstract class StaticEnterAbleEntity extends StaticEntity {

    protected Rectangle enterBounds;
    protected String enteredWorld = "res/worlds/IndoorTest1.lvl";

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @param width   the width of the {@link Entity}
     * @param height  the height of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public StaticEnterAbleEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);

        enterBounds = new Rectangle();
    }


    /**
     * Gets enteredWorld.
     *
     * @return Value of enteredWorld.
     */
    public String getEnteredWorld() {
        return enteredWorld;
    }

    public Rectangle getEnterBounds(float xOffset, float yOffset) {
        if (enterBounds == (null)) {
            return new Rectangle(0, 0, 0, 0);
        }
        return new Rectangle((int) (x + enterBounds.x + xOffset), (int) (y + enterBounds.y + yOffset), enterBounds.width, enterBounds.height);
    }

    /**
     * Sets new enteredWorld.
     *
     * @param enteredWorld New value of enteredWorld.
     */
    public void setEnteredWorld(String enteredWorld) {
        this.enteredWorld = enteredWorld;
    }

    /**
     * Sets new enterBounds.
     *
     * @param enterBounds New value of enterBounds.
     */
    public void setEnterBounds(Rectangle enterBounds) {
        this.enterBounds = enterBounds;
    }

    protected void computeEnterBounds(int xOffset) {
        enterBounds.x = xOffset;
        enterBounds.y = this.height / 2;
        enterBounds.width = Tile.TILE_WIDTH;
        enterBounds.height = bounds.y - enterBounds.y + bounds.height;
    }

    protected void computeEnterBounds(int xOffset, int width) {
        this.computeEnterBounds(xOffset);
        enterBounds.width = width;
    }

    protected void computeEnterBounds(Direction direction) {
        if (direction == Direction.DOWN) {
            enterBounds.x = 0;
            enterBounds.width = width;
            enterBounds.height = enterBounds.y = height / 2;
        }
    }

    /**
     * Gets enterBounds.
     *
     * @return Value of enterBounds.
     */
    public Rectangle getEnterBounds() {
        return enterBounds;
    }
}
