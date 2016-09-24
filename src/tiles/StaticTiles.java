package tiles;

import tiles.Fence.*;
import tiles.Bushwalls.*;

public class StaticTiles {

    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0);
    public static Tile roundBushTile = new RoundBushTile(1);
    public static Tile farnTile = new FarneTile(2);
    public static Tile signTile = new FarneTile(3);

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

}
