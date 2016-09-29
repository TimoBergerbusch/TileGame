package entities.statics.Bridge;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines the part up a bridge as a subclass of {@link EntityBuild}
 */
public class BridgeUp extends EntityBuild {

    //Constructors

    /**
     * creates a new {@link BridgeUp} at the given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public BridgeUp(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        parts.add(new BridgeUpLeft(handler, x, y));
        parts.add(new BridgeStairsUpLeft(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsUpMid(handler, x + 2 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeStairsUpRight(handler, x + 3 * Tile.TILE_WIDTH, y));
        parts.add(new BridgeUpRight(handler, x + 4 * Tile.TILE_WIDTH, y));
    }

    //Implemented Methods
    @Override
    public boolean alwaysInBack() {
        return true;
    }

    @Override
    public void tick() {

    }
}
