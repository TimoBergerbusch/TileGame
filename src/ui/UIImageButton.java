package ui;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.rmi.CORBA.Util;

import WorldEditor.WorldEditorPanel;
import utils.Utils;

public class UIImageButton extends UIObject {

    protected BufferedImage[] images;
    protected ClickListener clicker;
    protected boolean noticeOffset = false;

    public UIImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker) {
        super(x, y, width, height);
        this.images = images;
        this.clicker = clicker;
    }

    public UIImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker, boolean noticeOffset) {
        this(x, y, width, height, images, clicker);
        this.noticeOffset = noticeOffset;

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if (hovering)
            g.drawImage(images[1], (int) x - Utils.parseInt(noticeOffset) * WorldEditorPanel.xOffset, (int) y - Utils.parseInt(noticeOffset) * WorldEditorPanel.yOffset,
                    getPreferred(width, Math.toIntExact((long) (width * WorldEditorPanel.EDITOR_TILE_WIDTH * 0.125))),
                    getPreferred(height, Math.toIntExact((long) (height * WorldEditorPanel.EDITOR_TILE_HEIGHT * 0.125))), null);
        else
            g.drawImage(images[0], (int) x - Utils.parseInt(noticeOffset) * WorldEditorPanel.xOffset, (int) y - Utils.parseInt(noticeOffset) * WorldEditorPanel.yOffset,
                    getPreferred(width, Math.toIntExact((long) (width * WorldEditorPanel.EDITOR_TILE_WIDTH * 0.125))),
                    getPreferred(height, Math.toIntExact((long) (height * WorldEditorPanel.EDITOR_TILE_HEIGHT * 0.125))), null);
    }

    private int getPreferred(int x, int y) {
        if (noticeOffset)
            return y;
        return x;
    }

    @Override
    public void onLeftClick() {
        clicker.onLeftClick();
    }

    @Override
    public void onRightClick() {
        clicker.onRightClick();
    }
}
