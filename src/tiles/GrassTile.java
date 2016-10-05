package tiles;

import gfx.Assets;

public class GrassTile extends Tile {

    public GrassTile(int id) {
        super(Assets.grass, id);
    }

    @Override
    public String toString() {
        return "Grass";
    }

}
