package entities;

import java.awt.*;
import java.util.ArrayList;

import tilegame.Handler;

/**
 * defines an {@link Entity} as a build of {@link Entity Entities}.
 */
public abstract class EntityBuild extends Entity {

    /**
     * the parts the {@link EntityBuild} is made of
     */
    protected ArrayList<Entity> parts;

    //Constructors

    /**
     * creates a new {@link EntityBuild} at a given x/y-position with a given height/width
     *
     * @param handler the {@link Handler} of the {@link tilegame.Game}
     * @param x       the x-position of the {@link EntityBuild}
     * @param y       the y-position of the {@link EntityBuild}
     * @param width   the width of the {@link EntityBuild}
     * @param height  the height of the {@link EntityBuild}
     */
    public EntityBuild(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        bounds.x = bounds.y = bounds.width = bounds.height = 0;
        parts = new ArrayList<Entity>();
    }

    //Methods

    /**
     * checks if the {@link entities.creatures.Player#bounds Players Collisionbounds} would
     * intersects with the {@link #bounds} of any other {@link Entity} of the whole {@link
     * EntityBuild} if the {@link entities.creatures.Player} shouldMove by the given x/yOffsets
     *
     * @param xOffset the offset on the x-axis
     * @param yOffset the offset on the y-axis
     * @return <code>true</code>, if intersects with the collision bounds of an other {@link Entity}
     * of the {@link EntityBuild}. <code>false</code> otherwise
     */
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

    /**
     * gets the Bounds of every {@link Entity} of the {@link EntityBuild} moved by the given
     * x/yOffsets. If an EntityBuild is part of an other EntityBuild if gets the rectangles
     * recursively
     *
     * @param xOffset the offset on the x-axis
     * @param yOffset the offset on the y-axis
     * @return an Array of Rectangles representing the collision bounds of all parts
     */
    public Rectangle[] getCollisionBoundsOfBuild(float xOffset, float yOffset) {
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

    /**
     * Overrides the {@link Entity#hurt(int)}-Method to guarantee that builds can't be broken apart
     * or hurt in any way.
     *
     * @param amt is ignored
     */
    public void hurt(int amt) {
        System.out.println("Builds cant be hurt");
    }

    /**
     * draws every {@link Entity} of {@link #parts} to the Canvas
     *
     * @param g the {@link Graphics}-Object to draw with
     */
    @Override
    public void render(Graphics g) {
        for (Entity e : parts)
            e.render(g);
    }

    /**
     * Overrides the {@link Entity#die()}-Method to guarantee that builds can't be broken apart or
     * hurt in any way.
     */
    @Override
    public void die() {
        System.out.println("Builds Cant die");
    }

}
