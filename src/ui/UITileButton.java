package ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

import WorldEditor.WorldEditor;
import WorldEditor.WorldEditorPanel;
import tiles.StaticTiles;
import tiles.Tile;

import static tiles.StaticTiles.*;

public class UITileButton extends UIObject {

    private Tile tile;
    private ClickListener clicker;

    public UITileButton(Tile tile, float x, float y, int width, int height) {
        super(x, y, width, height);
        this.tile = tile;
        clicker = new ClickListener() {
            @Override
            public void onLeftClick() {
                setTile(getNextTile());
            }

            @Override
            public void onRightClick() {
                setTile(getPreviousTile());
            }
        };
    }

    private Tile getPreviousTile() {
        int currentIndex = StaticTiles.getTilesNumber(tile);
        boolean searching = true;
        while (searching) {
            currentIndex = (currentIndex - 1) % StaticTiles.tiles.length;
            if (StaticTiles.tiles[currentIndex] != null) {
                searching = false;
            }
        }
        return StaticTiles.tiles[currentIndex];
    }

    private Tile getNextTile() {
        int currentIndex = StaticTiles.getTilesNumber(tile);
        boolean searching = true;
        while (searching) {
            currentIndex = (currentIndex + 1) % StaticTiles.tiles.length;
            if (StaticTiles.tiles[currentIndex] != null) {
                searching = false;
            }
        }
        return StaticTiles.tiles[currentIndex];
    }

    public void onMouseMove(MouseEvent e) {
        if (bounds.contains(e.getX() + WorldEditorPanel.xOffset, e.getY() + WorldEditorPanel.yOffset))
            hovering = true;
        else
            hovering = false;
    }

    @Override
    public void tick() {
        x = x / width * WorldEditorPanel.EDITOR_TILE_WIDTH;
        y = (y / height) * WorldEditorPanel.EDITOR_TILE_HEIGHT;
        height = WorldEditorPanel.EDITOR_TILE_HEIGHT;
        width = WorldEditorPanel.EDITOR_TILE_WIDTH;
        bounds = new Rectangle((int) x, (int) y, width, height);

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(tile.getTexture(), (int) x - WorldEditorPanel.xOffset, (int) y - WorldEditorPanel.yOffset, width, height, null);
    }

    @Override
    public void onLeftClick() {
        clicker.onLeftClick();
    }

    @Override
    public void onRightClick() {
        clicker.onRightClick();
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Tile getTile() {
        return tile;
    }
}
