package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeTopTile extends WaterTile {

    public DeepWaterEdgeTopTile(int id) {
        super(Assets.deepWaterEdgeTop, id);
    }

    public DeepWaterEdgeTopTile(int id, String name) {
        super(Assets.deepWaterEdgeTop, id, name);
    }
}
