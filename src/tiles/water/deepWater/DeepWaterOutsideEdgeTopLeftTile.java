package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterOutsideEdgeTopLeftTile extends WaterTile {
    public DeepWaterOutsideEdgeTopLeftTile(int id) {
        super(Assets.deepWaterOutsideEdgeTopLeft, id);
    }

    public DeepWaterOutsideEdgeTopLeftTile(int id, String name) {
        super(Assets.deepWaterOutsideEdgeTopLeft,id,name);
    }
}
