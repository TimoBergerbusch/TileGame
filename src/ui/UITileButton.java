package ui;

import java.awt.*;
import java.awt.event.*;

import WorldEditor.*;
import tilegame.*;
import tiles.*;

public class UITileButton extends UIObject {

    private Tile tile;
    private ClickListener clicker;
    private Handler handler;
    private Color normalColor = Color.lightGray, hoveringColor = Color.RED;

    public UITileButton(Handler handler, Tile tile, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.handler = handler;
        this.tile = tile;
        clicker = new ClickListener() {
            @Override
            public void onLeftClick() {
                if (handler.getKeyManager().delete)
                    setTile(StaticTiles.grassTile);
                else
                    setTile(WorldEditorPanel.currentTile);
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
            if (currentIndex < 0)
                currentIndex += StaticTiles.tiles.length;
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
        if (normalColor != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(normalColor);
            if (hovering)
                g2.setColor(hoveringColor);
            g2.setStroke(new BasicStroke(2));
            g2.drawRect((int) x - WorldEditorPanel.xOffset, (int) y - WorldEditorPanel.yOffset, width, height);
        }
        if (tile != null)
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

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }
}
