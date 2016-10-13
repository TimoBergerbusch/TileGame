package WorldEditor;

import java.awt.*;
import java.io.*;
import java.nio.file.*;

import javax.swing.*;

import gfx.*;
import tilegame.*;
import ui.*;
import utils.*;

public class WorldControls {

    private WorldEditorPanel worldEditorPanel;
    private UIImageButton load, save, zoomIn, zoomOut, newWorld, setSpawn;
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
        newWorld = new UIImageButton((int) (zoomIn.getX() + zoomIn.getWidth() + 10), handler.getHeight() - 40, 64, 35, Assets.newWorld, new ClickListener() {
            @Override
            public void onLeftClick() {
                createNewWorld();
            }

            @Override
            public void onRightClick() {

            }
        });
        setSpawn = new UIImageButton((int) (zoomIn.getX() + zoomIn.getWidth() + newWorld.getWidth() + 20), handler.getHeight() - 40, 64, 35, Assets.setSpawn, new ClickListener() {
            @Override
            public void onLeftClick() {
                setSpawnDialog();
            }

            @Override
            public void onRightClick() {

            }
        });
        addControls();
    }

    private void setSpawnDialog() {
        JTextField xPos, yPos;
        int result = JOptionPane.showConfirmDialog(handler.getGame().getDisplay().getFrame(), new Component[]{
                new JLabel("Please enter the following Infos"),
                new JLabel("X-Pos(in Tiles):"),
                xPos = new JTextField("0"),
                new JLabel("Y-Pos(in Tiles):"),
                yPos = new JTextField("0")
        }, "Set Spawn", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            worldEditorPanel.setSpawn(Utils.parseInt(xPos.getText()), Utils.parseInt(yPos.getText()));
        }
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
        worldEditor.uiManager.addObject(newWorld);
        worldEditor.uiManager.addObject(setSpawn);
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

    private void createNewWorld() {
        JTextField name, width, height;
        int result = JOptionPane.showConfirmDialog(handler.getGame().getDisplay().getFrame(), new Component[]{
                new JLabel("Please enter the following Infos"),
                new JLabel("Name:"),
                name = new JTextField("newWorld"),
                new JLabel("width(in Tiles):"),
                width = new JTextField("50"),
                new JLabel("heigh(in Tiles):"),
                height = new JTextField("20")
        }, "Create new World", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
//                    System.out.println("Name: " + name.getText());
//                    System.out.println("Width: " + width.getText());
//                    System.out.println("Height: " + height.getText());

//                    PrintWriter writer = new PrintWriter("res/worlds/" + name + ".lvl", "UTF-8");
            try {
                if (new File("res/worlds/" + name.getText() + ".lvl").exists())
                    new File("res/worlds/" + name.getText() + ".lvl").delete();
                new File("res/worlds/" + name.getText() + ".lvl").createNewFile();

                BufferedWriter writer = Files.newBufferedWriter(Paths.get("res/worlds/" + name.getText() + ".lvl"));
                writer.write(width.getText() + " " + height.getText());
                writer.newLine();
                writer.write("0 0");
                writer.newLine();
                for (int x = 0; x < Utils.parseInt(height.getText()); x++) {
                    for (int z = 0; z < Utils.parseInt(width.getText()); z++)
                        writer.write(0 + " ");
                    writer.newLine();
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("written");
            worldEditorPanel.loadWorld(new File("res/worlds/" + name.getText() + ".lvl"));
        }
    }
}
