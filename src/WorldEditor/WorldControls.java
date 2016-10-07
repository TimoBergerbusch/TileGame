package WorldEditor;

import java.awt.*;

import gfx.Assets;
import tilegame.Handler;
import ui.ClickListener;
import ui.UIImageButton;
import utils.Utils;

public class WorldControls {

    private WorldEditorPanel worldEditorPanel;
    private UIImageButton load, save, zoomIn, zoomOut;
    private Handler handler;
    private WorldEditor worldEditor;

    public WorldControls(Handler handler, WorldEditor worldEditor, WorldEditorPanel worldEditorPanel) {
        this.handler = handler;
        this.worldEditor = worldEditor;
        this.worldEditorPanel = worldEditorPanel;
        init();
    }

    private void init() {
        load = new UIImageButton(0, handler.getHeight() - 40, 512, 35, Assets.load, new ClickListener() {
            @Override
            public void onLeftClick() {
                worldEditorPanel.loadWorld();
            }

            @Override
            public void onRightClick() {
                System.out.println("load right");
            }
        });
        save = new UIImageButton(handler.getWidth() - 512 - 10, handler.getHeight() - 40, 512, 35, Assets.save, new ClickListener() {
            @Override
            public void onLeftClick() {
//                System.out.println("save left ");
                worldEditorPanel.saveWorld();
            }

            @Override
            public void onRightClick() {
                System.out.println("save right");
            }
        });
        zoomIn = new UIImageButton(10 + 512 + 10, handler.getHeight() - 40, 32, 35, Assets.zoomIn, new ClickListener() {
            @Override
            public void onLeftClick() {
                zoom(1.2);
            }

            @Override
            public void onRightClick() {

            }
        });
        zoomOut = new UIImageButton(handler.getWidth() - 10 - 512 - 10 - 32, handler.getHeight() - 40, 32, 35, Assets.zoomOut, new ClickListener() {
            @Override
            public void onLeftClick() {
                zoom(0.8);
            }

            @Override
            public void onRightClick() {

            }
        });

        addControls();
    }

    public void render(Graphics g) {
    }

    public void tick() {
        if (handler.getKeyManager().load)
            Utils.loadWorld();
        if (handler.getKeyManager().save)
            worldEditorPanel.saveWorld();
        if (handler.getKeyManager().zoomIn)
            zoom(1.2);
        if (handler.getKeyManager().zoomOut)
            zoom(0.8);
    }

    public void addControls() {
        worldEditor.uiManager.addObject(load);
        worldEditor.uiManager.addObject(save);
        worldEditor.uiManager.addObject(zoomIn);
        worldEditor.uiManager.addObject(zoomOut);
    }

    private void zoom(double zoomFactor) {
        if ((int) worldEditorPanel.EDITOR_TILE_HEIGHT * zoomFactor > 10) {
            worldEditorPanel.EDITOR_TILE_HEIGHT *= zoomFactor;
            worldEditorPanel.yOffset *= zoomFactor;
        }
        if ((int) worldEditorPanel.EDITOR_TILE_WIDTH * zoomFactor > 10) {
            worldEditorPanel.EDITOR_TILE_WIDTH *= zoomFactor;
            worldEditorPanel.xOffset *= zoomFactor;
        }
    }
}
