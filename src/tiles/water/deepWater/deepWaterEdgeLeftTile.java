package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeLeftTile extends WaterTile {

    public DeepWaterEdgeLeftTile(int id) {
        super(Assets.deepWaterEdgeLeft, id);
    }

    public DeepWaterEdgeLeftTile(int id, String name) {
        super(Assets.deepWaterEdgeLeft, id, name);
    }
}
