package tilegame;

import org.omg.PortableInterceptor.DISCARDING;

import java.awt.*;
import java.awt.image.BufferStrategy;

import Display.Display;

public class Game implements Runnable {

    private Display display;
    private int width, height;
    private String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    private void init() {
        display = new Display(title, width, height);
    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
    }

    private void tick() {
    }

    @Override
    public void run() {
        init();

        while (running) {
            tick();
            render();
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
}
