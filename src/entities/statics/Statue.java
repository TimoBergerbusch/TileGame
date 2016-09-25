package entities.statics;

import java.awt.*;

import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class Statue extends StaticEntity {
    public Statue(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = Tile.TILE_WIDTH;
        bounds.height = Tile.TILE_HEIGHT;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.statue, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
