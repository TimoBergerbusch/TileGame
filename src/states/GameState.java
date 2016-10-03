package states;

import java.awt.*;

import entities.creatures.Player;
import entities.statics.Tree;
import gfx.Assets;
import tilegame.Game;
import tilegame.Handler;
import tiles.Tile;
import worlds.World;

public class GameState extends State {

    private World world;

    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "res/worlds/world3.lvl");
        handler.setWorld(world);
    }

    @Override
    public void tick() {
        if(handler.getKeyManager().backToMenu)
            State.setState(handler.getGame().menuState);
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }
}
