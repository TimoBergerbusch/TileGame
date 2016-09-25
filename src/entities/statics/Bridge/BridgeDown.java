package entities.statics.Bridge;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

public class BridgeDown extends EntityBuild {
    public BridgeDown(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        parts.add(new BridgeDownLeft(handler, x, y));
        parts.add(new BridgeStairsDownLeft(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsDownMid(handler, x + 2 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsDownRight(handler, x + 3 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeDownRight(handler, x + 4 * Tile.TILE_WIDTH, y));
    }

    @Override
    public boolean alwaysInBack() {
        return true;
    }

    @Override
    public void tick() {

    }
}
