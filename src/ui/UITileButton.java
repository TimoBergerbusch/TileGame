package ui;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

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

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(tile.getTexture(), (int) x, (int) y, width, height, null);
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


}
