package entities.statics.Bridge;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

public class BridgeUp extends EntityBuild {
    public BridgeUp(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        parts.add(new BridgeUpLeft(handler, x, y));
        parts.add(new BridgeStairsUpLeft(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsUpMid(handler, x + 2 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsUpRight(handler, x + 3 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeUpRight(handler, x + 4 * Tile.TILE_WIDTH, y));
    }

    @Override
    public boolean alwaysInBack() {
        return true;
    }

    @Override
    public void tick() {

    }
}
