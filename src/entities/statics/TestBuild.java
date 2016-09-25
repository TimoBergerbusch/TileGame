package entities.statics;

import java.awt.*;

import entities.EntityBuild;
import entities.statics.Pavilion.Pavilion;
import tilegame.Handler;
import tiles.Tile;

public class TestBuild extends EntityBuild {
    public TestBuild(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);

        parts.add(new Pavilion(handler,x,y));
    }

    @Override
    public void tick() {

    }

}
