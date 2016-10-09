package worlds;

import java.awt.*;

import entities.*;
import entities.creatures.*;
import entities.creatures.persons.*;
import entities.statics.Bridge.*;
import entities.statics.*;
import entities.statics.Pavilion.*;
import entities.statics.houses.*;
import gfx.*;
import messages.*;
import tilegame.*;
import tiles.*;
import utils.*;

public class World {

    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    //entites
    private EntityManager entityManager;
    private MessageManager messageManager;

    public World(Handler handler, String path) {
        this.handler = handler;
        handler.setWorld(this);
        messageManager = new MessageManager(handler);
        entityManager = new EntityManager(handler, new Player(handler, 100, 100));

        //TestEntitys
        entityManager.addEntity(new BridgeDown(handler, 6 * Tile.TILE_WIDTH, 12 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 13 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new BridgePost(handler, 6 * Tile.TILE_WIDTH, 14 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 15 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 16 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new BridgeUp(handler, 6 * Tile.TILE_WIDTH, 17 * Tile.TILE_HEIGHT));

        entityManager.addEntity(new Statue(handler, 4 * Tile.TILE_WIDTH, 8 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new MetalSign(handler, 3 * Tile.TILE_WIDTH, 9 * Tile.TILE_HEIGHT, new Message(new String[]{"Park der Vergessenen", "Hier liegen die Stunden in denen ich hätte schlafen sollen. Mögen sie mehr Ruhe bekommen als ich. "}, Assets.metalSignBackground, new Font("Times New Roman", Font.BOLD, 45))));
        entityManager.addEntity(new WoodSign(handler, 5 * Tile.TILE_WIDTH, 9 * Tile.TILE_HEIGHT, new Message(new String[]{"Schriftrollenbeispiel"}, Assets.scriptRollBackground, new Font("Times New Roman", Font.ITALIC, 45))));

        entityManager.addEntity(new Pavilion(handler, 39 * Tile.TILE_WIDTH, 15 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new MetalSign(handler, 30 * Tile.TILE_WIDTH, 13 * Tile.TILE_HEIGHT));
        entityManager.addEntity(new GreenHouse(handler, 28 * Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT));

        entityManager.addEntity(new Grandfather(handler, 1100, 1100, Assets.grandfather));
        entityManager.addEntity(new Grandmother(handler, 1164, 1100, Assets.grandmother));
        //TestEntitys

        loadWorld(path);

        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }

    public void tick() {
        entityManager.tick();
        messageManager.tick();
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
        messageManager.render(g);
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return StaticTiles.grassTile;
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
            for (int x = 0; x < width; x++) {
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
                checkForEntites(x, y);
            }

    }

    private void checkForEntites(int x, int y) {
        checkIfTree(x, y);
        checkIfEnviromentEntity(x, y);
    }

    private void checkIfTree(int x, int y) {
        if (getTile(x, y) instanceof TreeShadowRightTile) {
            if (x == 0 || getTile(x - 1, y) instanceof TreeShadowLeftTile) {
                entityManager.addEntity(new Tree(handler, (x - 1) * Tile.TILE_WIDTH, (y - 2) * Tile.TILE_HEIGHT));
            }
        }
    }

    private void checkIfEnviromentEntity(int x, int y) {
        if (getTile(x, y) instanceof FarneTile) {
            entityManager.addEntity(new Farne(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT));
        } else if (getTile(x, y) instanceof MetalSignTile)
            entityManager.addEntity(new MetalSign(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT));
    }

    //Getters and Setters

    /**
     * Gets width.
     *
     * @return Value of width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * StaticSets new width.
     *
     * @param width New value of width.
     */
    public void setWidth(int width) {
        this.width = width;
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
     * StaticSets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
