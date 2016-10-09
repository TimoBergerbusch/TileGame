package sets;

import java.awt.image.*;

import tiles.*;

public class StaticSets {

    public static Tile[] environmentTiles = {StaticTiles.grassTile, StaticTiles.farnTile, StaticTiles.roundBushTile, StaticTiles.metalSignTile, StaticTiles.treeShadowLeftTile, StaticTiles.treeShadowRightTile};
    public static Tile[] fenceTiles = {StaticTiles.fenceTopTile, StaticTiles.fenceLeftTile, StaticTiles.fenceRightTile, StaticTiles.fenceCornerTopLeftTile, StaticTiles.fenceCornerTopRightTile, StaticTiles.fenceCornerBottomLeftTile, StaticTiles.fenceCornerBottomRightTile, StaticTiles.fenceIntersectionLeftTile, StaticTiles.fenceIntersectionRightTile};
    public static Tile[] woodFenceTiles = {StaticTiles.woodFenceTopTile, StaticTiles.woodFenceLeftTile, StaticTiles.woodFenceRightTile, StaticTiles.woodFenceCornerTopLeftTile, StaticTiles.woodFenceCornerTopRightTile, StaticTiles.woodFenceCornerBottomLeftTile, StaticTiles.woodFenceCornerBottomRightTile};
    public static Tile[] pathTiles = {StaticTiles.brownStonePathTile, StaticTiles.brownStonePathTopTile, StaticTiles.brownStonePathBottomTile, StaticTiles.brownStonePathLeftTile, StaticTiles.brownStonePathRightTile, StaticTiles.brownStonePathTopLeftTile, StaticTiles.brownStonePathTopRightTile, StaticTiles.brownStonePathBottomLeftTile, StaticTiles.brownStonePathBottomRightTile,
            StaticTiles.lightGreyStonePathTile, StaticTiles.lightGreyStonePathTopTile, StaticTiles.lightGreyStonePathBottomTile, StaticTiles.lightGreyStonePathLeftTile, StaticTiles.lightGreyStonePathRightTile, StaticTiles.lightGreyStonePathTopLeftTile, StaticTiles.lightGreyStonePathTopRightTile, StaticTiles.lightGreyStonePathBottomLeftTile, StaticTiles.lightGreyStonePathBottomRightTile,
            StaticTiles.darkGreyStonePathTile, StaticTiles.darkGreyStonePathTopTile, StaticTiles.darkGreyStonePathBottomTile, StaticTiles.darkGreyStonePathLeftTile, StaticTiles.darkGreyStonePathRightTile, StaticTiles.darkGreyStonePathTopLeftTile, StaticTiles.darkGreyStonePathTopRightTile, StaticTiles.darkGreyStonePathBottomLeftTile, StaticTiles.darkGreyStonePathBottomRightTile,
            StaticTiles.gridPathTile, StaticTiles.gridPathTopTile, StaticTiles.gridPathBottomTile, StaticTiles.gridPathLeftTile, StaticTiles.gridPathRightTile, StaticTiles.gridPathTopLeftTile, StaticTiles.gridPathTopRightTile, StaticTiles.gridPathBottomLeftTile, StaticTiles.gridPathBottomRightTile};
    public static Tile[] stillWaterTiles = {StaticTiles.stillWaterTile, StaticTiles.stillWaterEdgeTopTile, StaticTiles.stillWaterEdgeBottomTile, StaticTiles.stillWaterEdgeLeftTile, StaticTiles.stillWaterEdgeRightTile, StaticTiles.stillWaterEdgeTopLeftTile, StaticTiles.stillWaterEdgeTopRightTile, StaticTiles.stillWaterEdgeBottomLeftTile, StaticTiles.stillWaterEdgeBottomRightTile};
    public static Tile[] deepWaterTiles = {StaticTiles.deepWaterTile, StaticTiles.deepWaterEdgeTopTile, StaticTiles.deepWaterEdgeBottomTile, StaticTiles.deepWaterEdgeLeftTile, StaticTiles.deepWaterEdgeRightTile, StaticTiles.deepWaterEdgeTopLeftTile, StaticTiles.deepWaterEdgeTopRightTile, StaticTiles.deepWaterEdgeBottomLeftTile, StaticTiles.deepWaterEdgeBottomRightTile, StaticTiles.deepWaterOutsideEdgeTopLeftTile, StaticTiles.deepWaterOutsideEdgeTopRightTile, StaticTiles.deepWaterOutsideEdgeBottomLeftTile, StaticTiles.deepWaterOutsideEdgeBottomRightTile};
    public static Tile[] complexPathTiles = {StaticTiles.gravelTile, StaticTiles.gravelEdgeTopTile, StaticTiles.gravelEdgeBottomTile, StaticTiles.gravelEdgeLeftTile, StaticTiles.gravelEdgeRightTile, StaticTiles.gravelEdgeTopLeftTile, StaticTiles.gravelEdgeTopRightTile, StaticTiles.gravelEdgeBottomLeftTile, StaticTiles.gravelEdgeBottomRightTile, StaticTiles.gravelOutsideEdgeTopLeftTile, StaticTiles.gravelOutsideEdgeTopRightTile, StaticTiles.gravelOutsideEdgeBottomLeftTile, StaticTiles.gravelOutsideEdgeBottomRightTile,
            StaticTiles.beachTile, StaticTiles.beachEdgeTopTile, StaticTiles.beachEdgeBottomTile, StaticTiles.beachEdgeLeftTile, StaticTiles.beachEdgeRightTile, StaticTiles.beachEdgeTopLeftTile, StaticTiles.beachEdgeTopRightTile, StaticTiles.beachEdgeBottomLeftTile, StaticTiles.beachEdgeBottomRightTile, StaticTiles.beachOutsideEdgeTopLeftTile, StaticTiles.beachOutsideEdgeTopRightTile, StaticTiles.beachOutsideEdgeBottomLeftTile, StaticTiles.beachOutsideEdgeBottomRightTile,
            StaticTiles.dirtTile, StaticTiles.dirtEdgeTopTile, StaticTiles.dirtEdgeBottomTile, StaticTiles.dirtEdgeLeftTile, StaticTiles.dirtEdgeRightTile, StaticTiles.dirtEdgeTopLeftTile, StaticTiles.dirtEdgeTopRightTile, StaticTiles.dirtEdgeBottomLeftTile, StaticTiles.dirtEdgeBottomRightTile, StaticTiles.dirtOutsideEdgeTopLeftTile, StaticTiles.dirtOutsideEdgeTopRightTile, StaticTiles.dirtOutsideEdgeBottomLeftTile, StaticTiles.dirtOutsideEdgeBottomRightTile,
            StaticTiles.lightGravelTile, StaticTiles.lightGravelEdgeTopTile, StaticTiles.lightGravelEdgeBottomTile, StaticTiles.lightGravelEdgeLeftTile, StaticTiles.lightGravelEdgeRightTile, StaticTiles.lightGravelEdgeTopLeftTile, StaticTiles.lightGravelEdgeTopRightTile, StaticTiles.lightGravelEdgeBottomLeftTile, StaticTiles.lightGravelEdgeBottomRightTile, StaticTiles.lightGravelOutsideEdgeTopLeftTile, StaticTiles.lightGravelOutsideEdgeTopRightTile, StaticTiles.lightGravelOutsideEdgeBottomLeftTile, StaticTiles.lightGravelOutsideEdgeBottomRightTile,
            StaticTiles.darkGrassTile, StaticTiles.darkGrassEdgeTopTile, StaticTiles.darkGrassEdgeBottomTile, StaticTiles.darkGrassEdgeLeftTile, StaticTiles.darkGrassEdgeRightTile, StaticTiles.darkGrassEdgeTopLeftTile, StaticTiles.darkGrassEdgeTopRightTile, StaticTiles.darkGrassEdgeBottomLeftTile, StaticTiles.darkGrassEdgeBottomRightTile, StaticTiles.darkGrassOutsideEdgeTopLeftTile, StaticTiles.darkGrassOutsideEdgeTopRightTile, StaticTiles.darkGrassOutsideEdgeBottomLeftTile, StaticTiles.darkGrassOutsideEdgeBottomRightTile,
            StaticTiles.lightGrassTile, StaticTiles.lightGrassEdgeTopTile, StaticTiles.lightGrassEdgeBottomTile, StaticTiles.lightGrassEdgeLeftTile, StaticTiles.lightGrassEdgeRightTile, StaticTiles.lightGrassEdgeTopLeftTile, StaticTiles.lightGrassEdgeTopRightTile, StaticTiles.lightGrassEdgeBottomLeftTile, StaticTiles.lightGrassEdgeBottomRightTile, StaticTiles.lightGrassOutsideEdgeTopLeftTile, StaticTiles.lightGrassOutsideEdgeTopRightTile, StaticTiles.lightGrassOutsideEdgeBottomLeftTile, StaticTiles.lightGrassOutsideEdgeBottomRightTile,
            StaticTiles.mudTile, StaticTiles.mudEdgeTopTile, StaticTiles.mudEdgeBottomTile, StaticTiles.mudEdgeLeftTile, StaticTiles.mudEdgeRightTile, StaticTiles.mudEdgeTopLeftTile, StaticTiles.mudEdgeTopRightTile, StaticTiles.mudEdgeBottomLeftTile, StaticTiles.mudEdgeBottomRightTile, StaticTiles.mudOutsideEdgeTopLeftTile, StaticTiles.mudOutsideEdgeTopRightTile, StaticTiles.mudOutsideEdgeBottomLeftTile, StaticTiles.mudOutsideEdgeBottomRightTile,
            StaticTiles.pavingTile, StaticTiles.pavingEdgeTopTile, StaticTiles.pavingEdgeBottomTile, StaticTiles.pavingEdgeLeftTile, StaticTiles.pavingEdgeRightTile, StaticTiles.pavingEdgeTopLeftTile, StaticTiles.pavingEdgeTopRightTile, StaticTiles.pavingEdgeBottomLeftTile, StaticTiles.pavingEdgeBottomRightTile, StaticTiles.pavingOutsideEdgeTopLeftTile, StaticTiles.pavingOutsideEdgeTopRightTile, StaticTiles.pavingOutsideEdgeBottomLeftTile, StaticTiles.pavingOutsideEdgeBottomRightTile,
            StaticTiles.sandTile, StaticTiles.sandEdgeTopTile, StaticTiles.sandEdgeBottomTile, StaticTiles.sandEdgeLeftTile, StaticTiles.sandEdgeRightTile, StaticTiles.sandEdgeTopLeftTile, StaticTiles.sandEdgeTopRightTile, StaticTiles.sandEdgeBottomLeftTile, StaticTiles.sandEdgeBottomRightTile, StaticTiles.sandOutsideEdgeTopLeftTile, StaticTiles.sandOutsideEdgeTopRightTile, StaticTiles.sandOutsideEdgeBottomLeftTile, StaticTiles.sandOutsideEdgeBottomRightTile};
    public static Tile[] bushwallTiles = {StaticTiles.bushwallDownTile, StaticTiles.bushwallSideTile, StaticTiles.bushwallCornerTopLeftTile, StaticTiles.bushwallCornerTopRightTile, StaticTiles.bushwallCornerBottomLeftTile, StaticTiles.bushwallCornerBottomRightTile, StaticTiles.bushwallEndUpTile, StaticTiles.bushwallEndDownTile, StaticTiles.bushwallEndLeftTile, StaticTiles.bushwallEndRightTile};
    public static Tile[] allTiles;
    public static SetManager setManager = initSetManager();

    private static SetManager initSetManager() {
        SetManager mgr = new SetManager();
        mgr.addSet("Environment", environmentTiles);
        mgr.addSet("Bushwall", bushwallTiles);
        mgr.addSet("Simple Paths", pathTiles);
        mgr.addSet("Complex Paths", complexPathTiles);
        mgr.addSet("Still Water", stillWaterTiles);
        mgr.addSet("Deep Water", deepWaterTiles);
        mgr.addSet("fence", fenceTiles);
        mgr.addSet("Wood fence", woodFenceTiles);
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
