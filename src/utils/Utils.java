package utils;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;

import javax.swing.*;

public class Utils {

    public static String loadFileAsString(String path) {
        StringBuilder builder = new StringBuilder();

        System.out.println(path);

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null)
                builder.append(line + "\n");
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public static BufferedImage[] getArrayPart(BufferedImage[] array, int start, int end) {
        BufferedImage[] tmp = new BufferedImage[end - start + 1];
        for (int i = 0; i < end - start; i++)
            tmp[i] = array[start + i];
        return tmp;
    }

    public static int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int parseInt(boolean bool) {
        if (bool)
            return 1;
        return 0;
    }

    public static BufferedImage rotateImage(BufferedImage src, double degrees) {
        AffineTransform affineTransform = AffineTransform.getRotateInstance(
                Math.toRadians(degrees),
                src.getWidth() / 2,
                src.getHeight() / 2);
        BufferedImage rotatedImage = new BufferedImage(src.getWidth(), src
                .getHeight(), src.getType());
        Graphics2D g = (Graphics2D) rotatedImage.getGraphics();
        g.setTransform(affineTransform);
        g.drawImage(src, 0, 0, null);
        return rotatedImage;
    }

    public static BufferedImage flipImage(BufferedImage image) {
        AffineTransform at = new AffineTransform();
        at.concatenate(AffineTransform.getScaleInstance(-1, 1));
        at.concatenate(AffineTransform.getTranslateInstance(-image.getWidth(), 0));
        return createTransformed(image, at);
    }

    private static BufferedImage createTransformed(BufferedImage image, AffineTransform at) {
        BufferedImage newImage = new BufferedImage(
                image.getWidth(), image.getHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = newImage.createGraphics();
        g.transform(at);
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return newImage;
    }

    public static String loadWorld() {
        JFileChooser chooser = new JFileChooser("res/worlds/");
//        chooser.setFileFilter(new FileNameExtensionFilter("Tilegame-Worlds", "*.lvl"));
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        } else {
            return "res/worlds/world1.lvl";
        }
    }

    public static void saveWorld(String s) {
        JFileChooser chooser = new JFileChooser("res/worlds/");
//        chooser.setFileFilter(new FileNameExtensionFilter("Tilegame-Worlds", "*.lvl"));
        chooser.setMultiSelectionEnabled(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            printIntoFile(chooser.getSelectedFile(), s);
        }
    }

    private static void printIntoFile(File f, String s) {
        try {
            PrintWriter out = new PrintWriter(f);
            out.print(s);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
