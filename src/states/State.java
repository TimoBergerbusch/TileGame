package states;

import java.awt.*;

import tilegame.Handler;

public abstract class State {

    //StateManager
    private static State currentState = null;
    protected Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }

    //Class

    public static State getState() {
        return currentState;
    }

    public static void setState(State state) {
        currentState = state;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
