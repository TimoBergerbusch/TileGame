package WorldEditor.tileChooser;

import java.awt.*;

import WorldEditor.WorldEditor;
import tilegame.Handler;

import javax.swing.*;
import javax.swing.border.Border;

public class TileChooser {

    private JFrame frame;
    private JComboBox tileSetChooser;
    private TileGrid tileGrid;
    private Handler handler;

    public TileChooser(Handler handler) {
        this.handler = handler;
        init();
    }

    private void init() {
        frame = new JFrame("TileChooser");
        frame.setSize(250, handler.getGame().getDisplay().getFrame().getHeight() + 5);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(handler.getGame().getDisplay().getFrame().getX() + handler.getGame().getDisplay().getFrame().getWidth() - 10,
                handler.getGame().getDisplay().getFrame().getY());

        this.tileSetChooser = new JComboBox(new Object[]{"Environment", "WoodFence"});
        frame.add(tileSetChooser, BorderLayout.NORTH);

        this.tileGrid = new TileGrid(handler);
        frame.add(tileGrid, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }

    public boolean getVisible() {
        return frame.isVisible();
    }
}
