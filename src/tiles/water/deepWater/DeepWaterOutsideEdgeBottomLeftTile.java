package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterOutsideEdgeBottomLeftTile extends WaterTile {
    public DeepWaterOutsideEdgeBottomLeftTile(int id) {
        super(Assets.deepWaterOutsideEdgeBottomLeft, id);
    }

    public DeepWaterOutsideEdgeBottomLeftTile(int id, String name) {
        super(Assets.deepWaterOutsideEdgeBottomLeft,id,name);
    }
}
