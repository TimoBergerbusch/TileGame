package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    public static final int TileWidth = 16, TileHeight = 16;
    private static final int interactionWidth = 1250, interactionHeight = 250;
    //Enviroment (Town)
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, metalSign, woodSign, tree, treeShadowLeft, treeShadowRight, statue;
    public static BufferedImage pavilionLeft, pavilionMid, pavilionRight;
    public static BufferedImage greenHouse, redHouse;
    //bushwall
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallEndRight, bushwallEndDown, bushwallEndUp;
    //fence
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;

    public static BufferedImage woodFenceTop, woodFenceLeft, woodFenceRight, woodFenceCornerTopRight, woodFenceCornerTopLeft, woodFenceCornerBottumLeft, woodFenceCornerBottumRight;

    //Water
    public static BufferedImage stillWaterEdgeTopLeft, stillWaterEdgeTop, stillWaterEdgeTopRight, stillWaterEdgeLeft, stillWater, stillWaterEdgeRight, stillWaterEdgeBottomLeft, stillWaterEdgeBottom, stillWaterEdgeBottomRight;
    public static BufferedImage deepWater, deepWaterEdgeTopLeft, deepWaterEdgeTop, deepWaterEdgeTopRight, deepWaterEdgeLeft, deepWaterEdgeRight, deepWaterEdgeBottomLeft, deepWaterEdgeBottom, deepWaterEdgeBottomRight, deepWaterOutsideEdgeTopLeft, deepWaterOutsideEdgeTopRight, deepWaterOutsideEdgeBottomLeft, deepWaterOutsideEdgeBottomRight;
    public static BufferedImage beach, beachEdgeTop, beachEdgeBottom, beachEdgeLeft, beachEdgeRight, beachEdgeTopLeft, beachEdgeTopRight, beachEdgeBottomLeft, beachEdgeBottomRight, beachOutsideTopLeftEdge, beachOutsideTopRightEdge, beachOutsideBottomLeftEdge, beachOutsideBottomRightEdge;

    //Bridge
    public static BufferedImage bridgeUpLeft, bridgeHandrailLeft, bridgePostLeft, bridgeDownLeft, bridgeStairsUpLeft, bridgePlanksEndLeft, bridgeStairsDownLeft, bridgeStairsUpMid, bridgePlanksMid, bridgeStairsDownMid, bridgeStairsUpRight,
            bridgePlanksEndRight, bridgeStairsDownRight, bridgeUpRight, bridgeHandrailRight, bridgePostRight, bridgeDownRight;

    //SimplePath
    public static BufferedImage[] brownStonePath, lightGreyStonePath, darkGreyStonePath, gridPath;

    //Player
    public static BufferedImage playerStillDown, playerStillUp, playerStillLeft, playerStillRight;
    public static BufferedImage[] player_walking_down, player_walking_up, player_walking_left, player_walking_right;
    public static BufferedImage[] player_running_down, player_running_up, player_running_left, player_running_right;
    public static BufferedImage spawn;

    //Interaction Backgrounds
    public static BufferedImage greyBackground, scriptRollBackground, metalSignBackground;

    //Menustate Buttons
    public static BufferedImage[] startButton, worldEditorButton, endButton;

    //WorldControls
    public static BufferedImage[] load, save, zoomIn, zoomOut;

    public static void init() {
        initMenuStateButtons();

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

        pavilionLeft = tileSheet.crop(7 * TileWidth, 8 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionMid = tileSheet.crop(8 * TileWidth, 8 * TileHeight, TileWidth, 3 * TileHeight);
        pavilionRight = tileSheet.crop(9 * TileWidth, 8 * TileHeight, TileWidth, 3 * TileHeight);

        initTowns(tileSheet);

        initBushwall(tileSheet);

        initFence(tileSheet);
        initWoodFence(tileSheet);

        initWater(tileSheet);

        initSimplePath();

        initBridge(tileSheet);

        initPlayer();

        initInteractionBackgrounds();

        initWorldControls();
    }

    private static void initWorldControls() {
        int width = 512, height = 35;
        SpriteSheet worldControlsSheet = new SpriteSheet(ImageLoader.loadImage("/textures/WorldControls.png"));
        load = new BufferedImage[2];
        load[0] = worldControlsSheet.crop(0, 0, width, height);
        load[1] = worldControlsSheet.crop(0, height, width, height);
        save = new BufferedImage[2];
        save[0] = worldControlsSheet.crop(0, 2 * height, width, height);
        save[1] = worldControlsSheet.crop(0, 3 * height, width, height);
        zoomIn = new BufferedImage[2];
        zoomIn[0] = worldControlsSheet.crop(0, 4 * height, 35, height);
        zoomIn[1] = worldControlsSheet.crop(35, 4 * height, 35, height);
        zoomOut = new BufferedImage[2];
        zoomOut[0] = worldControlsSheet.crop(2 * 35, 4 * height, 35, 35);
        zoomOut[1] = worldControlsSheet.crop(3 * 35, 4 * height, 35, 35);
    }

    private static void initMenuStateButtons() {
        SpriteSheet menuSheet = new SpriteSheet(ImageLoader.loadImage("/textures/MenustateButtons.png"));
        int buttonWidth = 750, buttonHeigth = 52;

        startButton = new BufferedImage[2];
        startButton[0] = menuSheet.crop(0, 0, buttonWidth, buttonHeigth);
        startButton[1] = menuSheet.crop(0, buttonHeigth, buttonWidth, buttonHeigth);

        worldEditorButton = new BufferedImage[2];
        worldEditorButton[0] = menuSheet.crop(0, 2 * buttonHeigth, buttonWidth, buttonHeigth);
        worldEditorButton[1] = menuSheet.crop(0, 3 * buttonHeigth, buttonWidth, buttonHeigth);

        endButton = new BufferedImage[2];
        endButton[0] = menuSheet.crop(0, 4 * buttonHeigth, buttonWidth, buttonHeigth);
        endButton[1] = menuSheet.crop(0, 5 * buttonHeigth, buttonWidth, buttonHeigth);

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

    /**
     * Returns a simple Path with the following pattern: <ul> <li> 0 = Full Tile</li> <li> 1 = Top
     * Edge</li> <li> 2 = Bottom Edge</li> <li> 3 = Left Edge</li> <li> 4 = Right Edge</li> <li> 5 =
     * Top Left Edge</li> <li> 6 = Top Right Edge</li> <li> 7 = Bottom Left Edge</li> <li> 8 =
     * Bottom Right Edge</li> </ul>
     */
    private static BufferedImage[] initSimplePath(SpriteSheet tileSheet, int x, int y) {
        BufferedImage[] simplePath = new BufferedImage[9];
        int xOffset = 4 * x * TileWidth, yOffset = 2 * y * TileHeight;
        simplePath[0] = tileSheet.crop(x * TileWidth, y * TileHeight);
        simplePath[1] = tileSheet.crop(xOffset + 2 * TileWidth, yOffset);
        simplePath[2] = tileSheet.crop(xOffset + 3 * TileWidth, yOffset);
        simplePath[3] = tileSheet.crop(xOffset, yOffset);
        simplePath[4] = tileSheet.crop(xOffset + TileWidth, yOffset);
        simplePath[5] = tileSheet.crop(xOffset + 2 * TileWidth, yOffset + TileHeight);
        simplePath[6] = tileSheet.crop(xOffset + 3 * TileWidth, yOffset + TileHeight);
        simplePath[7] = tileSheet.crop(xOffset, yOffset + TileHeight);
        simplePath[8] = tileSheet.crop(xOffset + TileWidth, yOffset + TileHeight);
        return simplePath;
    }

    private static void initSimplePath() {
        SpriteSheet simplePathSheet = new SpriteSheet(ImageLoader.loadImage("/textures/Pathes/SimplePathes.png"));
        //Path
        brownStonePath = initSimplePath(simplePathSheet, 1, 0);
        lightGreyStonePath = initSimplePath(simplePathSheet, 0, 1);
        darkGreyStonePath = initSimplePath(simplePathSheet, 1, 1);
        gridPath = initSimplePath(simplePathSheet, 2, 0);
    }

    private static void initWater(SpriteSheet tileSheet) {
        initStillWater(tileSheet);
        initDeepWater(tileSheet);
        initBeach(tileSheet);
    }

    private static void initDeepWater(SpriteSheet tileSheet) {
        deepWaterEdgeTopLeft = tileSheet.crop(3 * TileWidth, 6 * TileHeight);
        deepWaterEdgeTop = tileSheet.crop(4 * TileWidth, 6 * TileHeight);
        deepWaterEdgeTopRight = tileSheet.crop(5 * TileWidth, 6 * TileHeight);
        deepWaterEdgeLeft = tileSheet.crop(3 * TileWidth, 7 * TileHeight);
        deepWater = tileSheet.crop(4 * TileWidth, 7 * TileHeight);
        deepWaterEdgeRight = tileSheet.crop(5 * TileWidth, 7 * TileHeight);
        deepWaterEdgeBottomLeft = tileSheet.crop(3 * TileWidth, 8 * TileHeight);
        deepWaterEdgeBottom = tileSheet.crop(4 * TileWidth, 8 * TileHeight);
        deepWaterEdgeBottomRight = tileSheet.crop(5 * TileWidth, 8 * TileHeight);
        deepWaterOutsideEdgeTopLeft = tileSheet.crop(8 * TileWidth, 12 * TileHeight);
        deepWaterOutsideEdgeTopRight = tileSheet.crop(7 * TileWidth, 12 * TileHeight);
        deepWaterOutsideEdgeBottomLeft = tileSheet.crop(8 * TileWidth, 11 * TileHeight);
        deepWaterOutsideEdgeBottomRight = tileSheet.crop(7 * TileWidth, 11 * TileHeight);
//        deepWaterTiles = new BufferedImage[4];
//        deepWaterTiles[0] = tileSheet.crop(2 * TileWidth, 11 * TileHeight);
//        deepWaterTiles[1] = tileSheet.crop(3 * TileWidth, 11 * TileHeight);
//        deepWaterTiles[2] = tileSheet.crop(4 * TileWidth, 11 * TileHeight);
//        deepWaterTiles[3] = tileSheet.crop(5 * TileWidth, 11 * TileHeight);

    }

    private static void initStillWater(SpriteSheet tileSheet) {
        //stillWater
        stillWaterEdgeTopLeft = tileSheet.crop(3 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeTop = tileSheet.crop(4 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeTopRight = tileSheet.crop(5 * TileWidth, 0, TileWidth, TileHeight);
        stillWaterEdgeLeft = tileSheet.crop(3 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWater = tileSheet.crop(4 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWaterEdgeRight = tileSheet.crop(5 * TileWidth, TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottomLeft = tileSheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottom = tileSheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        stillWaterEdgeBottomRight = tileSheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
    }

    private static void initBeach(SpriteSheet tileSheet) {
        beachEdgeLeft = tileSheet.crop(7 * TileWidth, 5 * TileHeight);
        beachEdgeRight = tileSheet.crop(8 * TileWidth, 5 * TileHeight);
        beachEdgeTop = tileSheet.crop(9 * TileWidth, 5 * TileHeight);
        beachEdgeBottom = tileSheet.crop(10 * TileWidth, 5 * TileHeight);
        beach = tileSheet.crop(11 * TileWidth, 5 * TileHeight);

        beachEdgeBottomLeft = tileSheet.crop(7 * TileWidth, 6 * TileHeight);
        beachEdgeBottomRight = tileSheet.crop(8 * TileWidth, 6 * TileHeight);
        beachEdgeTopLeft = tileSheet.crop(9 * TileWidth, 6 * TileHeight);
        beachEdgeTopRight = tileSheet.crop(10 * TileWidth, 6 * TileHeight);

        beachOutsideBottomRightEdge = tileSheet.crop(7 * TileWidth, 7 * TileHeight);
        beachOutsideBottomLeftEdge = tileSheet.crop(8 * TileWidth, 7 * TileHeight);
        beachOutsideTopRightEdge = tileSheet.crop(9 * TileWidth, 7 * TileHeight);
        beachOutsideTopLeftEdge = tileSheet.crop(10 * TileWidth, 7 * TileHeight);

    }

    //Player start
    private static void initPlayer() {
        int playerWidth = 20, playerHeight = 25;
        SpriteSheet PlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/PlayerWalking.png"));
        spawn = PlayerSheet.crop(68, 85, 4, 4);
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
