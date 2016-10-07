package tiles.water.stillWater;

import gfx.Assets;
import tiles.water.WaterTile;

public class StillWaterEdgeBottomTile extends WaterTile {

    public StillWaterEdgeBottomTile(int id) {
        super(Assets.stillWaterEdgeBottom, id);
    }

    public StillWaterEdgeBottomTile(int id, String name) {
        super(Assets.stillWaterEdgeBottom,id,name);
    }
}
