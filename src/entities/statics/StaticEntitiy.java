package entities.statics;

import entities.Entity;
import tilegame.Handler;

public abstract class StaticEntitiy extends Entity {

    public StaticEntitiy(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
    }



}
