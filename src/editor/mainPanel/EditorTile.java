package editor.mainPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import editor.choosePanel.ChoosePanel;
import gfx.Assets;

import static editor.WorldEditor.tileHeight;
import static editor.WorldEditor.tileWidth;
import static editor.mainPanel.EditorPanel.DEFAULT_BORDER;

public class EditorTile extends JButton {

    public static ImageIcon currentIcon = new ImageIcon(Assets.metalSign.getScaledInstance(tileWidth, tileWidth, Image.SCALE_SMOOTH));

    public EditorTile(ChoosePanel choosePanel) {
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
