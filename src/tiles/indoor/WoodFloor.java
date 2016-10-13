package tiles.indoor;

import gfx.*;
import tiles.*;

public class WoodFloor extends Tile {
    public WoodFloor(int id) {
        super(Assets.woodFloor, id);
    }

    public WoodFloor(int id, String name) {
        super(Assets.woodFloor, id, name);
    }
}
