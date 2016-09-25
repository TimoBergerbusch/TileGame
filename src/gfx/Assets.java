package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    public static final int TileWidth = 16, TileHeight = 16;
    //Enviroment (Town)
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, metalSign, woodSign, tree, treeShadowLeft, treeShadowRight;
    public static BufferedImage pavilionLeft, pavilionMid, pavilionRight;
    public static BufferedImage greenHouse, redHouse;
    //bushwall
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallEndRight, bushwallEndDown, bushwallEndUp;
    //Fence
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;

    public static BufferedImage woodFenceTop, woodFenceLeft, woodFenceRight, woodFenceIntersectionLeft, woodFenceIntersectionRight, woodFenceCornerTopRight, woodFenceCornerTopLeft, woodFenceCornerBottumLeft, woodFenceCornerBottumRight;

    //Water
    public static BufferedImage stillWaterEdgeTopLeft, stillWaterEdgeTop, stillWaterEdgeTopRight, stillWaterEdgeLeft, stillWater, stillWaterEdgeRight, stillWaterEdgeBottumLeft, stillWaterEdgeBottum, stillWaterEdgeBottumRight;
    public static BufferedImage deepWater, deepWaterEdgeTopLeft, deepWaterEdgeTop, deepWaterEdgeTopRight, deepWaterEdgeLeft, deepWaterEdgeRight, deepWaterEdgeBottumLeft, deepWaterEdgeBottum, deepWaterEdgeBottumRight;
    //    public static BufferedImage[] deepWater;
    //Path
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight, pathTop, pathBottum, pathFull;
    //Player
    public static BufferedImage playerStillDown, playerStillUp, playerStillLeft, playerStillRight;
    public static BufferedImage[] player_down, player_up, player_left, player_right;

    public static void init() {
        SpriteSheet tileSheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));

        //Environment
        grass = tileSheet.crop(0, 0, TileWidth, TileHeight);
        farne = tileSheet.crop(0, TileHeight, TileWidth, TileHeight);
        flower = tileSheet.crop(0, 2 * TileHeight, TileWidth, TileHeight);
        roundBush = tileSheet.crop(0, 3 * TileHeight, TileWidth, TileHeight);
        hopedgeLeft = tileSheet.crop(0, 4 * TileHeight, TileWidth, TileHeight);
        hopedgeBottum = tileSheet.crop(0, 5 * TileHeight, TileWidth, TileHeight);
        hopedgeRight = tileSheet.crop(0, 6 * TileHeight, TileWidth, TileHeight);

        tree = tileSheet.crop(0, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        treeShadowLeft = tileSheet.crop(0, 11 * TileHeight, TileWidth, TileHeight);
        treeShadowRight = tileSheet.crop(TileWidth, 11 * TileHeight, TileWidth, TileHeight);

        pavilionLeft = tileSheet.crop(7 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionMid = tileSheet.crop(8 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionRight = tileSheet.crop(9 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);

        initBushwall(tileSheet);

        initFence(tileSheet);
        initWoodFence(tileSheet);

        initWater(tileSheet);

        initPath(tileSheet);

        initPlayer();


    }

    private static void initTowns(SpriteSheet tileSheet) {
        initHouses(tileSheet);

        metalSign = tileSheet.crop(0, 7 * TileHeight, TileWidth, TileHeight);
        woodSign = tileSheet.crop(TileWidth, 7 * TileHeight, TileWidth, TileHeight);
    }

    private static void initHouses(SpriteSheet tileSheet) {
        greenHouse = tileSheet.crop(6 * TileWidth, 0, 5 * TileWidth, 5 * TileHeight);
        redHouse = tileSheet.crop(11 * TileWidth, 0, 5 * TileWidth, 5 * TileHeight);
    }

    private static void initPath(SpriteSheet tileSheet) {
        //Path
        pathEndTopLeft = tileSheet.crop(3 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathEndTopRight = tileSheet.crop(4 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathLeft = tileSheet.crop(3 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathRight = tileSheet.crop(4 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathEndBottumLeft = tileSheet.crop(3 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathEndBottumRight = tileSheet.crop(4 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathTop = tileSheet.crop(5 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathBottum = tileSheet.crop(5 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathFull = tileSheet.crop(5 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
    }

    private static void initWater(SpriteSheet tileSheet) {
        initStillWater(tileSheet);
        initDeepWater(tileSheet);
    }

    private static void initDeepWater(SpriteSheet tileSheet) {
        deepWaterEdgeTopLeft = tileSheet.crop(3 * TileWidth, 6 * TileHeight);
        deepWaterEdgeTop = tileSheet.crop(4 * TileWidth, 6 * TileHeight);
        deepWaterEdgeTopRight = tileSheet.crop(5 * TileWidth, 6 * TileHeight);
        deepWaterEdgeLeft = tileSheet.crop(3 * TileWidth, 7 * TileHeight);
        deepWater = tileSheet.crop(4 * TileWidth, 7 * TileHeight);
        deepWaterEdgeRight = tileSheet.crop(5 * TileWidth, 7 * TileHeight);
        deepWaterEdgeBottumLeft = tileSheet.crop(3 * TileWidth, 8 * TileHeight);
        deepWaterEdgeBottum = tileSheet.crop(4 * TileWidth, 8 * TileHeight);
        deepWaterEdgeBottumRight = tileSheet.crop(5 * TileWidth, 8 * TileHeight);

//        deepWater = new BufferedImage[4];
//        deepWater[0] = tileSheet.crop(2 * TileWidth, 11 * TileHeight);
//        deepWater[1] = tileSheet.crop(3 * TileWidth, 11 * TileHeight);
//        deepWater[2] = tileSheet.crop(4 * TileWidth, 11 * TileHeight);
//        deepWater[3] = tileSheet.crop(5 * TileWidth, 11 * TileHeight);

    }

    private static void initStillWater(SpriteSheet tileSheet) {
        //stillWater
        stillWaterEdgeTopLeft = tileSheet.crop(3 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeTop = tileSheet.crop(4 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeTopRight = tileSheet.crop(5 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeLeft = tileSheet.crop(3 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWater = tileSheet.crop(4 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWaterEdgeRight = tileSheet.crop(5 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottumLeft = tileSheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottum = tileSheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottumRight = tileSheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
    }

    private static void initPlayer() {

        SpriteSheet PlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/PlayerSpriteSheet.png"));
        int playerWidth = 17, playerHeight = 25;
        player_up = new BufferedImage[2];
        player_up[0] = PlayerSheet.crop(3 * playerWidth, 0, playerWidth, playerHeight);
        player_up[1] = PlayerSheet.crop(3 * playerWidth, playerHeight, playerWidth, playerHeight);
        playerStillUp = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);

        player_down = new BufferedImage[2];
        player_down[0] = PlayerSheet.crop(3 * playerWidth, 5 * playerHeight, playerWidth, playerHeight);
        player_down[1] = PlayerSheet.crop(3 * playerWidth, 6 * playerHeight, playerWidth, playerHeight);
        playerStillDown = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);

        player_left = new BufferedImage[2];
        player_left[0] = PlayerSheet.crop(0, 3 * playerHeight, playerWidth, playerHeight);
        player_left[1] = PlayerSheet.crop(playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        playerStillLeft = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);

        player_right = new BufferedImage[2];
        player_right[0] = PlayerSheet.crop(5 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_right[1] = PlayerSheet.crop(6 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        playerStillRight = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
    }

    private static void initBushwall(SpriteSheet TileSheet) {
        //Bushwall
        bushwallCornerTopLeft = TileSheet.crop(TileWidth, 0, TileWidth, TileHeight);
        bushwallDown = TileSheet.crop(TileWidth, TileHeight, TileWidth, TileHeight);
        bushwallEndLeft = TileSheet.crop(TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        bushwallEndRight = TileSheet.crop(TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        bushwallEndDown = TileSheet.crop(TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        bushwallEndUp = TileSheet.crop(TileWidth, 5 * TileHeight, TileWidth, TileHeight);
    }

    private static void initFence(SpriteSheet tileSheet) {
        //fence
        fenceTop = tileSheet.crop(2 * TileWidth, 0, TileWidth, TileHeight);
        fenceLeft = tileSheet.crop(2 * TileWidth, TileHeight, TileWidth, TileHeight);
        fenceRight = tileSheet.crop(2 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionLeft = tileSheet.crop(2 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        fenceIntersectionRight = tileSheet.crop(2 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopRight = tileSheet.crop(2 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        fenceCornerTopLeft = tileSheet.crop(2 * TileWidth, 6 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumLeft = tileSheet.crop(2 * TileWidth, 7 * TileHeight, TileWidth, TileHeight);
        fenceCornerBottumRight = tileSheet.crop(2 * TileWidth, 8 * TileHeight, TileWidth, TileHeight);
    }

    private static void initWoodFence(SpriteSheet tileSheet) {
        woodFenceTop = tileSheet.crop(6 * TileWidth, 5 * TileHeight);
        woodFenceLeft = tileSheet.crop(6 * TileWidth, 6 * TileHeight);
        woodFenceRight = tileSheet.crop(6 * TileWidth, 7 * TileHeight);
        woodFenceCornerTopRight = tileSheet.crop(6 * TileWidth, 8 * TileHeight);
        woodFenceCornerTopLeft = tileSheet.crop(6 * TileWidth, 9 * TileHeight);
        woodFenceCornerBottumLeft = tileSheet.crop(6 * TileWidth, 10 * TileHeight);
        woodFenceCornerBottumRight = tileSheet.crop(6 * TileWidth, 11 * TileHeight);
    }

}
