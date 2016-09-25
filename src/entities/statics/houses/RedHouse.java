package entities.statics.houses;

import java.awt.*;

import entities.Entity;
import entities.statics.StaticEntitiy;
import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class RedHouse extends StaticEntitiy {
    public RedHouse(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH * 5, Tile.TILE_HEIGHT * 5);
        bounds.x = 0;
        bounds.y = (int) (1.5 * Tile.TILE_HEIGHT);
        bounds.width = width;
        bounds.height = (int) (height - 2.3 * Tile.TILE_HEIGHT);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.redHouse, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }
}
