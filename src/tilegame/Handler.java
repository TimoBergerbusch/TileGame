package tilegame;

import gfx.GameCamera;
import input.KeyManager;
import input.MouseManager;
import worlds.World;

public class Handler {

    private Game game;
    private World world;

    public Handler(Game game) {
        this.game = game;
    }

    public int getWidth() {
        return game.getWidth();
    }

    public int getHeight() {
        return game.getHeight();
    }

    public KeyManager getKeyManager() {
        return game.getKeyManager();
    }

    public MouseManager getMouseManager() {
        return game.getMouseManager();
    }

    public GameCamera getGameCamera() {
        return game.getGameCamera();
    }

    /**
     * Gets handler.
     *
     * @return Value of handler.
     */
    public Game getGame() {
        return game;
    }

    /**
     * StaticSets new handler.
     *
     * @param game New value of handler.
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Gets world.
     *
     * @return Value of world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * StaticSets new world.
     *
     * @param world New value of world.
     */
    public void setWorld(World world) {
        this.world = world;
    }


}
