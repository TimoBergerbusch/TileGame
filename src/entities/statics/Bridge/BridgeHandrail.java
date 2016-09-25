package entities.statics.Bridge;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

public class BridgeHandrail extends EntityBuild {

    public BridgeHandrail(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        parts.add(new BridgeHandrailLeft(handler, x, y));
        parts.add(new BridgePlanksEndLeft(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new BridgePlanksMid(handler, x + 2 * Tile.TILE_WIDTH, y));
        parts.add(new BridgePlanksEndRight(handler, x + 3 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeHandrailRight(handler, x + 4 * Tile.TILE_WIDTH, y));
    }

    @Override
    public boolean alwaysInBack() {
        return true;
    }

    @Override
    public void tick() {

    }
}
