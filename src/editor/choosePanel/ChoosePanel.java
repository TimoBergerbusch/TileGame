package editor.choosePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class ChoosePanel extends JPanel {

    private TileChoosePanel tileChoosePanel;
    private JComboBox chooser;

    public ChoosePanel() {
        initJComboBox();
        tileChoosePanel = new TileChoosePanel();
        this.setLayout(new BorderLayout());
        this.add(chooser, BorderLayout.NORTH);
        this.add(tileChoosePanel, BorderLayout.CENTER);
    }

    private void initJComboBox(){
        chooser = new JComboBox();
        chooser.addItem("Enviroment");
        chooser.addItem("Town");
        chooser.addItem("WoodFence");

        chooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tileChoosePanel.loadTiles(chooser.getSelectedItem().toString());
            }
        });
    }

}
