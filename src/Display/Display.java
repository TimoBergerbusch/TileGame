package Display;

import javax.swing.*;

public class Display {

    private JFrame frame;

    private String title;
    private int width, heigth;

    public Display(String title, int width, int heigth) {
        this.title = title;
        this.width = width;
        this.heigth = heigth;

        createDisplay();
    }

    private void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width, heigth);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
