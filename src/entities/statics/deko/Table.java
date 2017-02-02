package entities.statics.deko;

import java.awt.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import tilegame.*;
import tiles.*;

public class Table extends StaticEntity {

    public enum Tabletype {
        SIMPLETABLE, CARPETTABLE, WOODGLASSTABLE, GLASSTABLEINSIDE, GLASSTABLEOUTSIDE;
    }

    private Tabletype type;

    /**
     * creates a new {@link StaticEntity}
     *
     * @param handler the {@link Handler} to the {@link Game}
     * @param x       the x-position of the {@link Entity}
     * @param y       the y-position of the {@link Entity}
     * @see Entity#Entity(Handler, float, float, int, int)
     */
    public Table(Handler handler, float x, float y, Tabletype type) {
        super(handler, x, y, 2 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);
        this.type = type;
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = width;
        bounds.height = 2 * Tile.TILE_HEIGHT;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        switch (type) {
            case CARPETTABLE:
                g.drawImage(Assets.table[1], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case WOODGLASSTABLE:
                g.drawImage(Assets.table[2], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case GLASSTABLEINSIDE:
                g.drawImage(Assets.table[3], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            case GLASSTABLEOUTSIDE:
                g.drawImage(Assets.table[4], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
                break;
            default:
                g.drawImage(Assets.table[0], (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);
        }
    }

    //GETTER AND SETTER

    /**
     * Gets type.
     *
     * @return Value of type.
     */
    public Tabletype getType() {
        return type;
    }

    /**
     * Sets new type.
     *
     * @param type New value of type.
     */
    public void setType(Tabletype type) {
        this.type = type;
    }
}
