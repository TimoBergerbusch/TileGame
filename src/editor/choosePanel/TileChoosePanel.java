package editor.choosePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import editor.WorldEditor;
import editor.mainPanel.EditorTile;
import gfx.Sets;

public class TileChoosePanel extends JPanel {

    public static final int tileChooserWidth = 2 * WorldEditor.tileWidth, tileChooserHeight = 2 * WorldEditor.tileHeight;

    private buttonListener buttonListener;

    public TileChoosePanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        buttonListener = new buttonListener();
        loadTiles("enviroment");
    }

    public void loadTiles(String set) {
        clear();
        switch (set) {
            case "Town":
                break;
            case "WoodFence":
                loadButtons(Sets.woodFence);
                break;
            default:
                loadButtons(Sets.enviroment);
                break;
        }
    }

    private void loadButtons(BufferedImage[] images) {
        for (BufferedImage bi : images) {
            JButton btn = new JButton(new ImageIcon(bi.getScaledInstance(tileChooserWidth, tileChooserHeight, Image.SCALE_SMOOTH)));
            btn.setPreferredSize(new Dimension(tileChooserWidth, tileChooserHeight));
            btn.setMinimumSize(new Dimension(tileChooserWidth, tileChooserHeight));
            btn.setMaximumSize(new Dimension(tileChooserWidth, tileChooserHeight));
            btn.addActionListener(buttonListener);
            this.add(btn);
        }
    }

    private void clear() {
        this.removeAll();
        this.revalidate();
        this.repaint();
    }

    private class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            ImageIcon ico = new ImageIcon(((ImageIcon) ((JButton) (e.getSource())).getIcon()).getImage().getScaledInstance(WorldEditor.tileWidth, WorldEditor.tileHeight, Image.SCALE_SMOOTH));
//            EditorTile.currentIcon = (ImageIcon) ((JButton) (e.getSource())).getIcon();
            EditorTile.currentIcon = ico;
        }
    }

}
