package tiles;

import tiles.Bridge.*;
import tiles.bushwalls.*;
import tiles.fence.fence.*;
import tiles.fence.woodFence.*;
import tiles.water.stillWater.*;
import tiles.water.deepWater.*;

public class StaticTiles {

    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0);
    public static Tile roundBushTile = new RoundBushTile(1);
    public static Tile farnTile = new FarneTile(2);
    public static Tile treeShadowLeftTile = new TreeShadowLeftTile(4);
    public static Tile treeShadowRightTile = new TreeShadowRightTile(5);

    //fence
    public static Tile fenceTopTile = new FenceTopTile(10);
    public static Tile fenceLeftTile = new FenceLeftTile(11);
    public static Tile fenceRightTile = new FenceRightTile(12);
    public static Tile fenceCornerTopLeftTile = new FenceCornerTopLeftTile(13);
    public static Tile fenceCornerTopRightTile = new FenceCornerTopRightTile(14);
    public static Tile fenceCornerButtomLeftTile = new FenceCornerBottumLeftTile(15);
    public static Tile fenceCornerBottumRightTile = new FenceCornerBottumRightTile(16);
    public static Tile fenceIntersectionLeftTile = new FenceIntersectionLeftTile(17);
    public static Tile fenceIntersectionRightTile = new FenceIntersectionRightTile(18);

    //bushwalls
    public static Tile bushwallSideTile = new BushwallSideTile(20);
    public static Tile bushwallDownTile = new BushwallDownTile(21);
    public static Tile bushwallCornerTopLeftTile = new BushwallCornerTopLeftTile(22);
    public static Tile bushwallCornerTopRightTile = new BushwallCornerTopLeftTile(23);
    public static Tile bushwallCornerBottumLeftTile = new BushwallCornerTopLeftTile(24);
    public static Tile bushwallCornerBottumRightTile = new BushwallCornerTopLeftTile(25);
    public static Tile bushwallEndUpTile = new BushwallEndUpTile(26);
    public static Tile bushwallEndDownTile = new BushwallEndDownTile(27);
    public static Tile bushwallEndLeftTile = new BushwallEndLeftTile(28);
    public static Tile bushwallEndRightTile = new BushwallEndRightTile(29);

    //StillWater
    public static Tile stillWaterTile = new StillWaterTile(30);
    public static Tile stillWaterEdgeTopTile = new StillWaterEdgeTopTile(31);
    public static Tile stillWaterEdgeBottumTile = new StillWaterEdgeBottumTile(32);
    public static Tile stillWaterEdgeLeftTile = new StillWaterEdgeLeftTile(33);
    public static Tile stillWaterEdgeRightTile = new StillWaterEdgeRightTile(34);
    public static Tile stillWaterEdgeTopLeftTile = new StillWaterEdgeTopLeftTile(35);
    public static Tile stillWaterEdgeTopRightTile = new StillWaterEdgeTopRightTile(36);
    public static Tile stillWaterEdgeBottumLeftTile = new StillWaterEdgeBottumLeftTile(37);
    public static Tile stillWaterEdgeBottumRightTile = new StillWaterEdgeBottumRightTile(38);

    //DeepWaterTile
    public static Tile deepWaterTile = new DeepWaterTile(40);
    public static Tile deepWaterEdgeTopTile = new DeepWaterEdgeTopTile(41);
    public static Tile deepWaterEdgeBottumTile = new DeepWaterEdgeBottumTile(42);
    public static Tile deepWaterEdgeLeftTile = new DeepWaterEdgeLeftTile(43);
    public static Tile deepWaterEdgeRightTile = new DeepWaterEdgeRightTile(44);
    public static Tile deepWaterEdgeTopLeftTile = new DeepWaterEdgeTopLeftTile(45);
    public static Tile deepWaterEdgeTopRightTile = new DeepWaterEdgeTopRightTile(46);
    public static Tile deepWaterEdgeBottumLeftTile = new DeepWaterEdgeBottumLeftTile(47);
    public static Tile deepWaterEdgeBottumRightTile = new DeepWaterEdgeBottumRightTile(48);

    //WoodFence
    public static Tile woodFenceTopTile = new WoodFenceTopTile(50);
    public static Tile woodFenceLeftTile = new WoodFenceLeftTile(51);
    public static Tile woodFenceRightTile = new WoodFenceRightTile(52);
    public static Tile woodFenceCornerTopLeftTile = new WoodFenceCornerTopLeftTile(53);
    public static Tile woodFenceCornerTopRightTile = new WoodFenceCornerTopRightTile(54);
    public static Tile woodFenceCornerBottumLeftTile = new WoodFenceCornerBottumLeftTile(55);
    public static Tile woodFenceCornerBottumRightTile = new WoodFenceCornerBottumRightTile(56);

    //Bridge
//    public static Tile bridgeDownLeftTile = new BridgeDownLeftTile(60);
//    public static Tile bridgePostLeftTile = new BridgePostLeftTile(65);
//    public static Tile bridgeHandrailLeftTile = new BridgeHandrailLeftTile(70);
//    public static Tile bridgeUpLeftTile = new BridgeUpLeftTile(72);
//
//
//    public static Tile bridgeStairsDownLeftTile = new BridgeStairsDownLeftTile(61);
//    public static Tile bridgePlanksEndLeftTile = new BridgePlanksEndLeftTile(66);
//    public static Tile bridgeStairsUpLeftTile = new BridgeStairsUpLeftTile(73);
//
//    public static Tile bridgeStairsDownMidTile = new BridgeStairsDownMidTile(62);
//    public static Tile bridgePlanksMidTile = new BridgePlanksMidTile(67);
//    public static Tile bridgeStairsUpMidTile = new BridgeStairsUpMidTile(74);
//
//    public static Tile bridgeStairsDownRightTile = new BridgeStairsDownRightTile(63);
//    public static Tile bridgePlanksEndRightTile = new BridgePlanksEndRightTile(68);
//    public static Tile bridgeStairsUpRightTile = new BridgeStairsUpRightTile(75);
//
//    public static Tile bridgeDownRightTile = new BridgeDownRightTile(64);
//    public static Tile bridgePostRightTile = new BridgePostRightTile(69);
//    public static Tile bridgeHandrailRightTile = new BridgeHandrailRightTile(71);
//    public static Tile bridgeUpRightTile = new BridgeUpRightTile(76);


}
