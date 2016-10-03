package states;

import java.awt.*;

import WorldEditor.WorldEditor;
import tilegame.Handler;
import ui.UIManager;

public class EditorState extends State {

    private WorldEditor worldEditor;


    public EditorState(Handler handler) {
        super(handler);
        worldEditor = new WorldEditor(handler);
    }

    @Override
    public void tick() {

        worldEditor.tick();
    }

    @Override
    public void render(Graphics g) {
        worldEditor.render(g);
    }
}
