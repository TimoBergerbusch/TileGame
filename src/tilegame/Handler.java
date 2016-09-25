package tilegame;

import gfx.GameCamera;
import input.KeyManager;
import worlds.World;

public class Handler {

    private Game game;
    private World world;

    public Handler(Game game) {
        this.game = game;
    }

    public int getWidth(){
        return game.getWidth();
    }

    public int getHeight(){
        return game.getHeight();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public GameCamera getGameCamera(){
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
     * Gets world.
     *
     * @return Value of world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * Sets new world.
     *
     * @param world New value of world.
     */
    public void setWorld(World world) {
        this.world = world;
    }

    /**
     * Sets new handler.
     *
     * @param game New value of handler.
     */
    public void setGame(Game game) {
        this.game = game;
    }
}
