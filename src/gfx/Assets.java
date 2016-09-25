package gfx;


import java.awt.image.BufferedImage;

public class Assets {

    private static final int TileWidth = 16, TileHeight = 16;
    private static final int PlayerWidth = 17, playerHeight = 23;
    public static BufferedImage grass, farne, flower, roundBush, hopedgeLeft, hopedgeBottum, hopedgeRight, sign, tree;
    public static BufferedImage bushwallCornerTopLeft, bushwallDown, bushwallEndLeft, bushwallendRight, bushwallEndDown, bushwallEndUp;
    public static BufferedImage fenceTop, fenceLeft, fenceRight, fenceIntersectionLeft, fenceIntersectionRight, fenceCornerTopRight, fenceCornerTopLeft, fenceCornerBottumLeft, fenceCornerBottumRight;
    public static BufferedImage waterEdgeTopLeft, waterEdgeTop, waterEdgeTopRight, waterEdgeLeft, water, waterEdgeRight, waterEdgeBottumLeft, waterEdgeBottum, waterEdgeBottumRight;
    public static BufferedImage pathEndTopLeft, pathEndTopRight, pathLeft, pathRight, pathEndBottumLeft, pathEndBottumRight;
    public static BufferedImage playerStillDown, playerStillUp, playerStillLeft, playerStillRight;
    public static BufferedImage[] player_down, player_up, player_left, player_right;

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

        //fence
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
        waterEdgeBottumLeft = TileSheet.crop(3 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottum = TileSheet.crop(4 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);
        waterEdgeBottumRight = TileSheet.crop(5 * TileWidth, 2 * TileHeight, TileWidth, TileHeight);

        //Path
        pathEndTopLeft = TileSheet.crop(3 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathEndTopRight = TileSheet.crop(4 * TileWidth, 3 * TileHeight, TileWidth, TileHeight);
        pathLeft = TileSheet.crop(3 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathRight = TileSheet.crop(4 * TileWidth, 4 * TileHeight, TileWidth, TileHeight);
        pathEndBottumLeft = TileSheet.crop(3 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);
        pathEndBottumRight = TileSheet.crop(4 * TileWidth, 5 * TileHeight, TileWidth, TileHeight);

        //Player
        // 24 hoch, 17 breit
        playerStillDown = PlayerSheet.crop(68, 33, 18, 24);
        playerStillUp = PlayerSheet.crop(225, 33, 18, 24);
        playerStillLeft = PlayerSheet.crop(293, 192, 18, 24);
        playerStillRight = PlayerSheet.crop(327, 127, 18, 24);


        player_down = new BufferedImage[2];
        player_down[0] = PlayerSheet.crop(68, 64, 17, 24);
        player_down[1] = PlayerSheet.crop(68, 96, 17, 24);

        player_up = new BufferedImage[2];
        player_up[0] = PlayerSheet.crop(68, 0, 17, 24);
        player_up[1] = PlayerSheet.crop(357, 158, 17, 24);

        player_left = new BufferedImage[2];
        player_left[0] = PlayerSheet.crop(293, 158, 17, 24);
        player_left[1] = PlayerSheet.crop(293, 222, 17, 24);

        player_right = new BufferedImage[2];
        player_right[0] = PlayerSheet.crop(326, 158, 17, 24);
        player_right[1] = PlayerSheet.crop(326, 190, 17, 24);
    }

}
