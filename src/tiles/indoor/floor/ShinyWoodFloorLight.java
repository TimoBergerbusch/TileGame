package tiles.indoor.floor;

import java.awt.image.*;

import gfx.*;
import tiles.*;

public class ShinyWoodFloorLight extends Tile {
    public ShinyWoodFloorLight(int id) {
        super(Assets.woodFloorLight, id);
    }

    public ShinyWoodFloorLight(int id, String name) {
        super(Assets.woodFloorLight, id, name);
    }
}
