package WorldEditor.tileChooser;

import java.awt.*;

import javax.swing.*;

import gfx.Assets;
import tiles.Tile;
import tilegame.Handler;

public class TileGrid extends JPanel {

    private Tile[] tiles;
    private Handler handler;

    public TileGrid(Handler handler) {
        this.handler = handler;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(new JButton(new ImageIcon(Assets.grass.getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        this.add(new JButton(new ImageIcon(Assets.roundBush.getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        this.add(new JButton(new ImageIcon(Assets.deepWater.getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
    }
}
