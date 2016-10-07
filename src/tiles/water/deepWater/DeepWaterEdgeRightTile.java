package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeRightTile extends WaterTile {

    public DeepWaterEdgeRightTile(int id) {
        super(Assets.deepWaterEdgeRight, id);
    }

    public DeepWaterEdgeRightTile(int id, String name) {
        super(Assets.deepWaterEdgeRight,id,name);
    }
}
