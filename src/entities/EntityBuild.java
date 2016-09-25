package entities;

import entities.Entity;
import tilegame.Handler;

public abstract class EntityBuild  extends Entity{

    public EntityBuild(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
    }


}
