package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeTopRightTile extends WaterTile {

    public DeepWaterEdgeTopRightTile(int id) {
        super(Assets.deepWaterEdgeTopRight, id);
    }

    public DeepWaterEdgeTopRightTile(int id, String name) {
        super(Assets.deepWaterEdgeTopRight, id, name);
    }
}
