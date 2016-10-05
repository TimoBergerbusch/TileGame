package sets;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

import sets.SetCombination;
import tiles.StaticTiles;
import tiles.Tile;

public class Sets {

    public static Tile[] environmentTiles = {StaticTiles.grassTile, StaticTiles.farnTile, StaticTiles.roundBushTile, StaticTiles.treeShadowLeftTile, StaticTiles.treeShadowRightTile};
    public static Tile[] woodFenceTiles = {StaticTiles.woodFenceTopTile, StaticTiles.woodFenceLeftTile, StaticTiles.woodFenceRightTile, StaticTiles.woodFenceCornerTopLeftTile, StaticTiles.woodFenceCornerTopRightTile, StaticTiles.woodFenceCornerBottumLeftTile, StaticTiles.woodFenceCornerBottumRightTile};
    public static Tile[] allTiles = initAllTiles();
    public static SetManager setManager = initSetManager();

    private static SetManager initSetManager() {
        SetManager mgr = new SetManager();
        mgr.addSetCombination("All Tiles", allTiles);
        mgr.addSetCombination("Environment", environmentTiles);
        mgr.addSetCombination("Wood Fence", woodFenceTiles);
        return mgr;
    }

    public static Tile[] initAllTiles() {
        ArrayList<Tile> list = new ArrayList<Tile>();
        Collections.addAll(list, environmentTiles);
        Collections.addAll(list, woodFenceTiles);
        return list.toArray(new Tile[list.size()]);
    }

    private static java.awt.image.BufferedImage[] BufferedImage;

    public static BufferedImage[] getBufferdImages() {
        BufferedImage[] images = new BufferedImage[allTiles.length];
        for (int x = 0; x < images.length; x++)
            images[x] = allTiles[x].getTexture();

        return images;
    }

}
