package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeTopRightTile extends WaterTile {

    public StillWaterEdgeTopRightTile(int id) {
        super(Assets.stillWaterEdgeTopRight, id);
    }

    public StillWaterEdgeTopRightTile(int id, String name) {
        super(Assets.stillWaterEdgeTopRight,id,name);
    }
}
