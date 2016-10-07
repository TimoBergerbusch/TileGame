package tiles.water.deepWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class DeepWaterEdgeBottomTile extends WaterTile {

    public DeepWaterEdgeBottomTile(int id) {
        super(Assets.deepWaterEdgeBottom, id);
    }

    public DeepWaterEdgeBottomTile(int id, String name) {
        super(Assets.deepWaterEdgeBottom, id, name);
    }
}
