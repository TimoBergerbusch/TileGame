package states;

import java.awt.*;

import tilegame.*;
import worlds.*;

public class GameState extends State {

    private World world;

    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "res/worlds/test.lvl");
        handler.setWorld(world);
    }

    @Override
    public void tick() {
        if (handler.getKeyManager().backToMenu)
            State.setState(handler.getGame().menuState);
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }
}
