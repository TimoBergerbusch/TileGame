package messages;

import java.awt.*;

public class MessageField {

    protected float x = 0, y = 500;
    protected int width = 1250, height = 250;
    protected Rectangle bounds;

    public MessageField(Message message) {
        bounds = new Rectangle((int) x, (int) y, width, height);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        int archWidth = 30, archHeight = 30;
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect((int) x, (int) y, width, height, archWidth, archHeight);
        g.drawRoundRect((int) x + 2, (int) y + 2, width - 4, height - 4, archWidth, archHeight);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect((int) x + 5, (int) y + 5, width - 10, height - 10, archWidth, archHeight);
    }

    /**
     * Gets x.
     *
     * @return Value of x.
     */
    public float getX() {
        return x;
    }

    /**
     * Sets new bounds.
     *
     * @param bounds New value of bounds.
     */
    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    /**
     * Gets y.
     *
     * @return Value of y.
     */
    public float getY() {
        return y;
    }

    /**
     * Gets width.
     *
     * @return Value of width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets new height.
     *
     * @param height New value of height.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets bounds.
     *
     * @return Value of bounds.
     */
    public Rectangle getBounds() {
        return bounds;
    }

    /**
     * Gets height.
     *
     * @return Value of height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets new width.
     *
     * @param width New value of width.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets new x.
     *
     * @param x New value of x.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Sets new y.
     *
     * @param y New value of y.
     */
    public void setY(float y) {
        this.y = y;
    }
}
