package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * defines a manager to manage all keyboard-input
 */
public class KeyManager implements KeyListener {

    /**
     * a boolean array to represent if the key is pressed. A key can be indexed by {@link
     * KeyEvent#getKeyCode()}
     */
    private boolean[] keys;
    /**
     * a boolean to represent if the up key is pressed. the up key is {@link KeyEvent#VK_W}
     */
    public boolean up;
    /**
     * a boolean to represent if the down key is pressed. the down key is {@link KeyEvent#VK_S}
     */
    public boolean down;
    /**
     * a boolean to represent if the left key is pressed. the left key is {@link KeyEvent#VK_A}
     */
    public boolean left;
    /**
     * a boolean to represent if the right key is pressed. the right key is {@link KeyEvent#VK_D}
     */
    public boolean right;
    /**
     * a boolean to represent if the running key is pressed. the running key is {@link
     * KeyEvent#VK_SHIFT}
     */
    public boolean running;
    /**
     * a boolean to represent if the attack button is pressed. The attack button is {@link
     * KeyEvent#VK_SPACE}
     */
    public boolean attack;
    /**
     * a boolean to represent if the interact button is pressed. The interact button is {@link
     * KeyEvent#VK_ENTER}
     */
    public boolean interact;

    //Constructor

    /**
     * creates a new {@link KeyManager}
     */
    public KeyManager() {
        keys = new boolean[256];
    }


    /**
     * updates the up, down, left, right, running, attack and interact booleans
     */
    public void tick() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
        running = keys[KeyEvent.VK_SHIFT];

        attack = keys[KeyEvent.VK_SPACE];
        interact = keys[KeyEvent.VK_ENTER];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
