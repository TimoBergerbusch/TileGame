package entities.statics.deko;

import java.awt.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;
import utils.*;

import static utils.Direction.*;

public class Couch extends StaticEntity {

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
    public Couch(Handler handler, float x, float y) {
        super(handler, x, y, 2 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);
        direction = LEFT;

        initBounds();
    }

    public Couch(Handler handler, float x, float y, Direction direction) {
        this(handler, x, y);
        this.setDirection(direction);
    }

    //Methods
    private void initBounds() {
        if (direction == RIGHT) {
            bounds.x = (int) (0.8 * Tile.TILE_WIDTH);
            bounds.y = (int) (0.5 * Tile.TILE_HEIGHT);
            bounds.height = (int) (2.5 * Tile.TILE_HEIGHT);
            bounds.width = 2 * Tile.TILE_WIDTH - bounds.x;
        } else if (direction == LEFT) {
            bounds.x = 0;
            bounds.y = (int) (0.5 * Tile.TILE_HEIGHT);
            bounds.height = (int) (2.5 * Tile.TILE_HEIGHT);
            bounds.width = (int) (1.2 * Tile.TILE_WIDTH);
        } else {
            bounds.x = 0;
            bounds.y = (int) (0.5 * Tile.TILE_HEIGHT);
            bounds.height = (int) (1.5 * Tile.TILE_HEIGHT);
            bounds.width = 3 * Tile.TILE_WIDTH;
        }
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        switch (direction) {
            case RIGHT:
                g.drawImage(Assets.couch[1], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case LEFT:
                g.drawImage(Assets.couch[2], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            default:
                g.drawImage(Assets.couch[0], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
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
        if ((this.direction == LEFT || this.direction == Direction.RIGHT) && (direction == DOWN || direction == Direction.UP) ||
                (this.direction == UP || this.direction == Direction.DOWN) && (direction == RIGHT || direction == Direction.LEFT)) {
            int tmp = this.width;
            this.width = this.height;
            this.height = tmp;
        }
        this.direction = direction;

        initBounds();
    }
}
