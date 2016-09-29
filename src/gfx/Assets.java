package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    public static final int TileWidth = 16, TileHeight = 16;
    public static final int interactionWidth = 1250, interactionHeight = 250;
    //Enviroment (Town)
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, metalSign, woodSign, tree, treeShadowLeft, treeShadowRight, statue;
    public static BufferedImage pavilionLeft, pavilionMid, pavilionRight;
    public static BufferedImage greenHouse, redHouse;
    //bushwall
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallEndRight, bushwallEndDown, bushwallEndUp;
    //Fence
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;

    public static BufferedImage woodFenceTop, woodFenceLeft, woodFenceRight, woodFenceCornerTopRight, woodFenceCornerTopLeft, woodFenceCornerBottumLeft, woodFenceCornerBottumRight;

    //Water
    public static BufferedImage stillWaterEdgeTopLeft, stillWaterEdgeTop, stillWaterEdgeTopRight, stillWaterEdgeLeft, stillWater, stillWaterEdgeRight, stillWaterEdgeBottumLeft, stillWaterEdgeBottum, stillWaterEdgeBottumRight;
    public static BufferedImage deepWater, deepWaterEdgeTopLeft, deepWaterEdgeTop, deepWaterEdgeTopRight, deepWaterEdgeLeft, deepWaterEdgeRight, deepWaterEdgeBottumLeft, deepWaterEdgeBottum, deepWaterEdgeBottumRight, deepWaterOutsideEdgeTopLeft, deepWaterOutsideEdgeTopRight, deepWaterOutsideEdgeBottumLeft, deepWaterOutsideEdgeBottumRight;
    //    public static BufferedImage[] deepWater;

    //Bridge
    public static BufferedImage bridgeUpLeft, bridgeHandrailLeft, bridgePostLeft, bridgeDownLeft, bridgeStairsUpLeft, bridgePlanksEndLeft, bridgeStairsDownLeft, bridgeStairsUpMid, bridgePlanksMid, bridgeStairsDownMid, bridgeStairsUpRight,
            bridgePlanksEndRight, bridgeStairsDownRight, bridgeUpRight, bridgeHandrailRight, bridgePostRight, bridgeDownRight;

    //Path
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight, pathTop, pathBottum, pathFull;
    //Player
    public static BufferedImage playerStillDown, playerStillUp, playerStillLeft, playerStillRight;
    public static BufferedImage[] player_walking_down, player_walking_up, player_walking_left, player_walking_right;
    public static BufferedImage[] player_running_down, player_running_up, player_running_left, player_running_right;

    //Interaction Backgrounds
    public static BufferedImage greyBackground, scriptRollBackground, metalSignBackground;

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
        statue = tileSheet.crop(10 * TileWidth, 8 * TileHeight, TileWidth, 2 * TileHeight);

        tree = tileSheet.crop(0, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        treeShadowLeft = tileSheet.crop(0, 11 * TileHeight, TileWidth, TileHeight);
        treeShadowRight = tileSheet.crop(TileWidth, 11 * TileHeight, TileWidth, TileHeight);

        pavilionLeft = tileSheet.crop(7 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionMid = tileSheet.crop(8 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionRight = tileSheet.crop(9 * TileWidth, 9 * TileHeight, TileWidth, 3 * TileHeight);

        initTowns(tileSheet);

        initBushwall(tileSheet);

        initFence(tileSheet);
        initWoodFence(tileSheet);

        initWater(tileSheet);

        initPath(tileSheet);

        initBridge(tileSheet);

        initPlayer();

        initInteractionBackgrounds();
    }

    private static void initInteractionBackgrounds() {
        SpriteSheet backgroundSheet = new SpriteSheet(ImageLoader.loadImage("/textures/dialogBackgrounds/backgrounds.png"));

        greyBackground = backgroundSheet.crop(0, 0, interactionWidth, interactionHeight);
        scriptRollBackground = backgroundSheet.crop(0, interactionHeight, interactionWidth, interactionHeight);
        metalSignBackground = backgroundSheet.crop(0, 2 * interactionHeight, interactionWidth, interactionHeight);
    }

    private static void initTowns(SpriteSheet tileSheet) {
        initHouses(tileSheet);

        metalSign = tileSheet.crop(0, 7 * TileHeight);
        woodSign = tileSheet.crop(TileWidth, 7 * TileHeight);
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
        deepWaterOutsideEdgeTopLeft = tileSheet.crop(8 * TileWidth, 12 * TileHeight);
        deepWaterOutsideEdgeTopRight = tileSheet.crop(7 * TileWidth, 12 * TileHeight);
        deepWaterOutsideEdgeBottumLeft = tileSheet.crop(8 * TileWidth, 11 * TileHeight);
        deepWaterOutsideEdgeBottumRight = tileSheet.crop(7 * TileWidth, 11 * TileHeight);

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

    //Player start
    private static void initPlayer() {
        int playerWidth = 20, playerHeight = 25;
        SpriteSheet PlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/PlayerWalking.png"));
        initPlayerStanding(PlayerSheet, playerWidth, playerHeight);
        initPlayerWalking(PlayerSheet, playerWidth, playerHeight);
        initPlayerRunning(new SpriteSheet(ImageLoader.loadImage("/textures/PlayerRunningSprite.png")), playerWidth, playerHeight);
    }

    private static void initPlayerStanding(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {
        playerStillUp = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);
        playerStillDown = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);
        playerStillLeft = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        playerStillRight = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
    }

    private static void initPlayerWalking(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {

        player_walking_up = new BufferedImage[4];
        player_walking_up[0] = PlayerSheet.crop(3 * playerWidth, 0, playerWidth, playerHeight);
        player_walking_up[1] = playerStillUp;
        player_walking_up[2] = PlayerSheet.crop(3 * playerWidth, playerHeight, playerWidth, playerHeight);
        player_walking_up[3] = playerStillUp;

        player_walking_down = new BufferedImage[4];
        player_walking_down[0] = PlayerSheet.crop(3 * playerWidth, 5 * playerHeight, playerWidth, playerHeight);
        player_walking_down[1] = playerStillDown;
        player_walking_down[2] = PlayerSheet.crop(3 * playerWidth, 6 * playerHeight, playerWidth, playerHeight);
        player_walking_down[3] = playerStillDown;

        player_walking_left = new BufferedImage[4];
        player_walking_left[0] = PlayerSheet.crop(0, 3 * playerHeight, playerWidth, playerHeight);
        player_walking_left[1] = playerStillLeft;
        player_walking_left[2] = PlayerSheet.crop(playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_walking_left[3] = playerStillLeft;

        player_walking_right = new BufferedImage[4];
        player_walking_right[0] = PlayerSheet.crop(5 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_walking_right[1] = playerStillRight;
        player_walking_right[2] = PlayerSheet.crop(6 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_walking_right[3] = playerStillRight;
    }

    private static void initPlayerRunning(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {

        player_running_up = new BufferedImage[4];
        player_running_up[0] = PlayerSheet.crop(3 * playerWidth, 0, playerWidth, playerHeight);
        player_running_up[1] = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);
        player_running_up[2] = PlayerSheet.crop(3 * playerWidth, playerHeight, playerWidth, playerHeight);
        player_running_up[3] = player_running_up[1];

        player_running_down = new BufferedImage[4];
        player_running_down[0] = PlayerSheet.crop(3 * playerWidth, 5 * playerHeight, playerWidth, playerHeight);
        player_running_down[1] = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);
        player_running_down[2] = PlayerSheet.crop(3 * playerWidth, 6 * playerHeight, playerWidth, playerHeight);
        player_running_down[3] = player_running_down[1];

        player_running_left = new BufferedImage[4];
        player_running_left[0] = PlayerSheet.crop(0, 3 * playerHeight, playerWidth, playerHeight);
        player_running_left[1] = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running_left[2] = PlayerSheet.crop(playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running_left[3] = player_running_left[1];

        player_running_right = new BufferedImage[4];
        player_running_right[0] = PlayerSheet.crop(6 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running_right[1] = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running_right[2] = PlayerSheet.crop(5 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running_right[3] = player_running_right[1];

    }
    //Player end

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

    private static void initBridge(SpriteSheet tileSheet) {
        bridgeDownLeft = tileSheet.crop(2 * TileWidth, 12 * TileHeight);
        bridgePostLeft = tileSheet.crop(2 * TileWidth, 13 * TileHeight);
        bridgeHandrailLeft = tileSheet.crop(2 * TileWidth, 14 * TileHeight);
        bridgeUpLeft = tileSheet.crop(2 * TileWidth, 15 * TileHeight);

        bridgeStairsDownLeft = tileSheet.crop(3 * TileWidth, 12 * TileHeight);
        bridgePlanksEndLeft = tileSheet.crop(3 * TileWidth, 13 * TileHeight);
        bridgeStairsUpLeft = tileSheet.crop(3 * TileWidth, 15 * TileHeight);

        bridgeStairsDownMid = tileSheet.crop(4 * TileWidth, 12 * TileHeight);
        bridgePlanksMid = tileSheet.crop(4 * TileWidth, 13 * TileHeight);
        bridgeStairsUpMid = tileSheet.crop(4 * TileWidth, 15 * TileHeight);

        bridgeStairsDownRight = tileSheet.crop(5 * TileWidth, 12 * TileHeight);
        bridgePlanksEndRight = tileSheet.crop(5 * TileWidth, 13 * TileHeight);
        bridgeStairsUpRight = tileSheet.crop(5 * TileWidth, 15 * TileHeight);


        bridgeDownRight = tileSheet.crop(6 * TileWidth, 12 * TileHeight);
        bridgePostRight = tileSheet.crop(6 * TileWidth, 13 * TileHeight);
        bridgeHandrailRight = tileSheet.crop(6 * TileWidth, 14 * TileHeight);
        bridgeUpRight = tileSheet.crop(6 * TileWidth, 15 * TileHeight);
    }

}
