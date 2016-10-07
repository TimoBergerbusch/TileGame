package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeTopLeftTile extends WaterTile {

    public StillWaterEdgeTopLeftTile(int id) {
        super(Assets.stillWaterEdgeTopLeft, id);
    }

    public StillWaterEdgeTopLeftTile(int id, String name) {
        super(Assets.stillWaterEdgeTopLeft,id,name);
    }
}
