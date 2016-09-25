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
            if (e.checkEntityCollision(xOffset, yOffset))
                bool = true;
        }
        return bool;
    }

    public Rectangle[] getCollisionBoundsOfBuild(float xOffset, float yOffset) {
        Rectangle[] rectangles = new Rectangle[parts.size()];
        for (int i = 0; i < rectangles.length; i++) {
            if(parts.get(i) instanceof EntityBuild)
                System.out.println("EntityBuild in EntityBuild");
            rectangles[i] = parts.get(i).getCollisionBounds(xOffset, yOffset);
        }

        return rectangles;
    }

}
