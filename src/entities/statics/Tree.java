package entities.statics;

import java.awt.*;

import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class Tree extends StaticEntitiy {

    public Tree(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH * 2, Tile.TILE_HEIGHT * 3);
        bounds.x = 12 * 4;
        bounds.y = 28 * 4;
        bounds.width = 8 * 4;
        bounds.height = 15 * 4;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
