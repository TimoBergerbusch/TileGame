package entities.statics;

import java.awt.*;

import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

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
        bounds.x = 12 * 4;
        bounds.y = 28 * 4;
        bounds.width = 8 * 4;
        bounds.height = 15 * 4;
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
