package sets;

import java.awt.image.BufferedImage;

import tiles.StaticTiles;
import tiles.Tile;

public class StaticSets {

    public static Tile[] environmentTiles = {StaticTiles.grassTile, StaticTiles.farnTile, StaticTiles.roundBushTile, StaticTiles.metalSignTile, StaticTiles.treeShadowLeftTile, StaticTiles.treeShadowRightTile};
    public static Tile[] fenceTiles = {StaticTiles.fenceTopTile, StaticTiles.fenceLeftTile, StaticTiles.fenceRightTile, StaticTiles.fenceCornerTopLeftTile, StaticTiles.fenceCornerTopRightTile, StaticTiles.fenceCornerBottomLeftTile, StaticTiles.fenceCornerBottomRightTile, StaticTiles.fenceIntersectionLeftTile, StaticTiles.fenceIntersectionRightTile};
    public static Tile[] woodFenceTiles = {StaticTiles.woodFenceTopTile, StaticTiles.woodFenceLeftTile, StaticTiles.woodFenceRightTile, StaticTiles.woodFenceCornerTopLeftTile, StaticTiles.woodFenceCornerTopRightTile, StaticTiles.woodFenceCornerBottomLeftTile, StaticTiles.woodFenceCornerBottomRightTile};
    public static Tile[] pathTiles = {StaticTiles.brownStonePathTile, StaticTiles.brownStonePathTopTile, StaticTiles.brownStonePathBottomTile, StaticTiles.brownStonePathLeftTile, StaticTiles.brownStonePathRightTile, StaticTiles.brownStonePathTopLeftTile, StaticTiles.brownStonePathTopRightTile, StaticTiles.brownStonePathBottomLeftTile, StaticTiles.brownStonePathBottomRightTile,
            StaticTiles.lightGreyStonePathTile, StaticTiles.lightGreyStonePathTopTile, StaticTiles.lightGreyStonePathBottomTile, StaticTiles.lightGreyStonePathLeftTile, StaticTiles.lightGreyStonePathRightTile, StaticTiles.lightGreyStonePathTopLeftTile, StaticTiles.lightGreyStonePathTopRightTile, StaticTiles.lightGreyStonePathBottomLeftTile, StaticTiles.lightGreyStonePathBottomRightTile,
            StaticTiles.darkGreyStonePathTile, StaticTiles.darkGreyStonePathTopTile, StaticTiles.darkGreyStonePathBottomTile, StaticTiles.darkGreyStonePathLeftTile, StaticTiles.darkGreyStonePathRightTile, StaticTiles.darkGreyStonePathTopLeftTile, StaticTiles.darkGreyStonePathTopRightTile, StaticTiles.darkGreyStonePathBottomLeftTile, StaticTiles.darkGreyStonePathBottomRightTile};
    public static Tile[] stillWaterTiles = {StaticTiles.stillWaterTile, StaticTiles.stillWaterEdgeTopTile, StaticTiles.stillWaterEdgeBottomTile, StaticTiles.stillWaterEdgeLeftTile, StaticTiles.stillWaterEdgeRightTile, StaticTiles.stillWaterEdgeTopLeftTile, StaticTiles.stillWaterEdgeTopRightTile, StaticTiles.stillWaterEdgeBottomLeftTile, StaticTiles.stillWaterEdgeBottomRightTile};
    public static Tile[] deepWaterTiles = {StaticTiles.deepWaterTile, StaticTiles.deepWaterEdgeTopTile, StaticTiles.deepWaterEdgeBottomTile, StaticTiles.deepWaterEdgeLeftTile, StaticTiles.deepWaterEdgeRightTile, StaticTiles.deepWaterEdgeTopLeftTile, StaticTiles.deepWaterEdgeTopRightTile, StaticTiles.deepWaterEdgeBottomLeftTile, StaticTiles.deepWaterEdgeBottomRightTile, StaticTiles.deepWaterOutsideEdgeTopLeftTile, StaticTiles.deepWaterOutsideEdgeTopRightTile, StaticTiles.deepWaterOutsideEdgeBottomLeftTile, StaticTiles.deepWaterOutsideEdgeBottomRightTile};
    public static Tile[] beachTiles = {StaticTiles.beachTile, StaticTiles.beachEdgeTopTile, StaticTiles.beachEdgeBottomTile, StaticTiles.beachEdgeLeftTile, StaticTiles.beachEdgeRightTile, StaticTiles.beachEdgeTopLeftTile, StaticTiles.beachEdgeTopRightTile, StaticTiles.beachEdgeBottomLeftTile, StaticTiles.beachEdgeBottomRightTile, StaticTiles.beachOutsideEdgeTopLeftTile, StaticTiles.beachOutsideEdgeTopRightTile, StaticTiles.beachOutsideEdgeBottomLeftTile, StaticTiles.beachOutsideEdgeBottomRightTile};
    public static Tile[] bushwallTiles = {StaticTiles.bushwallDownTile, StaticTiles.bushwallSideTile, StaticTiles.bushwallCornerTopLeftTile, StaticTiles.bushwallCornerTopRightTile, StaticTiles.bushwallCornerBottomLeftTile, StaticTiles.bushwallCornerBottomRightTile, StaticTiles.bushwallEndUpTile, StaticTiles.bushwallEndDownTile, StaticTiles.bushwallEndLeftTile, StaticTiles.bushwallEndRightTile};
    public static Tile[] allTiles;
    public static SetManager setManager = initSetManager();

    private static SetManager initSetManager() {
        SetManager mgr = new SetManager();
//        mgr.addSet("All Tiles", allTiles);
        mgr.addSet("Environment", environmentTiles);
        mgr.addSet("Bushwall", bushwallTiles);
        mgr.addSet("Pathes", pathTiles);
        mgr.addSet("Still Water", stillWaterTiles);
        mgr.addSet("Deep Water", deepWaterTiles);
        mgr.addSet("Beach", beachTiles);
        mgr.addSet("Fence", fenceTiles);
        mgr.addSet("Wood Fence", woodFenceTiles);
        mgr.setAllTiles();
        return mgr;
    }

    public static BufferedImage[] getBufferdImages() {
        BufferedImage[] images = new BufferedImage[allTiles.length];
        for (int x = 0; x < images.length; x++)
            images[x] = allTiles[x].getTexture();

        return images;
    }

}
