package entities.statics.Pavilion;

import java.awt.*;

import entities.Entity;
import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

public class Pavilion extends EntityBuild {

    public Pavilion(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);

        parts.add(new PavilionLeft(handler, x, y));
        parts.add(new PavilionMid(handler, x + Tile.TILE_WIDTH, y));
        parts.add(new PavilionRight(handler, x + 2 * Tile.TILE_WIDTH, y));

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        for(Entity e: parts)
            e.render(g);
    }
}
