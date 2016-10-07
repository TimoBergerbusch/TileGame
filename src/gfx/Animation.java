package gfx;

import java.awt.image.BufferedImage;

/**
 * defines an animation an {@link entities.Entity} could have
 */
public class Animation {

    /**
     * the speed the animation should change images in
     */
    private int speed;
    /**
     * the index of the current animation image
     */
    private int index;
    /**
     * the time in milliseconds since the last image change
     */
    private long lastTime;
    /**
     * the time in milliseconds since the last calling
     */
    private long timer;
    /**
     * the images the animation should change between in ascending order
     */
    private BufferedImage[] frames;

    //Constructors

    /**
     * creates a new Animation
     *
     * @param speed  the time between two images
     * @param frames the images of the animation
     */
    public Animation(int speed, BufferedImage[] frames) {
        this.frames = frames;
        this.speed = speed;
        index = 0;
        timer = 0;
        lastTime = System.currentTimeMillis();
    }

    //Implemented Methods

    /**
     * describes what an the animation should do every Gametick
     */
    public void tick() {
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();

        if (timer > speed) {
            index = (index + 1) % frames.length;
            timer = 0;
        }
    }

    /**
     * filters the current images that should be displayed during the animation
     *
     * @return the current image to be drawn
     */
    public BufferedImage getCurrentFrame() {
        return frames[index];
    }
}
