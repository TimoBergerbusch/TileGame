package entities.statics.Pavilion;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

/**
 * defines a Pavilion as a subclass of {@link EntityBuild}. A pavilion is defined as <em>one</em>
 * {@link PavilionLeft},<em>one</em> {@link PavilionMid} and <em>one</em> {@link PavilionRight}
 */
public class Pavilion extends EntityBuild {

    //Constructors

    /**
     * creates a new Pavilion at a given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public Pavilion(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);

        parts.add(new PavilionLeft(handler, x, y));
        parts.add(new PavilionMid(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new PavilionRight(handler, x + 2 * Tile.TILE_WIDTH, y));

    }

    //Implemented Methods
    @Override
    public void tick() {

    }

}
