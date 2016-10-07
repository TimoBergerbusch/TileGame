package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeRightTile extends WaterTile {

    public StillWaterEdgeRightTile(int id) {
        super(Assets.stillWaterEdgeRight, id);
    }

    public StillWaterEdgeRightTile(int id, String name) {
        super(Assets.stillWaterEdgeRight,id,name);
    }
}
