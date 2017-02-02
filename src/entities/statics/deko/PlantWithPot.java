package entities.statics.deko;

import java.awt.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;

import static javafx.scene.paint.Color.*;

public class PlantWithPot extends StaticEntity {

    private javafx.scene.paint.Color color = WHITE;

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public PlantWithPot(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = Tile.TILE_WIDTH;
        bounds.height = Tile.TILE_HEIGHT;
    }

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public PlantWithPot(Handler handler, float x, float y, javafx.scene.paint.Color color) {
        this(handler, x, y);
        this.color = color;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if (color == BROWN)
            g.drawImage(Assets.plantWithPot[1], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
        else
            g.drawImage(Assets.plantWithPot[0], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
    }
}
