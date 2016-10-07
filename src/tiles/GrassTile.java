package tiles;

import gfx.Assets;

public class GrassTile extends Tile {

    public GrassTile(int id) {
        super(Assets.grass, id);
    }

    public GrassTile(int id, String name) {
        super(Assets.grass, id, name);
    }
}
