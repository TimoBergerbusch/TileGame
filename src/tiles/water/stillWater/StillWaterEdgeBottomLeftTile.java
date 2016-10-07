package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeBottomLeftTile extends WaterTile {

    public StillWaterEdgeBottomLeftTile(int id) {
        super(Assets.stillWaterEdgeBottomLeft, id);
    }

    public StillWaterEdgeBottomLeftTile(int id, String name) {
        super(Assets.stillWaterEdgeBottomLeft,id,name);
    }
}
