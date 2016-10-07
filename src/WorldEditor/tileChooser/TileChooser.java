package WorldEditor.tileChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import WorldEditor.WorldEditorPanel;
import sets.StaticSets;
import tilegame.Handler;

public class TileChooser {

    private JFrame frame;
    private JComboBox tileSetChooser;
    private JLabel currentTileInformation;
    private TileGrid tileGrid;
    private Handler handler;

    public TileChooser(Handler handler) {
        this.handler = handler;
        init();
    }

    private void init() {
        frame = new JFrame("TileChooser");
        frame.setSize(270, handler.getGame().getDisplay().getFrame().getHeight() + 5);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(handler.getGame().getDisplay().getFrame().getX() + handler.getGame().getDisplay().getFrame().getWidth() - 10,
                handler.getGame().getDisplay().getFrame().getY());

        this.tileSetChooser = new JComboBox(StaticSets.setManager.getSetNames());
        this.tileSetChooser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.tileSetChooser.addActionListener(new tileSetChosserActionListener());
        frame.add(tileSetChooser, BorderLayout.NORTH);

        this.tileGrid = new TileGrid(handler);
        this.tileGrid.loadGrid(StaticSets.allTiles);
        JScrollPane sp = new JScrollPane(tileGrid);
        sp.getVerticalScrollBar().setUnitIncrement(15);
        frame.add(sp, BorderLayout.CENTER);

        currentTileInformation = new JLabel("none");
        this.frame.add(currentTileInformation, BorderLayout.SOUTH);
//        frame.setVisible(true);
    }

    public boolean getVisible() {
        return frame.isVisible();
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }

    public void setCurrentTileInformation() {
        currentTileInformation.setText(WorldEditorPanel.currentTile.toString());
    }

    public class tileSetChosserActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox box = (JComboBox) e.getSource();

            tileGrid.loadGrid(StaticSets.setManager.getSetCombination(((JComboBox) e.getSource()).getSelectedItem().toString()).getTiles());
        }
    }


}
