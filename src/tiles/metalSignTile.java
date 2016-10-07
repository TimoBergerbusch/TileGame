package tiles;

import gfx.Assets;

public class MetalSignTile extends Tile {
    public MetalSignTile(int id) {
        super(Assets.grass, id);
    }

    public MetalSignTile(int id, String name) {
        super(Assets.metalSign, id, name);
    }
}
