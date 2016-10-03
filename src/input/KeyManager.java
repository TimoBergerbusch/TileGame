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

    /**
     * a boolean to represent if the backtoMenu button is pressed. The interact button is {@link
     * KeyEvent#VK_ESCAPE}
     */
    public boolean backToMenu;

    public boolean load;

    public boolean save;

    public boolean zoomIn;

    public boolean zoomOut;

    //Constructor

    /**
     * creates a new {@link KeyManager}
     */
    public KeyManager() {
        keys = new boolean[522];
    }


    /**
     * updates the up, down, left, right, running, attack and interact booleans
     */
    public void tick() {
        up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
        down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
        left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
        right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
        running = keys[KeyEvent.VK_SHIFT];

        attack = keys[KeyEvent.VK_SPACE];
        interact = keys[KeyEvent.VK_ENTER];

        backToMenu = keys[KeyEvent.VK_ESCAPE];

        load = keys[KeyEvent.VK_O] && keys[KeyEvent.VK_CONTROL];
        save = keys[KeyEvent.VK_S] && keys[KeyEvent.VK_CONTROL];

        zoomIn = keys[KeyEvent.VK_ADD];
        zoomOut = keys[109];
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode());
        if (e.getKeyCode() < keys.length)
            keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() < keys.length)
            keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
