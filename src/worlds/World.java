package worlds;

import java.awt.*;
import java.io.*;

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
    private String name;

    public World(Handler handler, String path) {
        System.out.println(path);
        this.handler = handler;
        setName(path);
        handler.setWorld(this);
        messageManager = new MessageManager(handler);
        entityManager = new EntityManager(handler, new Player(handler, 100, 100, false));

        //TestEntitys
        loadEntitys(path);
        //TestEntitys

        loadWorld(path);

        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }

    private void loadEntitys(String path) {
        if (path.equals("res/worlds/test.lvl")) {
            entityManager.addEntity(new BridgeDown(handler, 6 * Tile.TILE_WIDTH, 12 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 13 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new BridgePost(handler, 6 * Tile.TILE_WIDTH, 14 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 15 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new BridgeHandrail(handler, 6 * Tile.TILE_WIDTH, 16 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new BridgeUp(handler, 6 * Tile.TILE_WIDTH, 17 * Tile.TILE_HEIGHT));

//        loadEntitys(path);
            entityManager.addEntity(new Statue(handler, 4 * Tile.TILE_WIDTH, 8 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new MetalSign(handler, 3 * Tile.TILE_WIDTH, 9 * Tile.TILE_HEIGHT, new Message(new String[]{"Park der Vergessenen", "Hier liegen die Stunden in denen ich hätte schlafen sollen. Mögen sie mehr Ruhe bekommen als ich. "}, Assets.metalSignBackground, new Font("Times New Roman", Font.BOLD, 45))));
            entityManager.addEntity(new WoodSign(handler, 5 * Tile.TILE_WIDTH, 9 * Tile.TILE_HEIGHT, new Message(new String[]{"Schriftrollenbeispiel"}, Assets.scriptRollBackground, new Font("Times New Roman", Font.ITALIC, 45))));

            entityManager.addEntity(new Pavilion(handler, 25 * Tile.TILE_WIDTH, 14 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new MetalSign(handler, 28 * Tile.TILE_WIDTH, 16 * Tile.TILE_HEIGHT, new Message(new String[]{"Herzlich Willkommen in Snu-Snu-Town"})));
            entityManager.addEntity(new LandscapeHouseGreen(handler, 28 * Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new LandscapeHouseRed(handler, 20 * Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT));

            entityManager.addEntity(new LandscapeHouseGreenSmall(handler, 28 * Tile.TILE_WIDTH, 6 * Tile.TILE_HEIGHT));
            entityManager.addEntity(new LandscapeHouseGreySmall(handler, 33 * Tile.TILE_WIDTH, 6 * Tile.TILE_HEIGHT));

            entityManager.addEntity(new BigStore(handler, 20 * Tile.TILE_WIDTH, 6 * Tile.TILE_HEIGHT));

            entityManager.addEntity(new Grandparent(handler, 19 * Tile.TILE_WIDTH, 11 * Tile.TILE_HEIGHT, false, true, Direction.LEFT, new Message(new String[]{"Das neben mir ist meine süse kleine Frau.", "Ich nenne sie liebevoll Mrs. Puddels Otterton."})));
            entityManager.addEntity(new Grandparent(handler, 19 * Tile.TILE_WIDTH, (float) (11.5 * Tile.TILE_HEIGHT), false, false, Direction.LEFT, new Message(new String[]{"Das neben mir ist mein Puschler.", "Wir sind schon weit über 60 Jahre verheiratet und ich liebe ihn jeden Tag mehr."})));
        } else if (path.equals("res/worlds/IndoorTest1.lvl")) {
            entityManager.addEntity(new Carpet(handler, 8 * Tile.TILE_WIDTH, 11 * Tile.TILE_HEIGHT));
        }
    }

//    private void loadEntitys(String path) {
//        String[] entitys = Utils.loadFileAsString(path + ".ntt").split("\n");
//        if (entitys[0].equals(""))
//            return;
//        for (int i = 0; i < entitys.length; i++) {
//            String[] entity = entitys[i].split("/nbsp/");
//            Message message = null;
//            if (!entity[5].equals("no message"))
//                message = new Message(entity[5].split("/nbspA/"), Assets.greyBackground);
//
//            entityManager.addEntity(StaticEntitys.createStaticEntity(handler, Utils.parseInt(entity[0]), Utils.parseInt(entity[1]), Utils.parseInt(entity[2]), message));
//        }
//    }

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

        setName(path);

        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        checkIfContinueMap(new File(path).getName());

        tiles = new int[width][height];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
                checkForEntites(x, y);
            }

    }

    private void checkIfContinueMap(String path) {
        String[] tmpPos = Utils.loadFileAsString("res/worlds/tmp").split("\\s+");
        for (int i = 0; i < tmpPos.length; i += 3) {
            if (tmpPos[i].equals(path)) {
                spawnX = Utils.parseInt(tmpPos[i + 1]);
                spawnY = Utils.parseInt(tmpPos[i + 2]);
            }
        }
    }

    private void checkForEntites(int x, int y) {
        checkIfTree(x, y);
    }

    private void checkIfTree(int x, int y) {
        if (getTile(x, y) instanceof TreeShadowRightTile) {
            if (x == 0 || getTile(x - 1, y) instanceof TreeShadowLeftTile) {
                entityManager.addEntity(new Tree(handler, (x - 1) * Tile.TILE_WIDTH, (y - 2) * Tile.TILE_HEIGHT));
            }
        }
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

    public String getName() {
        return name;
    }

    public void setName(String path) {
        this.name = new File(path).getName();
    }

    public void changeLevel(String enteredWorld) {
        saveCurrentPosition();
        entityManager.clear();
        loadWorld(enteredWorld);
//        entityManager.getPlayer().setX(this.spawnX);
//        entityManager.getPlayer().setY(this.spawnY);
        entityManager.getPlayer().setPositionOnTile(this.spawnX, this.spawnY);
        loadEntitys(enteredWorld);
    }

    private void saveCurrentPosition() {
        boolean saved = false;
        String[] tokens = Utils.loadFileAsString("res/worlds/tmp").split("\\s+");
        for (int i = 0; i < tokens.length; i += 3) {
            if (tokens[i].equals(name)) {
                tokens[i + 1] = entityManager.getPlayer().getX() + "";
                tokens[i + 2] = entityManager.getPlayer().getY() + "";
                saved = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length - 2; i += 3) {
            sb.append(tokens[i]).append(" ");
            sb.append(tokens[i + 1]).append(" ");
            sb.append(tokens[i + 2]).append("\n");
        }
        if (!saved) {
            sb.append(name).append(" ");
            sb.append(entityManager.getPlayer().getX() + "").append(" ");
            sb.append(entityManager.getPlayer().getY() + "").append("\n");
        }
        Utils.printIntoFile(new File("res/worlds/tmp"), sb.toString());
    }
//    private void saveCurrentPosition() {
//        System.out.println("res/worlds/" + name);
//        String[] tokens = Utils.loadFileAsString("res/worlds/" + name).split("\\s+");
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(tokens[0]).append(" ").append(tokens[1]).append("\n");
//        sb.append((int) entityManager.getPlayer().getX()).append(" ").append((int) entityManager.getPlayer().getY()).append("\n");
//        for (int y = 0; y < tiles[0].length; y++) {
//            for (int x = 0; x < tiles.length; x++)
//                sb.append(tiles[x][y]).append(" ");
//            sb.append("\n");
//        }
//        Utils.printIntoFile(new File("res/worlds/" + name), sb.toString());
//    }
}
