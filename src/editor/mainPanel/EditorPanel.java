package editor.mainPanel;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import editor.WorldEditor;
import editor.choosePanel.ChoosePanel;

public class EditorPanel extends JPanel {

    public static final Border DEFAULT_BORDER = new LineBorder(Color.BLACK, 1);

    private EditorTile[][] tiles;

    private GridBagConstraints gbc;

    public EditorPanel(ChoosePanel choosePanel) {

        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;

        tiles = new EditorTile[WorldEditor.width][WorldEditor.height];
        for (int x = 0; x < WorldEditor.width; x++) {
            for (int y = 0; y < WorldEditor.height; y++) {
                tiles[x][y] = new EditorTile(choosePanel);
                this.add(tiles[x][y], gbc);
                gbc.gridy++;
            }
            gbc.gridy = 0;
            gbc.gridx++;
        }
    }
}
