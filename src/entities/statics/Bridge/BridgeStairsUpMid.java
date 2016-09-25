package entities.statics.Bridge;

import java.awt.*;

import entities.statics.StaticEntity;
import gfx.Assets;
import tilegame.Handler;
import tiles.Tile;

public class BridgeStairsUpMid extends StaticEntity {
    public BridgeStairsUpMid(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
        bounds=null;
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
        g.drawImage(Assets.bridgeStairsUpMid, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);

    }
}
