package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * defines a class only loading {@link BufferedImage BufferedImages} out of a path
 */
public class ImageLoader {

    /**
     * loads an Image out of a given path
     *
     * @param path the path of the Image
     * @return a BufferedImage according to the path or null
     */
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
