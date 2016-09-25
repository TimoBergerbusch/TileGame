package worlds;

import java.awt.*;

import entities.EntityManager;
import entities.creatures.Player;
import entities.statics.Pavilion.Pavilion;
import entities.statics.Pavilion.PavilionLeft;
import entities.statics.Pavilion.PavilionMid;
import entities.statics.Pavilion.PavilionRight;
import entities.statics.TestBuild;
import entities.statics.Tree;
import entities.statics.houses.GreenHouse;
import tilegame.Handler;
import tiles.StaticTiles;
import tiles.Tile;
import utils.Utils;

public class World {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    //entites
    private EntityManager entityManager;

    public World(Handler handler, String path) {
        this.handler = handler;
        entityManager = new EntityManager(handler, new Player(handler, 100, 100));
//        entityManager.addEntity(new Tree(handler, 2 * Tile.TILE_WIDTH, 5 * Tile.TILE_HEIGHT));

        for (int x = 0; x < handler.getGame().getWidth(); x += 2) {
            entityManager.addEntity(new Tree(handler, x * Tile.TILE_WIDTH, -Tile.TILE_HEIGHT));
        }

        entityManager.addEntity(new Tree(handler, 3 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT));
        entityManager.addEntity(new Tree(handler, 3 * Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new Tree(handler, 3 * Tile.TILE_WIDTH, 3 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new Tree(handler, Tile.TILE_WIDTH, 5 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new Tree(handler, 3 * Tile.TILE_WIDTH, 5 * Tile.TILE_HEIGHT));
//        entityManager.addEntity(new GreenHouse(handler, 4 * Tile.TILE_WIDTH, Tile.TILE_HEIGHT));

        entityManager.addEntity(new TestBuild(handler, 10*Tile.TILE_WIDTH,10*Tile.TILE_HEIGHT));
//        entityManager.addEntity(new PavilionLeft(handler,10*Tile.TILE_WIDTH,10*Tile.TILE_HEIGHT));
//        entityManager.addEntity(new PavilionMid(handler,11*Tile.TILE_WIDTH,10*Tile.TILE_HEIGHT));
//        entityManager.addEntity(new PavilionRight(handler,12*Tile.TILE_WIDTH,10*Tile.TILE_HEIGHT));

        loadWorld(path);

        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }

    public void tick() {
        entityManager.tick();
    }

    public void render(Graphics g) {
        int xStart = (int) Math.max(0, handler.getGameCamera().getXOffset() / Tile.TILE_WIDTH);
        int xEnd = (int) Math.min(width, (handler.getGameCamera().getXOffset() + handler.getWidth()) / Tile.TILE_WIDTH + 1);
        int yStart = (int) Math.max(0, handler.getGameCamera().getYOffset() / Tile.TILE_HEIGHT);
        int yEnd = (int) Math.min(height, (handler.getGameCamera().getYOffset() + handler.getHeight()) / Tile.TILE_HEIGHT + 1);

        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {
                getTile(x, y).render(g, (int) (x * Tile.TILE_WIDTH - handler.getGameCamera().getXOffset()),
                        (int) (y * Tile.TILE_WIDTH - handler.getGameCamera().getYOffset()));
            }
        }

        entityManager.render(g);
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return StaticTiles.grassTile;
//        System.out.println(x + "\t" + y + "\t" + tiles[x][y]);
        Tile t = StaticTiles.tiles[tiles[x][y]];
        if (t == null)
            return StaticTiles.grassTile;
        return t;
    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");

        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[width][height];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
    }


    /**
     * Sets new width.
     *
     * @param width New value of width.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets width.
     *
     * @return Value of width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets height.
     *
     * @return Value of height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
