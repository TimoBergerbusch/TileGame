package gfx;


import java.awt.image.BufferedImage;

import javafx.scene.input.KeyCode;

public class Assets {

    private static final int TileWidth = 16, TileHeight = 16;
    private static final int PlayerWidth = 17, playerHeight = 23;
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, sign, tree;
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallendRight, bushwallEndDown, bushwallEndUp;
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;
    public static BufferedImage waterEdgeTopLeft, waterEdgeTop, waterEdgeTopRight, waterEdgeLeft, water, waterEdgeRight, waterEdgeBotuumLeft, waterEdgeBottum, waterEdgeBottumRight;
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight;
    public static BufferedImage player;

    public static void init() {
        SpriteSheet TileSheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
        SpriteSheet PlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/Player.png"));

        //Enviroment
        grass = TileSheet.crop(0, 0, TileWidth, TileHeight);
        farne = TileSheet.crop(0, TileHeight, TileWidth, TileHeight);
        flower = TileSheet.crop(0, 2 * TileHeight, TileWidth, TileHeight);
        roundBush = TileSheet.crop(0, 3 * TileHeight, TileWidth, TileHeight);
        hopedgeLeft = TileSheet.crop(0, 4 * TileHeight, TileWidth, TileHeight);
        hopedgeBottum = TileSheet.crop(0, 5 * TileHeight, TileWidth, TileHeight);
        hopedgeRight = TileSheet.crop(0, 6 * TileHeight, TileWidth, TileHeight);
        sign = TileSheet.crop(0, 7 * TileHeight, TileWidth, TileHeight);
        tree = TileSheet.crop(0, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);

        //Bushwall
        bushwallCornerTopLeft = TileSheet.crop(TileWidth, 0, TileWidth, TileHeight);
        bushwallDown = TileSheet.crop(TileWidth, TileHeight, TileWidth, TileHeight);
        bushwallEndLeft = TileSheet.crop(TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        bushwallendRight = TileSheet.crop(TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        bushwallEndDown = TileSheet.crop(TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        bushwallEndUp = TileSheet.crop(TileWidth, 5 * TileHeight, TileWidth, TileHeight);

        //Fence
        fenceTop = TileSheet.crop(2 * TileWidth, 0, TileWidth, TileHeight);
        fenceLeft = TileSheet.crop(2 * TileWidth, TileHeight, TileWidth, TileHeight);
        fenceRight = TileSheet.crop(2 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionLeft = TileSheet.crop(2 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionRight = TileSheet.crop(2 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopRight = TileSheet.crop(2 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopLeft = TileSheet.crop(2 * TileWidth, 6 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumLeft = TileSheet.crop(2 * TileWidth, 7 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumRight = TileSheet.crop(2 * TileWidth, 8 * TileHeight, TileWidth, TileHeight);

        //Water
        waterEdgeTopLeft = TileSheet.crop(3 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTop = TileSheet.crop(4 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTopRight = TileSheet.crop(5 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeLeft = TileSheet.crop(3 * TileWidth, TileHeight, TileWidth, TileHeight);
        water = TileSheet.crop(4 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeRight = TileSheet.crop(5 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeBotuumLeft = TileSheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottum = TileSheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBotuumLeft = TileSheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);

        //Path
        pathEndTopLeft = TileSheet.crop(3 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathEndTopRight = TileSheet.crop(4 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathLeft = TileSheet.crop(3 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathRight = TileSheet.crop(4 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathEndBottumLeft = TileSheet.crop(3 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathEndBottumRight = TileSheet.crop(4 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);

        player = PlayerSheet.crop(68, 33, 18, 24);
    }

}
