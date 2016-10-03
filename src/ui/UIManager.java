package ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import tilegame.Handler;

public class UIManager {

    private Handler handler;
    private ArrayList<UIObject> objects;

    public UIManager(Handler handler) {
        this.handler = handler;
        objects = new ArrayList<UIObject>();
    }

    public boolean isEmpty(){
        return objects.isEmpty();
    }

    public void tick() {
        for (UIObject o : objects) {
            if(o == null)
                removeObject(o);
            o.tick();
        }
    }

    public void render(Graphics g) {
        for (UIObject o : objects)
            o.render(g);
    }

    public void onMouseMove(MouseEvent e) {
        for (UIObject o : objects)
            o.onMouseMove(e);
    }

    public void onMouseRelease(MouseEvent e) {
        for (UIObject o : objects)
            o.onMouseRelease(e);
    }

    public void addObject(UIObject o) {
        objects.add(o);
    }

    public void removeObject(UIObject o) {
        objects.remove(o);
    }
//
//    public void clear() {
//        objects.clear();
//    }
}
