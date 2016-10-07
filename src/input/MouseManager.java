package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import ui.UIManager;

/**
 * defines a manager to manage all mouse-input
 */
public class MouseManager implements MouseListener, MouseMotionListener {

    /**
     * defines if the left Mousebutton is pressed
     */
    private boolean leftPressed;
    /**
     * defines if the right Mousebutton is pressed
     */
    private boolean rightPressed;
    /**
     * defines the position of the mouse in x-axis
     */
    private int mouseX;
    /**
     * defines the position of the mouse in x-axis
     */
    private int mouseY;
    /**
     * a {@link UIManager}
     */
    private UIManager uiManager;
//    private ArrayList<UIManager> uiManagers;

    //Constructors

    /**
     * creates a new {@link MouseManager}
     */
    public MouseManager() {
//        uiManagers = new ArrayList<UIManager>();
    }


    //Implemented Methods
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
            leftPressed = true;
        if (e.getButton() == MouseEvent.BUTTON3)
            rightPressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
            leftPressed = false;
        if (e.getButton() == MouseEvent.BUTTON3)
            rightPressed = false;

        if (uiManager != null)
            uiManager.onMouseRelease(e);
//        if (!uiManagers.isEmpty())
//            for (UIManager manager : uiManagers)
//                manager.onMouseRelease(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();

        if (uiManager != null)
            uiManager.onMouseMove(e);
    }

    //Getter and Setters

    /**
     * Gets defines the position of the mouse in x-axis.
     *
     * @return Value of defines the position of the mouse in x-axis.
     */
    public int getMouseX() {
        return mouseX;
    }

//    /**
//     * Gets a {@link UIManager}.
//     *
//     * @return Value of a {@link UIManager}.
//     */
//    public UIManager getUIManager() {
//        return uiManager;
//    }

    /**
     * StaticSets new defines the position of the mouse in x-axis.
     *
     * @param mouseX New value of defines the position of the mouse in x-axis.
     */
    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

//    /**
//     * StaticSets new a {@link UIManager}.
//     *
//     * @param uiManager New value of a {@link UIManager}.
//     */
//    public void setUIManager(UIManager uiManager) {
//        this.uiManager = uiManager;
//    }

//    public void addUIManager(UIManager uiManager) {
//        uiManagers.add(uiManager);
//    }
//
//    public void removeUIManager(UIManager uiManager) {
//        uiManagers.remove(uiManager);
//    }

    /**
     * Gets defines if the left Mousebutton is pressed.
     *
     * @return Value of defines if the left Mousebutton is pressed.
     */
    public boolean isLeftPressed() {
        return leftPressed;
    }

    /**
     * StaticSets new defines if the left Mousebutton is pressed.
     *
     * @param leftPressed New value of defines if the left Mousebutton is pressed.
     */
    public void setLeftPressed(boolean leftPressed) {
        this.leftPressed = leftPressed;
    }

    /**
     * Gets defines the position of the mouse in x-axis.
     *
     * @return Value of defines the position of the mouse in x-axis.
     */
    public int getMouseY() {
        return mouseY;
    }

    /**
     * StaticSets new defines the position of the mouse in x-axis.
     *
     * @param mouseY New value of defines the position of the mouse in x-axis.
     */
    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    /**
     * Gets defines if the right Mousebutton is pressed.
     *
     * @return Value of defines if the right Mousebutton is pressed.
     */
    public boolean isRightPressed() {
        return rightPressed;
    }

    /**
     * StaticSets new defines if the right Mousebutton is pressed.
     *
     * @param rightPressed New value of defines if the right Mousebutton is pressed.
     */
    public void setRightPressed(boolean rightPressed) {
        this.rightPressed = rightPressed;
    }

    public UIManager getUIManager() {
        return uiManager;
    }

    public void setUIManager(UIManager UIManager) {
        this.uiManager = UIManager;
    }

//    public boolean containsUIManager(UIManager uiManager) {
//        return uiManagers.contains(uiManager);
//    }
//
//    public void clearUIManager() {
//        uiManagers.clear();
//    }
}
