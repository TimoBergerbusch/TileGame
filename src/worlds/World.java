package worlds;

import java.awt.*;

import tilegame.Game;
import tiles.StaticTiles;
import tiles.Tile;
import utils.Utils;

public class World {

    private Game game;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;

    public World(Game game, String path) {
        this.game = game;
        loadWorld(path);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                getTile(x, y).render(g, (int) (x * Tile.TILE_WIDTH - game.getGameCamera().getXOffset()),
                        (int) (y * Tile.TILE_WIDTH - game.getGameCamera().getYOffset()));
            }
        }
    }

    public Tile getTile(int x, int y) {
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

}
