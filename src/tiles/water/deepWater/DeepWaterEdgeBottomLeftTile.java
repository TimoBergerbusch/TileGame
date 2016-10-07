package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeBottomLeftTile extends WaterTile {

    public DeepWaterEdgeBottomLeftTile(int id) {
        super(Assets.deepWaterEdgeBottomLeft, id);
    }

    public DeepWaterEdgeBottomLeftTile(int id, String name) {
        super(Assets.deepWaterEdgeBottomLeft,id,name);
    }
}
