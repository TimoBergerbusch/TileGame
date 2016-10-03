package editorOLD;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import editorOLD.choosePanel.ChoosePanelOLD;
import editorOLD.mainPanel.EditorPanelOLD;
import gfx.Assets;

public class WorldEditorOLD {

    public static int width = 50, height = 20, tileWidth = 25, tileHeight = 25;

    private JFrame frame;
    private ChoosePanelOLD choosePanel;
    private JMenuBar menuBar;
    private JMenu datei;
    private JMenuItem load, save;
    private MenuListener menuListener;

    public WorldEditorOLD() {
        Assets.init();

        frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        menuBar = new JMenuBar();
        menuBar.add(datei = new JMenu("Datei"));
        datei.add(load = new JMenuItem("Laden"));
        datei.add(save = new JMenuItem("Speichern"));

        menuListener = new MenuListener();
        load.addActionListener(menuListener);
        save.addActionListener(menuListener);
        frame.add(menuBar, BorderLayout.NORTH);

        choosePanel = new ChoosePanelOLD();
        frame.add(choosePanel, BorderLayout.EAST);

        frame.add(new EditorPanelOLD(choosePanel), BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class MenuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (((JMenuItem) e.getSource()).getText().equals("Laden")) {
                System.out.println("Laden");
            } else {
                System.out.println("Speichern");
            }
        }
    }
}
