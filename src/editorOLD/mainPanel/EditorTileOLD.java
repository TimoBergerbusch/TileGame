package editorOLD.mainPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import editorOLD.choosePanel.ChoosePanelOLD;
import gfx.Assets;

import static editorOLD.WorldEditorOLD.tileHeight;
import static editorOLD.WorldEditorOLD.tileWidth;
import static editorOLD.mainPanel.EditorPanelOLD.DEFAULT_BORDER;

public class EditorTileOLD extends JButton {

    public static ImageIcon currentIcon = new ImageIcon(Assets.metalSign.getScaledInstance(tileWidth, tileWidth, Image.SCALE_SMOOTH));

    public EditorTileOLD(ChoosePanelOLD choosePanel) {
        super(new ImageIcon(Assets.grass.getScaledInstance(tileWidth, tileHeight, Image.SCALE_SMOOTH)));
        this.setPreferredSize(new Dimension(tileWidth, tileHeight));
        this.setMinimumSize(new Dimension(tileWidth, tileHeight));
        this.setMaximumSize(new Dimension(tileWidth, tileHeight));
        this.setBorder(DEFAULT_BORDER);
        this.setFocusPainted(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                setIcon(new ImageIcon(Assets.metalSign.getScaledInstance(tileWidth, tileHeight, Image.SCALE_SMOOTH)));
                setIcon(currentIcon);
//                System.out.println(choosePanel.getTileChooser().getTileComboBox().getSelectedItem());
            }
        });
    }
}
