package ui;


import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class UIObject {

    protected float x ,y;
    protected  int width, height;
    protected Rectangle bounds;
    protected boolean hovering = false;

    public UIObject(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        bounds = new Rectangle((int) x, (int) y, width,height);
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract void onClick();

    public void onMouseMove(MouseEvent e){
        if(bounds.contains(e.getX(),e.getY()))
            hovering = true;
        else
            hovering = false;
    }

    public void onMouseRelese(MouseEvent e){
        if(hovering && e.getButton() == MouseEvent.BUTTON1)
            onClick();
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
     * Sets new x.
     *
     * @param x New value of x.
     */
    public void setX(float x) {
        this.x = x;
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
     * Gets y.
     *
     * @return Value of y.
     */
    public float getY() {
        return y;
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
     * Gets x.
     *
     * @return Value of x.
     */
    public float getX() {
        return x;
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
