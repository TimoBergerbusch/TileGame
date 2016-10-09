package ui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import tilegame.*;

public class UIManager {

    private Handler handler;
    private ArrayList<UIObject> objects;

    public UIManager(Handler handler) {
        this.handler = handler;
        objects = new ArrayList<UIObject>();
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }

    public void tick() {
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i) == null)
                removeObject(objects.get(i));
            objects.get(i).tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++)
            objects.get(i).render(g);
    }

    public void onMouseMove(MouseEvent e) {
        for (UIObject o : objects)
            o.onMouseMove(e);
    }

    public void onMouseRelease(MouseEvent e) {
        for (int i = 0; i < objects.size(); i++)
            objects.get(i).onMouseRelease(e);
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
