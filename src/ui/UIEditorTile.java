package ui;

import java.awt.*;

import gfx.Sets;

public class UIEditorTile extends UIImageButton {

    private int index = 0;

    public UIEditorTile(float x, float y, int width, int height) {
        super(x, y, width, height, Sets.enviroment, null);
        clicker = new ClickListener() {
            @Override
            public void onLeftClick() {
                System.out.println("left clicked");
                changeIndex(1);
            }

            @Override
            public void onRightClick() {
                System.out.println("right clicked");
                changeIndex(-1);
            }
        };
    }

    public void changeIndex(int i) {
        index = (index + i) % images.length;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(images[index], (int) x, (int) y, width, height, null);
    }
}
