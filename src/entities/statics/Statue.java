package entities.statics;

import java.awt.*;

import entities.AbleToInteract;
import gfx.Assets;
import messages.Message;
import tilegame.Handler;
import tiles.Tile;
import messages.MessageField;

public class Statue extends StaticEntity implements AbleToInteract {

    private Message message;

    public Statue(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, 2 * Tile.TILE_HEIGHT);
        bounds.x = 0;
        bounds.y = Tile.TILE_HEIGHT;
        bounds.width = Tile.TILE_WIDTH;
        bounds.height = Tile.TILE_HEIGHT;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.statue, (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

        if (message != null)
            message.render(g);
    }

    @Override
    public void interact() {
        if (message == null)
            message = new Message(new String[]{"Hello You!", "You rock!", "Let's test how much Text i can write in here"});
        else if (!message.isLastSide())
            message.nextSide();
        else
            message = null;
    }
}
