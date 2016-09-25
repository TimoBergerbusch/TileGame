package tiles;

import tiles.fence.*;
import tiles.bushwalls.*;
import tiles.stillWater.*;

public class StaticTiles {

    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0);
    public static Tile roundBushTile = new RoundBushTile(1);
    public static Tile farnTile = new FarneTile(2);
    public static Tile signTile = new FarneTile(3);
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
    public static Tile waterTile = new WaterTile(30);
    public static Tile waterEdgeTopTile = new WaterEdgeTopTile(31);
    public static Tile waterEdgeBottumTile = new WaterEdgeBottumTile(32);
    public static Tile waterEdgeLeftTile = new WaterEdgeLeftTile(33);
    public static Tile waterEdgeRightTile = new WaterEdgeRightTile(34);
    public static Tile waterEdgeTopLeftTile = new WaterEdgeTopLeftTile(35);
    public static Tile waterEdgeTopRightTile = new WaterEdgeTopRightTile(36);
    public static Tile waterEdgeBottumLeftTile = new WaterEdgeBottumLeftTile(37);
    public static Tile waterEdgeBottumRightTile = new WaterEdgeBottumRightTile(38);


}
