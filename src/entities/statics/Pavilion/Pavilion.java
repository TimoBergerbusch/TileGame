package entities.statics.Pavilion;

import java.awt.*;

import entities.EntityBuild;
import tilegame.Handler;
import tiles.Tile;

public class Pavilion extends EntityBuild {

    private PavilionLeft pL;
    private PavilionMid pM;
    private PavilionRight pR;

    public Pavilion(Handler handler, float x, float y) {
        super(handler, x, y, 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT);

        pL = new PavilionLeft(handler, x, y);
        pM = new PavilionMid(handler, x + Tile.TILE_WIDTH, y);
        pR = new PavilionRight(handler, x + 2 * Tile.TILE_WIDTH, y);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        pL.render(g);
        pM.render(g);
        pR.render(g);
    }

    @Override
    public boolean checkEntityCollision(float xOffset, float yOffset) {
        return pL.checkEntityCollision(xOffset, yOffset) || pM.checkEntityCollision(xOffset, yOffset) ||
                pR.checkEntityCollision(xOffset, yOffset);
    }

    @Override
    public Rectangle getCollisionBounds(float xOffset, float yOffset) {
        return new Rectangle(0,0);
    }
}
