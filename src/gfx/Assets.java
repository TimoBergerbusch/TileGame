package gfx;


import java.awt.image.*;

import utils.*;

public class Assets {

    public static final int TileWidth = 16, TileHeight = 16;
    private static final int interactionWidth = 1250, interactionHeight = 250;
    //Enviroment (Town)
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, metalSign, woodSign, tree, treeShadowLeft, treeShadowRight, statue;
    public static BufferedImage pavilionLeft, pavilionMid, pavilionRight, carpet;

    //Buildings
    public static BufferedImage landscapeHouseGreen, landscapeHouseGreenSmall, landscapeHouseRed, landscapeHouseGreySmall, doubleHouseRed, doubleHouseBaige, PKMNMarket, PKMNCenter, bigStore;

    //Indoor
    public static BufferedImage blackTile;
    public static BufferedImage woodPlankWallEndLeftTop, woodPlankWallEndLeftMid, woodPlankWallEndLeftBottom, woodPlankWallMidTop, woodPlankWallMidMid, woodPlankWallMidBottom, woodPlankWallEndRightTop, woodPlankWallEndRightMid, woodPlankWallEndRightBottom;
    public static BufferedImage woodTileWallEndLeftTop, woodTileWallEndLeftMid, woodTileWallEndLeftBottom, woodTileWallMidTop, woodTileWallMidMid, woodTileWallMidBottom, woodTileWallEndRightTop, woodTileWallEndRightMid, woodTileWallEndRightBottom;
    public static BufferedImage stripeWallEndLeftTop, stripeWallEndLeftMid, stripeWallEndLeftBottom, stripeWallMidTop, stripeWallMidMid, stripeWallMidBottom, stripeWallEndRightTop, stripeWallEndRightMid, stripeWallEndRightBottom;
    public static BufferedImage blankWallEndLeftTop, blankWallEndLeftMid, blankWallEndLeftBottom, blankWallMidTop, blankWallMidMid, blankWallMidBottom, blankWallEndRightTop, blankWallEndRightMid, blankWallEndRightBottom;
    public static BufferedImage woodFloorDark, woodFloorLight, woodFloorTopShadow, woodFloorLeftTopShadow, woodFloorTopShadowRightWall, woodFloorLeftShadow, woodFloorRightShadow, woodFloorLeft, woodFloorRight;
    //Deko
    public static BufferedImage[] table, plantWithPot, couch, chair;

    //bushwall
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallEndRight, bushwallEndDown, bushwallEndUp;
    //fence
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;

    public static BufferedImage woodFenceTop, woodFenceLeft, woodFenceRight, woodFenceCornerTopRight, woodFenceCornerTopLeft, woodFenceCornerBottumLeft, woodFenceCornerBottumRight;

    //Water
    public static BufferedImage stillWaterEdgeTopLeft, stillWaterEdgeTop, stillWaterEdgeTopRight, stillWaterEdgeLeft, stillWater, stillWaterEdgeRight, stillWaterEdgeBottomLeft, stillWaterEdgeBottom, stillWaterEdgeBottomRight;
    public static BufferedImage deepWater, deepWaterEdgeTopLeft, deepWaterEdgeTop, deepWaterEdgeTopRight, deepWaterEdgeLeft, deepWaterEdgeRight, deepWaterEdgeBottomLeft, deepWaterEdgeBottom, deepWaterEdgeBottomRight, deepWaterOutsideEdgeTopLeft, deepWaterOutsideEdgeTopRight, deepWaterOutsideEdgeBottomLeft, deepWaterOutsideEdgeBottomRight;

    //Bridge
    public static BufferedImage bridgeUpLeft, bridgeHandrailLeft, bridgePostLeft, bridgeDownLeft, bridgeStairsUpLeft, bridgePlanksEndLeft, bridgeStairsDownLeft, bridgeStairsUpMid, bridgePlanksMid, bridgeStairsDownMid, bridgeStairsUpRight,
            bridgePlanksEndRight, bridgeStairsDownRight, bridgeUpRight, bridgeHandrailRight, bridgePostRight, bridgeDownRight;

    //SimplePath
    public static BufferedImage[] brownStonePath, lightGreyStonePath, darkGreyStonePath, gridPath;
    //ComplexPath
    /**
     * Complex Path with the following pattern: <ul> <li> 0 = Full Tile</li> <li> 1 = TopEdge</li>
     * <li> 2 = Bottom Edge</li> <li> 3 = Left Edge</li> <li> 4 = Right Edge</li> <li> 5 = Top Left
     * Edge</li> <li> 6 = Top Right Edge</li> <li> 7 = Bottom Left Edge</li> <li> 8 = Bottom Right
     * Edge</li> <li> 9 = Outside Top Left</li> <li> 10 = Outside Top Right</li> <li> 11 = Outside
     * Bottom Left</li> <li> 12 = Outside Bottom Right</li> </ul>
     */
    public static BufferedImage[] beachPath, gravelPath, dirtPath, lightGravelPath, darkGrassPath, lightGrassPath, mudPath, pavingPath, sandPath, cavePath;

    //Player
    public static BufferedImage malePlayerStillDown, malePlayerStillUp, malePlayerStillLeft, malePlayerStillRight;
    public static BufferedImage femalePlayerStillDown, femalePlayerStillUp, femalePlayerStillLeft, femalePlayerStillRight;
    public static BufferedImage[] male_player_walking, female_player_walking;
    public static BufferedImage[] male_player_running, female_player_running;
    public static BufferedImage spawn;
    //other Person
    public static BufferedImage[] womanInGreenDress, baldMan, nurse, karateGuy;
    public static BufferedImage[][] grandparent, parkRanger;

    //Interaction Backgrounds
    public static BufferedImage greyBackground, scriptRollBackground, metalSignBackground;

    //Menustate Buttons
    public static BufferedImage[] startButton, worldEditorButton, endButton;

    //WorldControls
    public static BufferedImage[] load, save, zoomIn, zoomOut, newWorld, setSpawn;

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
        carpet = tileSheet.crop(7 * TileWidth, 0, 2 * TileWidth, TileHeight);
        initTowns(tileSheet);

        initBushwall(tileSheet);

        initFence(tileSheet);
        initWoodFence(tileSheet);

        initWater(tileSheet);

        initSimplePath();
        initComplexPath();

        initBridge(tileSheet);

        initPlayer();
        initOtherPersons();

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
        newWorld = new BufferedImage[2];
        newWorld[0] = worldControlsSheet.crop(4 * 35, 4 * height, 70, 35);
        newWorld[1] = worldControlsSheet.crop(4 * 35, 4 * height, 70, 35);
        setSpawn = new BufferedImage[2];
        setSpawn[0] = worldControlsSheet.crop(6 * 35, 4 * height, 70, 35);
        setSpawn[1] = worldControlsSheet.crop(6 * 35, 4 * height, 70, 35);
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

    //MessageBackgroundsStart
    private static void initInteractionBackgrounds() {
        SpriteSheet backgroundSheet = new SpriteSheet(ImageLoader.loadImage("/textures/dialogBackgrounds/backgrounds.png"));

        greyBackground = backgroundSheet.crop(0, 0, interactionWidth, interactionHeight);
        scriptRollBackground = backgroundSheet.crop(0, interactionHeight, interactionWidth, interactionHeight);
        metalSignBackground = backgroundSheet.crop(0, 2 * interactionHeight, interactionWidth, interactionHeight);
    }
    //MessageBackgroundsEnd

    //EnvironmentStart
    private static void initTowns(SpriteSheet tileSheet) {
        initBuildings();
        initIndoors();

        metalSign = tileSheet.crop(0, 7 * TileHeight);
        woodSign = tileSheet.crop(TileWidth, 7 * TileHeight);

        blackTile = tileSheet.crop(8 * TileWidth, TileHeight);
    }

    private static void initBuildings() {
        SpriteSheet buildings = new SpriteSheet(ImageLoader.loadImage("/textures/Buildings.png"));
        landscapeHouseGreen = buildings.crop(0, 0, 5 * TileWidth, 5 * TileHeight);
        landscapeHouseRed = buildings.crop(5 * TileWidth, 0, 5 * TileWidth, 5 * TileHeight);
        landscapeHouseGreenSmall = buildings.crop(10 * TileWidth, 0, 5 * TileWidth, 4 * TileHeight);
        landscapeHouseGreySmall = buildings.crop(15 * TileWidth, 0, 5 * TileWidth, 4 * TileHeight);
        doubleHouseRed = buildings.crop(0, 5 * TileHeight, 5 * TileWidth, 5 * TileHeight);
        doubleHouseBaige = buildings.crop(5 * TileWidth, 5 * TileHeight, 5 * TileWidth, 5 * TileHeight);
        PKMNMarket = buildings.crop(10 * TileWidth, 6 * TileHeight, 4 * TileWidth, 4 * TileHeight);
        PKMNMarket = buildings.crop(15 * TileWidth, 5 * TileHeight, 5 * TileWidth, 5 * TileHeight);
        bigStore = buildings.crop(0, 10 * TileHeight, 5 * TileWidth, 6 * TileHeight);
    }

    private static void initIndoors() {
        SpriteSheet indoorSheet = new SpriteSheet(ImageLoader.loadImage("/textures/IndoorSheet.png"));

        //WoodPlank
        woodPlankWallEndLeftTop = indoorSheet.crop(0, 0);
        woodPlankWallEndLeftMid = indoorSheet.crop(0, TileHeight);
        woodPlankWallEndLeftBottom = indoorSheet.crop(0, 2 * TileHeight);

        woodPlankWallMidTop = indoorSheet.crop(TileWidth, 0);
        woodPlankWallMidMid = indoorSheet.crop(TileWidth, TileHeight);
        woodPlankWallMidBottom = indoorSheet.crop(TileWidth, 2 * TileHeight);

        woodPlankWallEndRightTop = indoorSheet.crop(2 * TileWidth, 0);
        woodPlankWallEndRightMid = indoorSheet.crop(2 * TileWidth, TileHeight);
        woodPlankWallEndRightBottom = indoorSheet.crop(2 * TileWidth, 2 * TileHeight);

        //woodTile
        woodTileWallEndLeftTop = indoorSheet.crop(3 * TileWidth, 0);
        woodTileWallEndLeftMid = indoorSheet.crop(3 * TileWidth, TileHeight);
        woodTileWallEndLeftBottom = indoorSheet.crop(3 * TileWidth, 2 * TileHeight);

        woodTileWallMidTop = indoorSheet.crop(4 * TileWidth, 0);
        woodTileWallMidMid = indoorSheet.crop(4 * TileWidth, TileHeight);
        woodTileWallMidBottom = indoorSheet.crop(4 * TileWidth, 2 * TileHeight);

        woodTileWallEndRightTop = indoorSheet.crop(5 * TileWidth, 0);
        woodTileWallEndRightMid = indoorSheet.crop(5 * TileWidth, TileHeight);
        woodTileWallEndRightBottom = indoorSheet.crop(5 * TileWidth, 2 * TileHeight);

        //Stripewall
        stripeWallEndLeftTop = indoorSheet.crop(6 * TileWidth, 0);
        stripeWallEndLeftMid = indoorSheet.crop(6 * TileWidth, TileHeight);
        stripeWallEndLeftBottom = indoorSheet.crop(6 * TileWidth, 2 * TileHeight);

        stripeWallMidTop = indoorSheet.crop(7 * TileWidth, 0);
        stripeWallMidMid = indoorSheet.crop(7 * TileWidth, TileHeight);
        stripeWallMidBottom = indoorSheet.crop(7 * TileWidth, 2 * TileHeight);

        stripeWallEndRightTop = indoorSheet.crop(8 * TileWidth, 0);
        stripeWallEndRightMid = indoorSheet.crop(8 * TileWidth, TileHeight);
        stripeWallEndRightBottom = indoorSheet.crop(8 * TileWidth, 2 * TileHeight);

        //Blankwall
        blankWallEndLeftTop = indoorSheet.crop(9 * TileWidth, 0);
        blankWallEndLeftMid = indoorSheet.crop(9 * TileWidth, TileHeight);
        blankWallEndLeftBottom = indoorSheet.crop(9 * TileWidth, 2 * TileHeight);

        blankWallMidTop = indoorSheet.crop(10 * TileWidth, 0);
        blankWallMidMid = indoorSheet.crop(10 * TileWidth, TileHeight);
        blankWallMidBottom = indoorSheet.crop(10 * TileWidth, 2 * TileHeight);

        blankWallEndRightTop = indoorSheet.crop(11 * TileWidth, 0);
        blankWallEndRightMid = indoorSheet.crop(11 * TileWidth, TileHeight);
        blankWallEndRightBottom = indoorSheet.crop(11 * TileWidth, 2 * TileHeight);

        //Floor
        woodFloorLeft = indoorSheet.crop(0, 3 * TileHeight);
        woodFloorLight = indoorSheet.crop(TileWidth, 3 * TileHeight);
        woodFloorRight = indoorSheet.crop(2 * TileWidth, 3 * TileHeight);
        woodFloorDark = indoorSheet.crop(4 * TileWidth, 3 * TileHeight);
        woodFloorTopShadow = indoorSheet.crop(7 * TileWidth, 3 * TileHeight);
        woodFloorLeftTopShadow = indoorSheet.crop(10 * TileWidth, 3 * TileHeight);
        woodFloorLeftShadow = indoorSheet.crop(3 * TileWidth, 3 * TileHeight);
        woodFloorRightShadow = indoorSheet.crop(5 * TileWidth, 3 * TileHeight);
        woodFloorTopShadowRightWall = indoorSheet.crop(8 * TileWidth, 3 * TileHeight);

        initDeko(indoorSheet);
    }

    private static void initDeko(SpriteSheet indoorSheet) {
        table = new BufferedImage[5];
        table[0] = indoorSheet.crop(0, 11 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        table[1] = indoorSheet.crop(2 * TileWidth, 11 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        table[2] = indoorSheet.crop(4 * TileWidth, 11 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        table[3] = indoorSheet.crop(6 * TileWidth, 11 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        table[4] = indoorSheet.crop(8 * TileWidth, 11 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        couch = new BufferedImage[3];
        couch[0] = indoorSheet.crop(4 * TileWidth, 14 * TileHeight, 3 * TileWidth, 2 * TileHeight);
        couch[1] = indoorSheet.crop(7 * TileWidth, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        couch[2] = indoorSheet.crop(9 * TileWidth, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        chair = new BufferedImage[4];
        chair[1] = indoorSheet.crop(3 * TileHeight, 14 * TileHeight, TileWidth, 2 * TileHeight);
        chair[0] = indoorSheet.crop(2 * TileHeight, 14 * TileHeight, TileWidth, 2 * TileHeight);
        chair[2] = indoorSheet.crop(TileHeight, 14 * TileHeight, TileWidth, 2 * TileHeight);
        chair[3] = indoorSheet.crop(0, 14 * TileHeight, TileWidth, 2 * TileHeight);
        plantWithPot = new BufferedImage[2];
        plantWithPot[1] = indoorSheet.crop(7 * TileWidth, 14 * TileHeight, TileWidth, 2 * TileHeight);
        plantWithPot[0] = indoorSheet.crop(8 * TileWidth, 14 * TileHeight, TileWidth, 2 * TileHeight);
    }
    //EnivornmentEnd

    //pathes

    /**
     * Returns a complex Path with the following pattern: <ul> <li> 0 = Full Tile</li> <li> 1 =
     * TopEdge</li> <li> 2 = Bottom Edge</li> <li> 3 = Left Edge</li> <li> 4 = Right Edge</li> <li>
     * 5 = Top Left Edge</li> <li> 6 = Top Right Edge</li> <li> 7 = Bottom Left Edge</li> <li> 8 =
     * Bottom Right Edge</li> <li> 9 = Outside Top Left</li> <li> 10 = Outside Top Right</li> <li>
     * 11 = Outside Bottom Left</li> <li> 12 = Outside Bottom Right</li> </ul>
     */
    private static BufferedImage[] initComplexPath(SpriteSheet tileSheet, int x, int y) {
        BufferedImage[] complexPath = new BufferedImage[13];
        int xOffset = 4 * x * TileWidth, yOffset = 3 * y * TileHeight;
        complexPath[0] = tileSheet.crop(x * TileWidth, y * TileHeight);
        complexPath[1] = tileSheet.crop(xOffset + 2 * TileWidth, yOffset);
        complexPath[2] = tileSheet.crop(xOffset + 3 * TileWidth, yOffset);
        complexPath[3] = tileSheet.crop(xOffset, yOffset);
        complexPath[4] = tileSheet.crop(xOffset + TileWidth, yOffset);
        complexPath[5] = tileSheet.crop(xOffset + 2 * TileWidth, yOffset + TileHeight);
        complexPath[6] = tileSheet.crop(xOffset + 3 * TileWidth, yOffset + TileHeight);
        complexPath[7] = tileSheet.crop(xOffset, yOffset + TileHeight);
        complexPath[8] = tileSheet.crop(xOffset + TileWidth, yOffset + TileHeight);
        complexPath[9] = tileSheet.crop(xOffset, yOffset + 2 * TileHeight);
        complexPath[10] = tileSheet.crop(xOffset + TileWidth, yOffset + 2 * TileHeight);
        complexPath[11] = tileSheet.crop(xOffset + 2 * TileWidth, yOffset + 2 * TileHeight);
        complexPath[12] = tileSheet.crop(xOffset + 3 * TileWidth, yOffset + 2 * TileHeight);

        return complexPath;
    }

    private static void initComplexPath() {
        SpriteSheet complexPathSheet = new SpriteSheet(ImageLoader.loadImage("/textures/pathes/Pathes.png"));
        gravelPath = initComplexPath(complexPathSheet, 1, 0);
        beachPath = initComplexPath(complexPathSheet, 2, 0);
        dirtPath = initComplexPath(complexPathSheet, 3, 0);
        lightGravelPath = initComplexPath(complexPathSheet, 0, 1);
        darkGrassPath = initComplexPath(complexPathSheet, 1, 1);
        lightGrassPath = initComplexPath(complexPathSheet, 2, 1);
        mudPath = initComplexPath(complexPathSheet, 3, 1);
        pavingPath = initComplexPath(complexPathSheet, 0, 2);
        sandPath = initComplexPath(complexPathSheet, 1, 2);
        cavePath = initComplexPath(complexPathSheet, 2, 2);
    }

    private static void initSimplePath() {
        SpriteSheet simplePathSheet = new SpriteSheet(ImageLoader.loadImage("/textures/pathes/SimplePathes.png"));
        //Path
        brownStonePath = initSimplePath(simplePathSheet, 1, 0);
        lightGreyStonePath = initSimplePath(simplePathSheet, 0, 1);
        darkGreyStonePath = initSimplePath(simplePathSheet, 1, 1);
        gridPath = initSimplePath(simplePathSheet, 2, 0);
    }

    /**
     * Returns a simple Path with the following pattern: <ul> <li> 0 = Full Tile</li> <li> 1 = Top
     * Edge</li> <li> 2 = Bottom Edge</li> <li> 3 = Left Edge</li> <li> 4 = Right Edge</li> <li> 5 =
     * Top Left Edge</li> <li> 6 = Top Right Edge</li> <li> 7 = Bottom Left Edge</li> <li> 8 =
     * Bottom Right Edge</li> </ul>
     *
     * @param tileSheet the {@link SpriteSheet} containing the path
     * @param x         the xOffset
     * @param y         the yOffset
     * @return an Array with the described scheme
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
    //PathesEnd

    //Water
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
    //WaterEnd

    //PlayerStart
    private static void initPlayer() {
        int playerWidth = 20, playerHeight = 25;
        SpriteSheet MalePlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/people/player/PlayerMaleWalking.png"));
        male_player_walking = initPlayerAnimation(MalePlayerSheet, playerWidth, playerHeight);
        male_player_running = initPlayerAnimation(new SpriteSheet(ImageLoader.loadImage("/textures/people/player/PlayerMaleRunning.png")), playerWidth, playerHeight);
        initMalePlayerStanding(MalePlayerSheet, playerWidth, playerHeight);
        spawn = MalePlayerSheet.crop(62, 79);

        SpriteSheet FemalePlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/people/player/PlayerFemaleWalking.png"));
        female_player_walking = initPlayerAnimation(FemalePlayerSheet, playerWidth, playerHeight);
        female_player_running = initPlayerAnimation(new SpriteSheet(ImageLoader.loadImage("/textures/people/player/PlayerFemaleRunning.png")), playerWidth, playerHeight);
        initFemalePlayerStanding(FemalePlayerSheet, playerWidth, playerHeight);
    }

    private static void initMalePlayerStanding(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {
        malePlayerStillUp = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);
        malePlayerStillDown = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);
        malePlayerStillLeft = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        malePlayerStillRight = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
    }

    private static void initFemalePlayerStanding(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {
        femalePlayerStillUp = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);
        femalePlayerStillDown = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);
        femalePlayerStillLeft = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        femalePlayerStillRight = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
    }

    private static BufferedImage[] initPlayerAnimation(SpriteSheet PlayerSheet, int playerWidth, int playerHeight) {
        BufferedImage[] player_running = new BufferedImage[16];
        player_running[0] = PlayerSheet.crop(3 * playerWidth, 0, playerWidth, playerHeight);
        player_running[1] = PlayerSheet.crop(3 * playerWidth, 2 * playerHeight, playerWidth, playerHeight);
        player_running[2] = PlayerSheet.crop(3 * playerWidth, playerHeight, playerWidth, playerHeight);
        player_running[3] = player_running[1];

        player_running[4 + 0] = PlayerSheet.crop(3 * playerWidth, 5 * playerHeight, playerWidth, playerHeight);
        player_running[4 + 1] = PlayerSheet.crop(3 * playerWidth, 4 * playerHeight, playerWidth, playerHeight);
        player_running[4 + 2] = PlayerSheet.crop(3 * playerWidth, 6 * playerHeight, playerWidth, playerHeight);
        player_running[4 + 3] = player_running[4 + 1];

        player_running[2 * 4 + 0] = PlayerSheet.crop(0, 3 * playerHeight, playerWidth, playerHeight);
        player_running[2 * 4 + 1] = PlayerSheet.crop(2 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running[2 * 4 + 2] = PlayerSheet.crop(playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running[2 * 4 + 3] = player_running[2 * 4 + 1];

        player_running[3 * 4 + 0] = PlayerSheet.crop(6 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running[3 * 4 + 1] = PlayerSheet.crop(4 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running[3 * 4 + 2] = PlayerSheet.crop(5 * playerWidth, 3 * playerHeight, playerWidth, playerHeight);
        player_running[3 * 4 + 3] = player_running[3 * 4 + 1];

        return player_running;

    }
    //PlayerEnd


    //OtherPeople
    private static void initOtherPersons() {
        SpriteSheet adultPersonSheet = new SpriteSheet(ImageLoader.loadImage("/textures/people/adults.png"));
        womanInGreenDress = initOtherPerson(adultPersonSheet, 0, 2);
        baldMan = initOtherPerson(adultPersonSheet, 0, 3);
        parkRanger = new BufferedImage[2][12];
        parkRanger[0] = initOtherPerson(adultPersonSheet, 0, 4);
        parkRanger[1] = initOtherPerson(adultPersonSheet, 0, 5);
        grandparent = new BufferedImage[2][12];
        grandparent[0] = initOtherPerson(adultPersonSheet, 0, 0);
        grandparent[1] = initOtherPerson(adultPersonSheet, 0, 1);
        nurse = initOtherPerson(adultPersonSheet, 0, 6);
        karateGuy = initOtherPerson(adultPersonSheet, 0, 7);
    }

    /**
     * Returns an Array of BufferedImages containing a person in the following pattern: <ul> <li> 0
     * = standing facing down</li> <li> 1 = standing facing up</li> <li> 2 = standing facing
     * left</li> <li> 3 = standing facing right</li> <li> 4 = walking down {@link Animation} part
     * 1</li> <li> 5 = walking down {@link Animation} part 2</li> <li> 6 = walking up {@link
     * Animation} part 1</li> <li> 7 = walking up {@link Animation} part 2</li> <li> 8 = walking
     * left {@link Animation} part 1</li> <li> 9 = walking left {@link Animation} part 2</li> <li>
     * 10 =walking right {@link Animation} part 1</li> <li> 11 = walking right {@link Animation}
     * part 2</li> </ul>
     *
     * @param peopleSheet the {@link SpriteSheet} containing the path
     * @param x           the xOffset
     * @param y           the yOffset
     * @return an Array with the described scheme
     */
    private static BufferedImage[] initOtherPerson(SpriteSheet peopleSheet, int x, int y) {
        int width = 16, height = 21;
        int xOffset = x * width, yOffset = y * height;

        BufferedImage[] images = new BufferedImage[12];
        images[0] = peopleSheet.crop(xOffset, yOffset, width, height);
        images[1] = peopleSheet.crop(xOffset + width, yOffset, width, height);
        images[2] = peopleSheet.crop(xOffset + 2 * width, yOffset, width, height);
        images[3] = Utils.flipImage(images[2]);
        images[4] = peopleSheet.crop(xOffset + 3 * width, yOffset, width, height);
        images[5] = Utils.flipImage(images[4]);
        images[6] = peopleSheet.crop(xOffset + 4 * width, yOffset, width, height);
        images[7] = Utils.flipImage(images[6]);
        images[8] = peopleSheet.crop(xOffset + 5 * width, yOffset, width, height);
        images[9] = peopleSheet.crop(xOffset + 6 * width, yOffset, width, height);
        images[10] = Utils.flipImage(images[8]);
        images[11] = Utils.flipImage(images[9]);

        return images;
    }
    //OtherPeopleEnd

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
