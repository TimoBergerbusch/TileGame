package entities.statics.deko;

import java.awt.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;
import utils.*;

import static utils.Direction.*;

public class WoodChair extends StaticEntity {

    private Direction direction;

    //Constructors

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public WoodChair(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        direction = DOWN;

        initBounds();
    }

    public WoodChair(Handler handler, float x, float y, Direction direction) {
        this(handler, x, y);
        this.setDirection(direction);
    }

    //Methods
    private void initBounds() {
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.height = Tile.TILE_HEIGHT;
        bounds.width = Tile.TILE_WIDTH;
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

//        renderBounds(g);
        switch (direction) {
            case RIGHT:
                g.drawImage(Assets.chair[3], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case LEFT:
                g.drawImage(Assets.chair[2], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case UP:
                g.drawImage(Assets.chair[1], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            default:
                g.drawImage(Assets.chair[0], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
        }

//        renderBounds(g);
    }


    /**
     * Gets direction.
     *
     * @return Value of direction.
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets new direction.
     *
     * @param direction New value of direction.
     */
    public void setDirection(Direction direction) {
        this.direction = direction;

//        initBounds();
    }
}
