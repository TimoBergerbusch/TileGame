package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeTopLeftTile extends WaterTile {

    public DeepWaterEdgeTopLeftTile(int id) {
        super(Assets.deepWaterEdgeTopLeft, id);
    }

    public DeepWaterEdgeTopLeftTile(int id, String name) {
        super(Assets.deepWaterEdgeTopLeft, id, name);
    }
}
