package messages;

import java.awt.*;
import java.awt.image.BufferedImage;

import gfx.*;

/**
 * This class is the background on with a {@link Message} is written. It can be drawn like normal
 * objects or it can hold a {@link BufferedImage} called {@link #texture}.
 *
 * @see Message
 */
public class MessageField {

    /**
     * the x-Position of the [@link {@link MessageField}}
     */
    protected float x = 0;
    /**
     * the y-Position of the [@link {@link MessageField}}
     */
    protected float y = 500;
    /**
     * the width of the [@link {@link MessageField}}, which should be full window width
     */
    protected int width = 1250;
    /**
     * the height of the [@link {@link MessageField}}, which is one third of the window height as
     * default
     */
    protected int height = 250;

    /**
     * the texture which can be drawn instead of a default grey background
     */
    protected BufferedImage texture;

    /**
     * the default constructor with default background
     */
    public MessageField() {

    }

    /**
     * the constructor setting the {@link #texture}
     *
     * @param texture the new {@link #texture}
     */
    public MessageField(BufferedImage texture) {
        this.texture = texture;
    }

    /**
     * the tick method NOTE: empty and unused
     */
    public void tick() {

    }

    /**
     * draws the {@link #texture} or the default background to the screen at {@link #x}, {@link #y},
     * {@link #width} and {@link #height}
     *
     * @param g the {@link Graphics}-Object to draw with
     */
    public void render(Graphics g) {
        if (texture != null)
            g.drawImage(texture, (int) x, (int) y, width, height, null);
        else {
            int archWidth = 30, archHeight = 30;
            g.setColor(Color.DARK_GRAY);
            g.fillRoundRect((int) x, (int) y, width, height, archWidth, archHeight);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRoundRect((int) x + 2, (int) y + 2, width - 4, height - 4, archWidth, archHeight);
            g.setColor(Color.darkGray);
            g.drawRoundRect((int) x + 5, (int) y + 5, width - 10, height - 10, archWidth, archHeight);
        }
    }

    //Getter and Setters

    /**
     * Gets the height of the [@link {@link MessageField}}, which is one third of the window height
     * as default.
     *
     * @return Value of the height of the [@link {@link MessageField}}, which is one third of the
     * window height as default.
     */
    public int getHeight() {
        return height;
    }

    /**
     * StaticSets new the height of the [@link {@link MessageField}}, which is one third of the
     * window height as default.
     *
     * @param height New value of the height of the [@link {@link MessageField}}, which is one third
     *               of the window height as default.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the texture which can be drawn instead of a default grey background.
     *
     * @return Value of the texture which can be drawn instead of a default grey background.
     */
    public BufferedImage getTexture() {
        return texture;
    }

    /**
     * StaticSets new the texture which can be drawn instead of a default grey background.
     *
     * @param texture New value of the texture which can be drawn instead of a default grey
     *                background.
     */
    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    /**
     * Gets the x-Position of the [@link {@link MessageField}}.
     *
     * @return Value of the x-Position of the [@link {@link MessageField}}.
     */
    public float getX() {
        return x;
    }

    /**
     * StaticSets new the x-Position of the [@link {@link MessageField}}.
     *
     * @param x New value of the x-Position of the [@link {@link MessageField}}.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets the y-Position of the [@link {@link MessageField}}.
     *
     * @return Value of the y-Position of the [@link {@link MessageField}}.
     */
    public float getY() {
        return y;
    }

    /**
     * StaticSets new the y-Position of the [@link {@link MessageField}}.
     *
     * @param y New value of the y-Position of the [@link {@link MessageField}}.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Gets the width of the [@link {@link MessageField}}, which should be full window width.
     *
     * @return Value of the width of the [@link {@link MessageField}}, which should be full window
     * width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * StaticSets new the width of the [@link {@link MessageField}}, which should be full window
     * width.
     *
     * @param width New value of the width of the [@link {@link MessageField}}, which should be full
     *              window width.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString(){
        if(texture == Assets.metalSignBackground)
            return "metalSignBackground";
        if(texture == Assets.scriptRollBackground)
            return "scriptRollBackground";
        return "default";
    }
}
