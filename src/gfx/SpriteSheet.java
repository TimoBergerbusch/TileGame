package gfx;

import java.awt.image.BufferedImage;

/**
 * defines a spritesheet, which is an BufferedImage containing many small Images
 */
public class SpriteSheet {

    /**
     * the main Image containing the other images
     */
    private BufferedImage sheet;

    //Constructors

    /**
     * creates a new {@link SpriteSheet}
     *
     * @param sheet the image
     */
    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    //Implemented Methods

    /**
     * this method crops out a subimage of the {@link #sheet} using {@link #crop(int, int, int,
     * int)} and {@link Assets#TileWidth} and {@link Assets#TileHeight} as default
     *
     * @param x the x-position to start cutting out
     * @param y the y-position to start cutting out
     * @return the outcropped subimage
     */
    public BufferedImage crop(int x, int y) {
        return sheet.getSubimage(x, y, Assets.TileWidth, Assets.TileHeight);
    }

    /**
     * this method crops out a subimage of the {@link #sheet}
     *
     * @param x      the x-position to start cutting out
     * @param y      the y-position to start cutting out
     * @param width  the width to cut out
     * @param height the height to cut out
     * @return the outcropped subimage
     */
    public BufferedImage crop(int x, int y, int width, int height) {
        return sheet.getSubimage(x, y, width, height);
    }
}
