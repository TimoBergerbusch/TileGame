package tiles;

import java.util.ArrayList;
import java.util.Collections;

import tiles.beach.BeachEdgeBottomLeftTile;
import tiles.beach.BeachEdgeBottomRightTile;
import tiles.beach.BeachEdgeBottomTile;
import tiles.beach.BeachEdgeLeftTile;
import tiles.beach.BeachEdgeRightTile;
import tiles.beach.BeachEdgeTopLeftTile;
import tiles.beach.BeachEdgeTopRightTile;
import tiles.beach.BeachEdgeTopTile;
import tiles.beach.BeachOutsideEdgeBottomLeftTile;
import tiles.beach.BeachOutsideEdgeBottomRightTile;
import tiles.beach.BeachOutsideEdgeTopLeftTile;
import tiles.beach.BeachOutsideEdgeTopRightTile;
import tiles.beach.BeachTile;
import tiles.bushwalls.BushwallCornerBottomLeftTile;
import tiles.bushwalls.BushwallCornerBottomRightTile;
import tiles.bushwalls.BushwallCornerTopLeftTile;
import tiles.bushwalls.BushwallCornerTopRightTile;
import tiles.bushwalls.BushwallDownTile;
import tiles.bushwalls.BushwallEndDownTile;
import tiles.bushwalls.BushwallEndLeftTile;
import tiles.bushwalls.BushwallEndRightTile;
import tiles.bushwalls.BushwallEndUpTile;
import tiles.bushwalls.BushwallSideTile;
import tiles.fence.fence.FenceCornerBottomLeftTile;
import tiles.fence.fence.FenceCornerBottomRightTile;
import tiles.fence.fence.FenceCornerTopLeftTile;
import tiles.fence.fence.FenceCornerTopRightTile;
import tiles.fence.fence.FenceIntersectionLeftTile;
import tiles.fence.fence.FenceIntersectionRightTile;
import tiles.fence.fence.FenceLeftTile;
import tiles.fence.fence.FenceRightTile;
import tiles.fence.fence.FenceTopTile;
import tiles.fence.woodFence.WoodFenceCornerBottomLeftTile;
import tiles.fence.woodFence.WoodFenceCornerBottomRightTile;
import tiles.fence.woodFence.WoodFenceCornerTopLeftTile;
import tiles.fence.woodFence.WoodFenceCornerTopRightTile;
import tiles.fence.woodFence.WoodFenceLeftTile;
import tiles.fence.woodFence.WoodFenceRightTile;
import tiles.fence.woodFence.WoodFenceTopTile;
import tiles.water.deepWater.DeepWaterEdgeBottomLeftTile;
import tiles.water.deepWater.DeepWaterEdgeBottomRightTile;
import tiles.water.deepWater.DeepWaterEdgeBottomTile;
import tiles.water.deepWater.DeepWaterEdgeLeftTile;
import tiles.water.deepWater.DeepWaterEdgeRightTile;
import tiles.water.deepWater.DeepWaterEdgeTopLeftTile;
import tiles.water.deepWater.DeepWaterEdgeTopRightTile;
import tiles.water.deepWater.DeepWaterEdgeTopTile;
import tiles.water.deepWater.DeepWaterOutsideEdgeBottomLeftTile;
import tiles.water.deepWater.DeepWaterOutsideEdgeBottomRightTile;
import tiles.water.deepWater.DeepWaterOutsideEdgeTopLeftTile;
import tiles.water.deepWater.DeepWaterOutsideEdgeTopRightTile;
import tiles.water.deepWater.DeepWaterTile;
import tiles.water.stillWater.StillWaterEdgeBottomLeftTile;
import tiles.water.stillWater.StillWaterEdgeBottomRightTile;
import tiles.water.stillWater.StillWaterEdgeBottomTile;
import tiles.water.stillWater.StillWaterEdgeLeftTile;
import tiles.water.stillWater.StillWaterEdgeRightTile;
import tiles.water.stillWater.StillWaterEdgeTopLeftTile;
import tiles.water.stillWater.StillWaterEdgeTopRightTile;
import tiles.water.stillWater.StillWaterEdgeTopTile;
import tiles.water.stillWater.StillWaterTile;

public class StaticTiles {

    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0, "Grass");
    public static Tile roundBushTile = new RoundBushTile(1, "Round Bush");
    public static Tile farnTile = new FarneTile(2, "Farne");
    public static Tile metalSignTile = new MetalSignTile(3, "Metal Sign");
    public static Tile treeShadowLeftTile = new TreeShadowLeftTile(4, "Left Treeshadow");
    public static Tile treeShadowRightTile = new TreeShadowRightTile(5, "Right Treeshadow");

    //fence
    public static Tile fenceTopTile = new FenceTopTile(10, "Top Fence");
    public static Tile fenceLeftTile = new FenceLeftTile(11, " Left Fence");
    public static Tile fenceRightTile = new FenceRightTile(12, "Right Fence");
    public static Tile fenceCornerTopLeftTile = new FenceCornerTopLeftTile(13, "Top Left Fence Corner");
    public static Tile fenceCornerTopRightTile = new FenceCornerTopRightTile(14, "Top Right Fence Corner");
    public static Tile fenceCornerBottomLeftTile = new FenceCornerBottomLeftTile(15, "Bottom Left Fence Corner");
    public static Tile fenceCornerBottomRightTile = new FenceCornerBottomRightTile(16, "Bottom Right Fence Corner");
    public static Tile fenceIntersectionLeftTile = new FenceIntersectionLeftTile(17, "Left Fence Intersection ");
    public static Tile fenceIntersectionRightTile = new FenceIntersectionRightTile(18, "Right Fence Intersection");

    //bushwalls
    public static Tile bushwallSideTile = new BushwallSideTile(20, "Side Bushwall");
    public static Tile bushwallDownTile = new BushwallDownTile(21, "Bushwall Down");
    public static Tile bushwallCornerTopLeftTile = new BushwallCornerTopLeftTile(22, "Top Left Bushwall Corner");
    public static Tile bushwallCornerTopRightTile = new BushwallCornerTopRightTile(23, "Top Right Bushwall Corner");
    public static Tile bushwallCornerBottomLeftTile = new BushwallCornerBottomLeftTile(24, "Bottom Left Bushwall Corner");
    public static Tile bushwallCornerBottomRightTile = new BushwallCornerBottomRightTile(25, "Bottom Right Bushwall Corner");
    public static Tile bushwallEndUpTile = new BushwallEndUpTile(26, "Top Bushwall End");
    public static Tile bushwallEndDownTile = new BushwallEndDownTile(27, "Bottom Bushwall End");
    public static Tile bushwallEndLeftTile = new BushwallEndLeftTile(28, "Left Bushwall End");
    public static Tile bushwallEndRightTile = new BushwallEndRightTile(29, "Right Bushwall End");

    //StillWater
    public static Tile stillWaterTile = new StillWaterTile(30, "Still Water");
    public static Tile stillWaterEdgeTopTile = new StillWaterEdgeTopTile(31, "Still Water Top Edge");
    public static Tile stillWaterEdgeBottomTile = new StillWaterEdgeBottomTile(32, "Still Water Bottom Edge");
    public static Tile stillWaterEdgeLeftTile = new StillWaterEdgeLeftTile(33, "Still Water Left Edge");
    public static Tile stillWaterEdgeRightTile = new StillWaterEdgeRightTile(34, "Still Water Right Edge");
    public static Tile stillWaterEdgeTopLeftTile = new StillWaterEdgeTopLeftTile(35, "Still Water Top Left Edge");
    public static Tile stillWaterEdgeTopRightTile = new StillWaterEdgeTopRightTile(36, "Still Water Top Right Edge");
    public static Tile stillWaterEdgeBottomLeftTile = new StillWaterEdgeBottomLeftTile(37, "Still Water Bottom Left Edge");
    public static Tile stillWaterEdgeBottomRightTile = new StillWaterEdgeBottomRightTile(38, "Still Water Bottom Right Edge");

    //DeepWaterTile
    public static Tile deepWaterTile = new DeepWaterTile(40, "Deep Water Tile");
    public static Tile deepWaterEdgeTopTile = new DeepWaterEdgeTopTile(41, "Deep Water Top Edge");
    public static Tile deepWaterEdgeBottomTile = new DeepWaterEdgeBottomTile(42, "Deep Water Bottom Edge");
    public static Tile deepWaterEdgeLeftTile = new DeepWaterEdgeLeftTile(43, "Deep Water Left Edge");
    public static Tile deepWaterEdgeRightTile = new DeepWaterEdgeRightTile(44, "Deep Water Right Edge");
    public static Tile deepWaterEdgeTopLeftTile = new DeepWaterEdgeTopLeftTile(45, "Deep Water Top Left Edge");
    public static Tile deepWaterEdgeTopRightTile = new DeepWaterEdgeTopRightTile(46, "Deep Water Top Right Edge");
    public static Tile deepWaterEdgeBottomLeftTile = new DeepWaterEdgeBottomLeftTile(47, "Deep Water Bottom Left Edge");
    public static Tile deepWaterEdgeBottomRightTile = new DeepWaterEdgeBottomRightTile(48, "Deep Water Bottom Right Edge");
    public static Tile deepWaterOutsideEdgeTopLeftTile = new DeepWaterOutsideEdgeTopLeftTile(49, "Deep Water Top Left Outside Edge");
    public static Tile deepWaterOutsideEdgeTopRightTile = new DeepWaterOutsideEdgeTopRightTile(50, "Deep Water Top Right Outside Edge");
    public static Tile deepWaterOutsideEdgeBottomLeftTile = new DeepWaterOutsideEdgeBottomLeftTile(51, "Deep Water Bottom Left Outside Edge");
    public static Tile deepWaterOutsideEdgeBottomRightTile = new DeepWaterOutsideEdgeBottomRightTile(52, "Deep Water Bottom Right Outside Edge");

    //WoodFence
    public static Tile woodFenceTopTile = new WoodFenceTopTile(60);
    public static Tile woodFenceLeftTile = new WoodFenceLeftTile(61);
    public static Tile woodFenceRightTile = new WoodFenceRightTile(62);
    public static Tile woodFenceCornerTopLeftTile = new WoodFenceCornerTopLeftTile(63);
    public static Tile woodFenceCornerTopRightTile = new WoodFenceCornerTopRightTile(64);
    public static Tile woodFenceCornerBottomLeftTile = new WoodFenceCornerBottomLeftTile(65);
    public static Tile woodFenceCornerBottomRightTile = new WoodFenceCornerBottomRightTile(66);

    //BeachTiles
    public static Tile beachTile = new BeachTile(70, "Beach Tile");
    public static Tile beachEdgeTopTile = new BeachEdgeTopTile(71, "Beach Top Edge");
    public static Tile beachEdgeBottomTile = new BeachEdgeBottomTile(72, "Beach Bottom Edge");
    public static Tile beachEdgeLeftTile = new BeachEdgeLeftTile(73, "Beach Left Edge");
    public static Tile beachEdgeRightTile = new BeachEdgeRightTile(74, "Beach Right Edge");
    public static Tile beachEdgeTopLeftTile = new BeachEdgeTopLeftTile(75, "Beach Top Left Edge");
    public static Tile beachEdgeTopRightTile = new BeachEdgeTopRightTile(76, "Beach Top Right Edge");
    public static Tile beachEdgeBottomLeftTile = new BeachEdgeBottomLeftTile(77, "Beach Bottom Left Edge");
    public static Tile beachEdgeBottomRightTile = new BeachEdgeBottomRightTile(78, "Beach Bottom Right Edge");
    public static Tile beachOutsideEdgeTopLeftTile = new BeachOutsideEdgeTopLeftTile(79, "Beach Top Left Outside Edge");
    public static Tile beachOutsideEdgeTopRightTile = new BeachOutsideEdgeTopRightTile(80, "Beach Top Right Outside Edge");
    public static Tile beachOutsideEdgeBottomLeftTile = new BeachOutsideEdgeBottomLeftTile(81, "Beach Bottom Left Outside Edge");
    public static Tile beachOutsideEdgeBottomRightTile = new BeachOutsideEdgeBottomRightTile(82, "Beach Bottom Right Outside Edge");

    public static int getTilesNumber(Tile t) {
        ArrayList<Tile> list = new ArrayList<Tile>();
        Collections.addAll(list, StaticTiles.tiles);
        return list.indexOf(t);
    }

    public static Tile getNumbersTile(int i) {
        return tiles[i];
    }
}
