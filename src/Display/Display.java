package Display;

import java.awt.*;

import javax.swing.*;

public class Display {

    private JFrame frame;
    private Canvas canvas;

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
//        frame.setLocationRelativeTo(null);
        frame.setLocation(100, 50);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, heigth));
        canvas.setMaximumSize(new Dimension(width, heigth));
        canvas.setMinimumSize(new Dimension(width, heigth));
        canvas.setFocusable(false);
//        canvas.setBackground(Color.BLACK);

        frame.add(canvas);
        frame.pack();
    }

    /**
     * Gets canvas.
     *
     * @return Value of canvas.
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * Gets frame.
     *
     * @return Value of frame.
     */
    public JFrame getFrame() {
        return frame;
    }
}
