package WorldEditor.tileChooser;

import java.awt.*;

import javax.swing.*;

import gfx.Assets;
import tiles.StaticTiles;
import tiles.Tile;
import tilegame.Handler;

public class TileGrid extends JPanel {

    private Tile[] tiles;
    private Handler handler;

    public TileGrid(Handler handler) {
        this.handler = handler;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void loadGrid(Tile[] tiles) {
        this.removeAll();

        for (Tile t : tiles)
            this.add(new JButton(t.toString(), new ImageIcon(t.getTexture().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));

        this.repaint();
        this.revalidate();
    }
}
