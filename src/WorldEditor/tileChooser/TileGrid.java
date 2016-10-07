package WorldEditor.tileChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import WorldEditor.WorldEditorPanel;
import sets.StaticSets;
import tilegame.Handler;
import tiles.Tile;

public class TileGrid extends JPanel {

    private static Border currentTileBorder = new LineBorder(Color.darkGray, 2, true);
    private static Border defaultBorder = UIManager.getBorder("Button.border");
    private Handler handler;
    private GridBagConstraints gbc;
    private GridButtonListener gridButtonListener;
    private JButton currentTile;
    private int gridWidth = 5;

    public TileGrid(Handler handler) {
        this.handler = handler;
        this.setLayout(new GridBagLayout());
        gridButtonListener = new GridButtonListener();

        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
    }

    public void loadGrid(Tile[] tiles) {
        this.removeAll();
        gbc.gridy = gbc.gridx = 0;

        for (Tile t : tiles) {
            JButton b;
//            System.out.println(t.toString());
//            this.add(b = new JButton(new ImageIcon(t.getTexture().getScaledInstance(50, 50, Image.SCALE_SMOOTH))), gbc);
            this.add(b = new JButton(t.getTextureIcon()), gbc);
            b.addActionListener(gridButtonListener);
            b.setToolTipText(t.toString());
            b.setCursor(new Cursor(Cursor.HAND_CURSOR));
//            b.setMinimumSize(new Dimension(this.getWidth(), 50));
            b.setPreferredSize(new Dimension(50, 50));
//            b.setMaximumSize(new Dimension(this.getWidth(), 50));

            gbc.gridx++;
            if (gbc.gridx == gridWidth) {
                gbc.gridy++;
                gbc.gridx = 0;
            }
        }
        this.repaint();
        this.revalidate();
    }

    public class GridButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.println(((JButton) e.getSource()).getText());
//            System.out.println(WorldEditorPanel.currentTile.toString());
            WorldEditorPanel.currentTile = StaticSets.setManager.getTileByName(((JButton) e.getSource()).getToolTipText());
            WorldEditorPanel.currentTile = StaticSets.setManager.getTileByName(((JButton) e.getSource()).getToolTipText());

            if (currentTile != null)
//            {
//                System.out.println(((CompoundBorder) currentTile.getBorder()).getInsideBorder());
//                System.out.println(((CompoundBorder) currentTile.getBorder()).getOutsideBorder());
//            }
                currentTile.setBorder(defaultBorder);
            (currentTile = (JButton) e.getSource()).setBorder(currentTileBorder);
//            currentTile = (JButton) e.getSource();
//            System.out.println(currentTile.getToolTipText());
        }
    }
}
