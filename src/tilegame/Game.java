package tilegame;

import org.omg.PortableInterceptor.DISCARDING;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import Display.Display;
import gfx.Assets;
import gfx.GameCamera;
import gfx.ImageLoader;
import gfx.SpriteSheet;
import input.KeyManager;
import input.MouseManager;
import states.EditorState;
import states.GameState;
import states.MenuState;
import states.State;

public class Game implements Runnable {

    private Display display;
    private int width, height;
    private String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //States
    public State gameState;
    public State menuState;
    public State editorState;

    //Input
    private KeyManager keyManager;
    private MouseManager mouseManager;

    //Camera
    private GameCamera gameCamera;

    //Handler
    private Handler handler;

    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        keyManager = new KeyManager();
        mouseManager = new MouseManager();
    }

    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        Assets.init();

        handler = new Handler(this);
        gameCamera = new GameCamera(handler, 0, 0);

        gameState = new GameState(handler);
        editorState = new EditorState(handler);
        menuState = new MenuState(handler);
        State.setState(editorState);
    }

    private void tick() {
        keyManager.tick();

        if (State.getState() != null)
            State.getState().tick();
    }

    public void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Clear Screen
        g.clearRect(0, 0, width, height);
        //Draw

        if (State.getState() != null)
            State.getState().render(g);

        //End Draw
        bs.show();
        g.dispose();
    }

    @Override
    public void run() {
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;


        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
//                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();
    }

    synchronized void start() {
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop() {
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets keyManager.
     *
     * @return Value of keyManager.
     */
    public KeyManager getKeyManager() {
        return keyManager;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Gets display.
     *
     * @return Value of display.
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * Sets new display.
     *
     * @param display New value of display.
     */
    public void setDisplay(Display display) {
        this.display = display;
    }
}
