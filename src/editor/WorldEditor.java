package editor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import editor.choosePanel.ChoosePanel;
import editor.mainPanel.EditorPanel;
import gfx.Assets;

public class WorldEditor {

    public static int width = 50, height = 20, tileWidth = 25, tileHeight = 25;

    private JFrame frame;
    private ChoosePanel choosePanel;
    private JMenuBar menuBar;
    private JMenu datei;
    private JMenuItem load, save;
    private MenuListener menuListener;

    public WorldEditor() {
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

        choosePanel = new ChoosePanel();
        frame.add(choosePanel, BorderLayout.EAST);

        frame.add(new EditorPanel(choosePanel), BorderLayout.CENTER);

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
