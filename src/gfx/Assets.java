package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    private static final int TileWidth = 16, TileHeight = 16;
    private static final int PlayerWidth = 17, playerHeight = 23;
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, sign, tree, treeShadowLeft, treeShadowRight;
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallendRight, bushwallEndDown, bushwallEndUp;
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;
    public static BufferedImage waterEdgeTopLeft, waterEdgeTop, waterEdgeTopRight, waterEdgeLeft, water, waterEdgeRight, waterEdgeBottumLeft, waterEdgeBottum, waterEdgeBottumRight;
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight;
    public static BufferedImage playerStillDown, playerStillUp, playerStillLeft, playerStillRight;
    public static BufferedImage[] player_down, player_up, player_left, player_right;

    public static void init() {
        SpriteSheet tileSheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));

        //Enviroment
        grass = tileSheet.crop(0, 0, TileWidth, TileHeight);
        farne = tileSheet.crop(0, TileHeight, TileWidth, TileHeight);
        flower = tileSheet.crop(0, 2 * TileHeight, TileWidth, TileHeight);
        roundBush = tileSheet.crop(0, 3 * TileHeight, TileWidth, TileHeight);
        hopedgeLeft = tileSheet.crop(0, 4 * TileHeight, TileWidth, TileHeight);
        hopedgeBottum = tileSheet.crop(0, 5 * TileHeight, TileWidth, TileHeight);
        hopedgeRight = tileSheet.crop(0, 6 * TileHeight, TileWidth, TileHeight);
        sign = tileSheet.crop(0, 7 * TileHeight, TileWidth, TileHeight);
        tree = tileSheet.crop(0, 8 * TileHeight, 2 * TileWidth, 3 * TileHeight);
        treeShadowLeft = tileSheet.crop(0, 11 * TileHeight, TileWidth, TileHeight);
        treeShadowRight = tileSheet.crop(TileWidth, 11 * TileHeight, TileWidth, TileHeight);

        initBushwall(tileSheet);

        initFence(tileSheet);

        initWater(tileSheet);

        initPath(tileSheet);

        initPlayer();

    }

    private static void initPath(SpriteSheet tileSheet) {
        //Path
        pathEndTopLeft = tileSheet.crop(3 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathEndTopRight = tileSheet.crop(4 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathLeft = tileSheet.crop(3 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathRight = tileSheet.crop(4 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathEndBottumLeft = tileSheet.crop(3 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathEndBottumRight = tileSheet.crop(4 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
    }

    private static void initWater(SpriteSheet tileSheet) {
        //Water
        waterEdgeTopLeft = tileSheet.crop(3 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTop = tileSheet.crop(4 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeTopRight = tileSheet.crop(5 * TileWidth, 0, TileWidth, TileHeight);
        waterEdgeLeft = tileSheet.crop(3 * TileWidth, TileHeight, TileWidth, TileHeight);
        water = tileSheet.crop(4 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeRight = tileSheet.crop(5 * TileWidth, TileHeight, TileWidth, TileHeight);
        waterEdgeBottumLeft = tileSheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottum = tileSheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottumRight = tileSheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
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
        bushwallendRight = TileSheet.crop(TileWidth, 3 * TileHeight, TileWidth, TileHeight);
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


}
