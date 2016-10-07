package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterTile extends WaterTile {

    public StillWaterTile(int id) {
        super(Assets.stillWater, id);
    }

    public StillWaterTile(int id, String name) {
        super(Assets.stillWater,id,name);
    }
}
