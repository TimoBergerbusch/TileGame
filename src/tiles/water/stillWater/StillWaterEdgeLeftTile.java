package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeLeftTile extends WaterTile {

    public StillWaterEdgeLeftTile(int id) {
        super(Assets.stillWaterEdgeLeft, id);
    }

    public StillWaterEdgeLeftTile(int id, String name) {
        super(Assets.stillWaterEdgeLeft ,id,name);
    }
}
