package entities.statics.deko;

import java.awt.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;
import utils.*;

public class Carpet extends StaticEnterAbleEntity {
    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public Carpet(Handler handler, float x, float y) {
        super(handler, x, y, 2 * Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        bounds.setBounds(0, 0, 0, 0);

        computeEnterBounds(Direction.DOWN);

        enteredWorld = "res/worlds/test.lvl";
    }

    @Override
    public void tick() {

    }

    @Override
    public boolean alwaysInBack() {
        return true;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.carpet, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height/2, null);
        g.drawImage(Assets.blackTile, (int) (x - handler.getGameCamera().getXOffset()), (int) (y + Tile.TILE_HEIGHT - handler.getGameCamera().getYOffset()), width, height, null);
        g.drawImage(Assets.blackTile, (int) (x + Tile.TILE_WIDTH - handler.getGameCamera().getXOffset()), (int) (y + Tile.TILE_HEIGHT - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
//        g.setColor(Color.yellow);
//        g.fillRect((int) (x + enterBounds.x - handler.getGameCamera().getXOffset()), (int) (y + enterBounds.y - handler.getGameCamera().getYOffset()), enterBounds.width, enterBounds.height);
    }
}
