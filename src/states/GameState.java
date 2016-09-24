package states;

import java.awt.*;

import entities.creatures.Player;
import gfx.Assets;
import tilegame.Game;
import tiles.Tile;

public class GameState extends State {

    private Player player;

    public GameState(Game game) {
        super(game);
        player = new Player( game, 100, 100);
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        Tile.tiles[1] .render(g,0,0);

        player.render(g);
    }
}
