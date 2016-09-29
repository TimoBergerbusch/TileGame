package tilegame;

import editor.WorldEditor;

public class Launcher {

    public static void main(String [] args){
        Game game = new Game("Tile Game!", 1250, 750);
        game.start();
//        WorldEditor we = new WorldEditor();
    }
}
