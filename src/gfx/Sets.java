package gfx;

import java.awt.image.BufferedImage;

import gfx.Assets;
import tiles.StaticTiles;
import tiles.Tile;

public class Sets {
    public static BufferedImage[] enviroment = {Assets.grass, Assets.roundBush, Assets.metalSign, Assets.woodSign};
    public static Tile[] enviromentTiles = {StaticTiles.grassTile, StaticTiles.roundBushTile};
    //    public static BufferedImage[] town = {Assets.greenHouse, Assets.redHouse, Assets.metalSign, Assets.woodSign};
    public static BufferedImage[] woodFence = {Assets.woodFenceLeft, Assets.woodFenceRight, Assets.woodFenceTop, Assets.woodFenceCornerBottumLeft, Assets.woodFenceCornerBottumRight, Assets.woodFenceCornerTopLeft, Assets.woodFenceCornerTopRight};
}
