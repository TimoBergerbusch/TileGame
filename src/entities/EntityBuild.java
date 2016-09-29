package entities;

import java.awt.*;
import java.util.ArrayList;

import entities.Entity;
import tilegame.Handler;

public abstract class EntityBuild extends Entity {

    protected ArrayList<Entity> parts;

    public EntityBuild(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        bounds.x = bounds.y = bounds.width = bounds.height = 0;
        parts = new ArrayList<Entity>();
    }

    public boolean checkEntityCollisionOfBuild(float xOffset, float yOffset) {
        boolean bool = false;
        for (Entity e : parts) {
            if (e.equals(this))
                continue;
            if (e.checkEntityCollision(xOffset, yOffset))
                bool = true;
        }
        return bool;
    }

    public Rectangle[] getCollisionBoundsOfBuild(float xOffset, float yOffset) {
//        Rectangle[] rectangles = new Rectangle[parts.size()];
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        int End = parts.size();
        for (int i = 0; i < End; i++) {
            if (parts.get(i) instanceof EntityBuild) {
                ArrayList<Rectangle> innerRec = new ArrayList<Rectangle>();

                for (Rectangle r : ((EntityBuild) parts.get(i)).getCollisionBoundsOfBuild(xOffset, yOffset)) {
                    innerRec.add(r);
                }
                rectangles.addAll(innerRec);
                i += innerRec.size();
                End += innerRec.size();
            } else {
                rectangles.add(parts.get(i).getCollisionBounds(xOffset, yOffset));
            }
        }

        return rectangles.toArray(new Rectangle[rectangles.size()]);
    }

    @Override
    public void render(Graphics g) {
        for (Entity e : parts)
            e.render(g);
    }

    public void hurt(int amt){
        System.out.println("Builds cant be hurt");
    }

    @Override
    public void die() {
        System.out.println("Builds Cant die");
    }

}
