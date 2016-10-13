package WorldEditor;

import java.awt.*;
import java.io.*;

import tilegame.*;
import tiles.*;
import ui.*;
import utils.*;

public class WorldEditorPanel {

    public static Tile currentTile = StaticTiles.grassTile;
    public static int width, height, spawnX, spawnY;
    public static int EDITOR_TILE_WIDTH = 32, EDITOR_TILE_HEIGHT = 32;
    public static int xOffset = 0, yOffset = 0;

    private Handler handler;
    private UITileButton[][] tiles;
    private UITileButton spawn;
    private WorldEditor worldEditor;

    public WorldEditorPanel(Handler handler, WorldEditor worldEditor, String path) {
        this.handler = handler;
        this.worldEditor = worldEditor;

        loadWorld(path);
    }

    public void tick() {
        double factor = 0.3;
        if (handler.getKeyManager().left)
            xOffset -= EDITOR_TILE_WIDTH * factor;
        if (handler.getKeyManager().right)
            xOffset += EDITOR_TILE_WIDTH * factor;
        if (handler.getKeyManager().up)
            yOffset -= EDITOR_TILE_HEIGHT * factor;
        if (handler.getKeyManager().down)
            yOffset += EDITOR_TILE_HEIGHT * factor;

        fixOffsets();
    }

    private void fixOffsets() {
        if (xOffset > width * EDITOR_TILE_WIDTH - EDITOR_TILE_WIDTH)
            xOffset = width * EDITOR_TILE_WIDTH - EDITOR_TILE_WIDTH;
        if (xOffset < 0)
            xOffset = 0;
        if (yOffset > (height * EDITOR_TILE_HEIGHT) - EDITOR_TILE_HEIGHT)
            yOffset = height * EDITOR_TILE_HEIGHT - EDITOR_TILE_HEIGHT;
        if (yOffset < 0)
            yOffset = 0;
    }

    public void render(Graphics g) {
    }

    private void loadWorld(String path) {
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");

        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new UITileButton[width][height];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                tiles[x][y] = new UITileButton(handler, StaticTiles.getNumbersTile(Utils.parseInt(tokens[x + y * width + 4])), x * EDITOR_TILE_WIDTH,
                        y * EDITOR_TILE_HEIGHT, EDITOR_TILE_WIDTH, EDITOR_TILE_HEIGHT);
                worldEditor.getUiManager().addObject(tiles[x][y]);
            }
        spawn = tiles[spawnX / Tile.TILE_WIDTH + 1][spawnY / Tile.TILE_HEIGHT + 1];
        spawn.isSpawn = true;
    }

    public void saveWorld() {
        StringBuilder sb = new StringBuilder();
        sb.append(width).append(" ").append(height).append("\n");
        sb.append(spawnX).append(" ").append(spawnY).append("\n");
        for (int y = 0; y < tiles[0].length; y++) {
            for (int x = 0; x < tiles.length; x++)
                sb.append(StaticTiles.getTilesNumber(tiles[x][y].getTile())).append(" ");
            sb.append("\n");
        }

        Utils.saveWorld(sb.toString());
        handler.getWorld().getEntityManager().save();
    }

    public void loadWorld() {
        String s = Utils.loadWorld();

        clear();

        loadWorld(s);
    }

    public void loadWorld(File f) {
        clear();
        loadWorld(f.getPath());
    }

    public void clear() {
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                worldEditor.uiManager.removeObject(tiles[x][y]);
//                tiles[x][y] = null;
            }
        worldEditor.uiManager.removeObject(spawn);
        handler.getGame().getDisplay().getFrame().revalidate();
        handler.getGame().getDisplay().getFrame().repaint();
    }

    public void setSpawn(int x, int y) {
        if (0 <= x && x <= tiles.length && 0 <= y && y <= tiles[0].length) {
            spawn.isSpawn = false;
            tiles[x][y].isSpawn = true;
            spawnX = x * Tile.TILE_WIDTH;
            spawnY = y * Tile.TILE_HEIGHT;
        }
    }
}
