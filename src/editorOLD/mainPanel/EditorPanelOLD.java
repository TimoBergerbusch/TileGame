package editorOLD.mainPanel;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import editorOLD.WorldEditorOLD;
import editorOLD.choosePanel.ChoosePanelOLD;

public class EditorPanelOLD extends JPanel {

    public static final Border DEFAULT_BORDER = new LineBorder(Color.BLACK, 1);

    private EditorTileOLD[][] tiles;

    private GridBagConstraints gbc;

    public EditorPanelOLD(ChoosePanelOLD choosePanel) {

        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;

        tiles = new EditorTileOLD[WorldEditorOLD.width][WorldEditorOLD.height];
        for (int x = 0; x < WorldEditorOLD.width; x++) {
            for (int y = 0; y < WorldEditorOLD.height; y++) {
                tiles[x][y] = new EditorTileOLD(choosePanel);
                this.add(tiles[x][y], gbc);
                gbc.gridy++;
            }
            gbc.gridy = 0;
            gbc.gridx++;
        }
    }
}
