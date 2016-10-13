package tilegame;

import java.io.*;

public class Launcher {

    public static void main(String[] args) {

        initNecessaryFiles();

        Game game = new Game("Tile Game!", 1250, 750);
        game.start();
//        WorldEditorOLD we = new WorldEditorOLD();
    }

    private static void initNecessaryFiles() {
        File f = new File("res/worlds/tmp");
        if (f.exists())
            f.delete();
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
