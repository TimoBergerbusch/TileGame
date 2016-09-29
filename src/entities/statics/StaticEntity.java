package entities.statics;

import entities.Entity;
import tilegame.Handler;

/**
 * a class to represent every element of the game, which can't be shown as a {@link tiles.Tile}, or
 * which should have custom <code>CollisionBounds</code> <em>without</em> the ability to move
 */
public abstract class StaticEntity extends Entity {

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @param width   the width of the {@link Entity}
     * @param height  the height of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public StaticEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
    }

    @Override
    public void die() {

    }
}
