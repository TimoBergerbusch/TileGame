package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    private static final int TileWidth = 16, TileHeight = 16;
    private static final int PlayerWidth = 17, playerHeight = 23;
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, sign, tree;
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallendRight, bushwallEndDown, bushwallEndUp;
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;
    public static BufferedImage waterEdgeTopLeft, waterEdgeTop, waterEdgeTopRight, waterEdgeLeft, water, waterEdgeRight, waterEdgeBotuumLeft, waterEdgeBottum, waterEdgeBottumRight;
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));

        //Enviroment
        grass = sheet.crop(0, 0, TileWidth, TileHeight);
        farne = sheet.crop(0, TileHeight, TileWidth, TileHeight);
        flower = sheet.crop(0, 2 * TileHeight, TileWidth, TileHeight);
        roundBush = sheet.crop(0, 3 * TileHeight, TileWidth, TileHeight);
        hopedgeLeft = sheet.crop(0, 4 * TileHeight, TileWidth, TileHeight);
        hopedgeBottum = sheet.crop(0, 5 * TileHeight, TileWidth, TileHeight);
        hopedgeRight = sheet.crop(0, 6 * TileHeight, TileWidth, TileHeight);
        sign = sheet.crop(0, 7 * TileHeight, TileWidth, TileHeight);
        tree = sheet.crop(0, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);

        //Bushwall
        bushwallCornerTopLeft = sheet.crop(TileWidth, 0, TileWidth, TileHeight);
        bushwallDown = sheet.crop(TileWidth, TileHeight, TileWidth, TileHeight);
        bushwallEndLeft = sheet.crop(TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        bushwallendRight = sheet.crop(TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        bushwallEndDown = sheet.crop(TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        bushwallEndUp = sheet.crop(TileWidth, 5 * TileHeight, TileWidth, TileHeight);

        //Fence
        fenceTop = sheet.crop(2 * TileWidth, 0, TileWidth, TileHeight);
        fenceLeft = sheet.crop(2 * TileWidth, TileHeight, TileWidth, TileHeight);
        fenceRight = sheet.crop(2 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionLeft = sheet.crop(2 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionRight = sheet.crop(2 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopRight = sheet.crop(2 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopLeft = sheet.crop(2 * TileWidth, 6 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumLeft = sheet.crop(2 * TileWidth, 7 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumRight = sheet.crop(2 * TileWidth, 8 * TileHeight, TileWidth, TileHeight);

        //Water
        waterEdgeTopLeft = sheet.crop(3 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTop = sheet.crop(4 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTopRight = sheet.crop(5 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeLeft = sheet.crop(3 * TileWidth, TileHeight, TileWidth, TileHeight);
        water = sheet.crop(4 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeRight = sheet.crop(5 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeBotuumLeft = sheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottum = sheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBotuumLeft = sheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);

        //Path
        pathEndTopLeft = sheet.crop(3 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathEndTopRight = sheet.crop(4 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathLeft = sheet.crop(3 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathRight = sheet.crop(4 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathEndBottumLeft = sheet.crop(3 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathEndBottumRight = sheet.crop(4 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
    }

}
