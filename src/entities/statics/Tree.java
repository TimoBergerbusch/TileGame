package entities.statics;

import java.awt.*;

import gfx.*;
import tilegame.*;
import tiles.*;

/**
 * defines a Tree as a {@link StaticEntity}
 */
public class Tree extends StaticEntity {

    //Constructors

    /**
     * creates a new Tree at the given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public Tree(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH * 2, Tile.TILE_HEIGHT * 3);
        bounds.x = (int) (0.375*width);
        bounds.y = (int) (0.584*height);
        bounds.width = (int) (0.25*width);
        bounds.height = (int) (0.3125*height);
    }

    //Implemented Methods
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }

    @Override
    public void hurt(int amt) {
//        System.out.println("trees cant be hurt");
    }

    @Override
    public void die() {

    }
}
