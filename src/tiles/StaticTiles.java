package tiles;

import java.util.*;

import tiles.Bushwalls.*;
import tiles.fence.fence.*;
import tiles.fence.woodFence.*;
import tiles.pathes.complexPath.beachPath.*;
import tiles.pathes.complexPath.darkGrassPath.*;
import tiles.pathes.complexPath.dirtPath.*;
import tiles.pathes.complexPath.gravelPath.*;
import tiles.pathes.complexPath.lightGrassPath.*;
import tiles.pathes.complexPath.lightGravelPath.*;
import tiles.pathes.complexPath.mudPath.*;
import tiles.pathes.complexPath.pavingPath.*;
import tiles.pathes.complexPath.sandPath.*;
import tiles.pathes.simplePath.brownStonePath.*;
import tiles.pathes.simplePath.darkGreyStonePath.*;
import tiles.pathes.simplePath.gridPath.*;
import tiles.pathes.simplePath.lightGreyStonePath.*;
import tiles.water.deepWater.*;
import tiles.water.stillWater.*;


public class StaticTiles {

    public static Tile[] tiles = new Tile[2500];
    public static Tile grassTile = new GrassTile(0, "Grass");
    public static Tile roundBushTile = new RoundBushTile(1, "Round Bush");
    public static Tile farnTile = new FarneTile(2, "Farne");
    public static Tile metalSignTile = new MetalSignTile(3, "Metal Sign");
    public static Tile treeShadowLeftTile = new TreeShadowLeftTile(4, "Left Treeshadow");
    public static Tile treeShadowRightTile = new TreeShadowRightTile(5, "Right Treeshadow");

    //fence
    public static Tile fenceTopTile = new FenceTopTile(10, "Top fence");
    public static Tile fenceLeftTile = new FenceLeftTile(11, " Left fence");
    public static Tile fenceRightTile = new FenceRightTile(12, "Right fence");
    public static Tile fenceCornerTopLeftTile = new FenceCornerTopLeftTile(13, "Top Left fence Corner");
    public static Tile fenceCornerTopRightTile = new FenceCornerTopRightTile(14, "Top Right fence Corner");
    public static Tile fenceCornerBottomLeftTile = new FenceCornerBottomLeftTile(15, "Bottom Left fence Corner");
    public static Tile fenceCornerBottomRightTile = new FenceCornerBottomRightTile(16, "Bottom Right fence Corner");
    public static Tile fenceIntersectionLeftTile = new FenceIntersectionLeftTile(17, "Left fence Intersection ");
    public static Tile fenceIntersectionRightTile = new FenceIntersectionRightTile(18, "Right fence Intersection");

    //Bushwalls
    public static Tile bushwallSideTile = new BushwallSideTile(20, "Side Bushwall");
    public static Tile bushwallDownTile = new BushwallDownTile(21, "Bushwall Down");
    public static Tile bushwallCornerTopLeftTile = new BushwallCornerTopLeftTile(22, "Top Left Bushwall Corner");
    public static Tile bushwallCornerTopRightTile = new BushwallCornerTopRightTile(23, "Top Right Bushwall Corner");
    public static Tile bushwallCornerBottomLeftTile = new BushwallCornerBottomLeftTile(24, "Bottom Left Bushwall Corner");
    public static Tile bushwallCornerBottomRightTile = new BushwallCornerBottomRightTile(25, "Bottom Right Bushwall Corner");
    public static Tile bushwallEndUpTile = new BushwallEndUpTile(26, "Top Bushwall End");
    public static Tile bushwallEndDownTile = new BushwallEndDownTile(27, "Bottom Bushwall End");
    public static Tile bushwallEndLeftTile = new BushwallEndLeftTile(28, "Left Bushwall End");
    public static Tile bushwallEndRightTile = new BushwallEndRightTile(29, "Right Bushwall End");

    //StillWater
    public static Tile stillWaterTile = new StillWaterTile(30, "Still Water");
    public static Tile stillWaterEdgeTopTile = new StillWaterEdgeTopTile(31, "Still Water Top Edge");
    public static Tile stillWaterEdgeBottomTile = new StillWaterEdgeBottomTile(32, "Still Water Bottom Edge");
    public static Tile stillWaterEdgeLeftTile = new StillWaterEdgeLeftTile(33, "Still Water Left Edge");
    public static Tile stillWaterEdgeRightTile = new StillWaterEdgeRightTile(34, "Still Water Right Edge");
    public static Tile stillWaterEdgeTopLeftTile = new StillWaterEdgeTopLeftTile(35, "Still Water Top Left Edge");
    public static Tile stillWaterEdgeTopRightTile = new StillWaterEdgeTopRightTile(36, "Still Water Top Right Edge");
    public static Tile stillWaterEdgeBottomLeftTile = new StillWaterEdgeBottomLeftTile(37, "Still Water Bottom Left Edge");
    public static Tile stillWaterEdgeBottomRightTile = new StillWaterEdgeBottomRightTile(38, "Still Water Bottom Right Edge");

    //DeepWaterTile
    public static Tile deepWaterTile = new DeepWaterTile(40, "Deep Water Tile");
    public static Tile deepWaterEdgeTopTile = new DeepWaterEdgeTopTile(41, "Deep Water Top Edge");
    public static Tile deepWaterEdgeBottomTile = new DeepWaterEdgeBottomTile(42, "Deep Water Bottom Edge");
    public static Tile deepWaterEdgeLeftTile = new DeepWaterEdgeLeftTile(43, "Deep Water Left Edge");
    public static Tile deepWaterEdgeRightTile = new DeepWaterEdgeRightTile(44, "Deep Water Right Edge");
    public static Tile deepWaterEdgeTopLeftTile = new DeepWaterEdgeTopLeftTile(45, "Deep Water Top Left Edge");
    public static Tile deepWaterEdgeTopRightTile = new DeepWaterEdgeTopRightTile(46, "Deep Water Top Right Edge");
    public static Tile deepWaterEdgeBottomLeftTile = new DeepWaterEdgeBottomLeftTile(47, "Deep Water Bottom Left Edge");
    public static Tile deepWaterEdgeBottomRightTile = new DeepWaterEdgeBottomRightTile(48, "Deep Water Bottom Right Edge");
    public static Tile deepWaterOutsideEdgeTopLeftTile = new DeepWaterOutsideEdgeTopLeftTile(49, "Deep Water Top Left Outside Edge");
    public static Tile deepWaterOutsideEdgeTopRightTile = new DeepWaterOutsideEdgeTopRightTile(50, "Deep Water Top Right Outside Edge");
    public static Tile deepWaterOutsideEdgeBottomLeftTile = new DeepWaterOutsideEdgeBottomLeftTile(51, "Deep Water Bottom Left Outside Edge");
    public static Tile deepWaterOutsideEdgeBottomRightTile = new DeepWaterOutsideEdgeBottomRightTile(52, "Deep Water Bottom Right Outside Edge");

    //WoodFence
    public static Tile woodFenceTopTile = new WoodFenceTopTile(60);
    public static Tile woodFenceLeftTile = new WoodFenceLeftTile(61);
    public static Tile woodFenceRightTile = new WoodFenceRightTile(62);
    public static Tile woodFenceCornerTopLeftTile = new WoodFenceCornerTopLeftTile(63);
    public static Tile woodFenceCornerTopRightTile = new WoodFenceCornerTopRightTile(64);
    public static Tile woodFenceCornerBottomLeftTile = new WoodFenceCornerBottomLeftTile(65);
    public static Tile woodFenceCornerBottomRightTile = new WoodFenceCornerBottomRightTile(66);

    //SimplePaths
    //brownStonePath
    public static Tile brownStonePathTile = new BrownStonePathFullTile(200, "Full Brown Stonepath");
    public static Tile brownStonePathTopTile = new BrownStonePathTopTile(201, "Brown Stonepath Top");
    public static Tile brownStonePathBottomTile = new BrownStonePathBottomTile(202, "Brown Stonepath Bottom");
    public static Tile brownStonePathLeftTile = new BrownStonePathLeftTile(203, "Brown Stonepath Left");
    public static Tile brownStonePathRightTile = new BrownStonePathRightTile(204, "Brown Stonepath Right");
    public static Tile brownStonePathTopLeftTile = new BrownStonePathEndTopLeftTile(205, "Brown Stonepath End Top Left");
    public static Tile brownStonePathTopRightTile = new BrownStonePathEndTopRightTile(206, "Brown Stonepath End Top Right");
    public static Tile brownStonePathBottomLeftTile = new BrownStonePathEndBottomLeftTile(207, "Brown Stonepath End Bottom Left");
    public static Tile brownStonePathBottomRightTile = new BrownStonePathEndBottomRightTile(208, "Brown Stonepath End Bottom Right");
    //lightGreyStonePath
    public static Tile lightGreyStonePathTile = new LightGreyStonePathFullTile(200, "Full Light Grey Stonepath");
    public static Tile lightGreyStonePathTopTile = new LightGreyStonePathTopTile(201, "Light Grey Stonepath Top");
    public static Tile lightGreyStonePathBottomTile = new LightGreyStonePathBottomTile(202, "Light Grey Stonepath Bottom");
    public static Tile lightGreyStonePathLeftTile = new LightGreyStonePathLeftTile(203, "Light Grey Stonepath Left");
    public static Tile lightGreyStonePathRightTile = new LightGreyStonePathRightTile(204, "Light Grey Stonepath Right");
    public static Tile lightGreyStonePathTopLeftTile = new LightGreyStonePathEndTopLeftTile(205, "Light Grey Stonepath End Top Left");
    public static Tile lightGreyStonePathTopRightTile = new LightGreyStonePathEndTopRightTile(206, "Light Grey Stonepath End Top Right");
    public static Tile lightGreyStonePathBottomLeftTile = new LightGreyStonePathEndBottomLeftTile(207, "Light Grey Stonepath End Bottom Left");
    public static Tile lightGreyStonePathBottomRightTile = new LightGreyStonePathEndBottomRightTile(208, "Light Grey Stonepath End Bottom Right");
    //darkGreyStonePath
    public static Tile darkGreyStonePathTile = new DarkGreyStonePathFullTile(200, "Full Dark Grey Stonepath");
    public static Tile darkGreyStonePathTopTile = new DarkGreyStonePathTopTile(201, "Dark Grey Stonepath Top");
    public static Tile darkGreyStonePathBottomTile = new DarkGreyStonePathBottomTile(202, "Dark Grey Stonepath Bottom");
    public static Tile darkGreyStonePathLeftTile = new DarkGreyStonePathLeftTile(203, "Dark Grey Stonepath Left");
    public static Tile darkGreyStonePathRightTile = new DarkGreyStonePathRightTile(204, "Dark Grey Stonepath Right");
    public static Tile darkGreyStonePathTopLeftTile = new DarkGreyStonePathEndTopLeftTile(205, "Dark Grey Stonepath End Top Left");
    public static Tile darkGreyStonePathTopRightTile = new DarkGreyStonePathEndTopRightTile(206, "Dark Grey Stonepath End Top Right");
    public static Tile darkGreyStonePathBottomLeftTile = new DarkGreyStonePathEndBottomLeftTile(207, "Dark Grey Stonepath End Bottom Left");
    public static Tile darkGreyStonePathBottomRightTile = new DarkGreyStonePathEndBottomRightTile(208, "Dark Grey Stonepath End Bottom Right");
    //GridPath
    public static Tile gridPathTile = new GridPathFullTile(210, "Full Grid Path");
    public static Tile gridPathTopTile = new GridPathTopTile(211, "Gridpath Top");
    public static Tile gridPathBottomTile = new GridPathBottomTile(212, "Gridpath Bottom");
    public static Tile gridPathLeftTile = new GridPathLeftTile(213, "Gridpath Left");
    public static Tile gridPathRightTile = new GridPathRightTile(214, "Gridpath Right");
    public static Tile gridPathTopLeftTile = new GridPathEndTopLeftTile(215, "Gridpath End Top Left");
    public static Tile gridPathTopRightTile = new GridPathEndTopRightTile(216, "Gridpath End Top Right");
    public static Tile gridPathBottomLeftTile = new GridPathEndBottomLeftTile(217, "Gridpath End Bottom Left");
    public static Tile gridPathBottomRightTile = new GridPathEndBottomRightTile(218, "Gridpath End Bottom Right");

    //complexPaths
    //GravelPath
    public static Tile gravelTile = new GravelPathFullTile(300, "Full Gravel Path");
    public static Tile gravelEdgeTopTile = new GravelPathEdgeTopTile(301, "Gravel Top Edge");
    public static Tile gravelEdgeBottomTile = new GravelPathEdgeBottomTile(72, "Gravel Bottom Edge");
    public static Tile gravelEdgeLeftTile = new GravelPathEdgeLeftTile(303, "Gravel Left Edge");
    public static Tile gravelEdgeRightTile = new GravelPathEdgeRightTile(304, "Gravel Right Edge");
    public static Tile gravelEdgeTopLeftTile = new GravelPathEdgeTopLeftTile(305, "Gravel Top Left Edge");
    public static Tile gravelEdgeTopRightTile = new GravelPathEdgeTopRightTile(306, "Gravel Top Right Edge");
    public static Tile gravelEdgeBottomLeftTile = new GravelPathEdgeBottomLeftTile(307, "Gravel Bottom Left Edge");
    public static Tile gravelEdgeBottomRightTile = new GravelPathEdgeBottomRightTile(308, "Gravel Bottom Right Edge");
    public static Tile gravelOutsideEdgeTopLeftTile = new GravelPathOutsideEdgeTopLeftTile(309, "Gravel Top Left Outside Edge");
    public static Tile gravelOutsideEdgeTopRightTile = new GravelPathOutsideEdgeTopRightTile(310, "Gravel Top Right Outside Edge");
    public static Tile gravelOutsideEdgeBottomLeftTile = new GravelPathOutsideEdgeBottomLeftTile(311, "Gravel Bottom Left Outside Edge");
    public static Tile gravelOutsideEdgeBottomRightTile = new GravelPathOutsideEdgeBottomRightTile(312, "Gravel Bottom Right Outside Edge");
    //BeachTiles
    public static Tile beachTile = new BeachPathFullTile(320, "Full Beach Path");
    public static Tile beachEdgeTopTile = new BeachPathEdgeTopTile(321, "Beach Top Edge");
    public static Tile beachEdgeBottomTile = new BeachPathEdgeBottomTile(322, "Beach Bottom Edge");
    public static Tile beachEdgeLeftTile = new BeachPathEdgeLeftTile(323, "Beach Left Edge");
    public static Tile beachEdgeRightTile = new BeachPathEdgeRightTile(324, "Beach Right Edge");
    public static Tile beachEdgeTopLeftTile = new BeachPathEdgeTopLeftTile(325, "Beach Top Left Edge");
    public static Tile beachEdgeTopRightTile = new BeachPathEdgeTopRightTile(326, "Beach Top Right Edge");
    public static Tile beachEdgeBottomLeftTile = new BeachPathEdgeBottomLeftTile(327, "Beach Bottom Left Edge");
    public static Tile beachEdgeBottomRightTile = new BeachPathEdgeBottomRightTile(328, "Beach Bottom Right Edge");
    public static Tile beachOutsideEdgeTopLeftTile = new BeachPathOutsideEdgeTopLeftTile(329, "Beach Top Left Outside Edge");
    public static Tile beachOutsideEdgeTopRightTile = new BeachPathOutsideEdgeTopRightTile(330, "Beach Top Right Outside Edge");
    public static Tile beachOutsideEdgeBottomLeftTile = new BeachPathOutsideEdgeBottomLeftTile(331, "Beach Bottom Left Outside Edge");
    public static Tile beachOutsideEdgeBottomRightTile = new BeachPathOutsideEdgeBottomRightTile(332, "Beach Bottom Right Outside Edge");
    //DirtTiles
    public static Tile dirtTile = new DirtPathFullTile(340, "Full Dirt Path");
    public static Tile dirtEdgeTopTile = new DirtPathEdgeTopTile(341, "Dirt Top Edge");
    public static Tile dirtEdgeBottomTile = new DirtPathEdgeBottomTile(342, "Dirt Bottom Edge");
    public static Tile dirtEdgeLeftTile = new DirtPathEdgeLeftTile(343, "Dirt Left Edge");
    public static Tile dirtEdgeRightTile = new DirtPathEdgeRightTile(344, "Dirt Right Edge");
    public static Tile dirtEdgeTopLeftTile = new DirtPathEdgeTopLeftTile(345, "Dirt Top Left Edge");
    public static Tile dirtEdgeTopRightTile = new DirtPathEdgeTopRightTile(346, "Dirt Top Right Edge");
    public static Tile dirtEdgeBottomLeftTile = new DirtPathEdgeBottomLeftTile(347, "Dirt Bottom Left Edge");
    public static Tile dirtEdgeBottomRightTile = new DirtPathEdgeBottomRightTile(348, "Dirt Bottom Right Edge");
    public static Tile dirtOutsideEdgeTopLeftTile = new DirtPathOutsideEdgeTopLeftTile(349, "Dirt Top Left Outside Edge");
    public static Tile dirtOutsideEdgeTopRightTile = new DirtPathOutsideEdgeTopRightTile(350, "Dirt Top Right Outside Edge");
    public static Tile dirtOutsideEdgeBottomLeftTile = new DirtPathOutsideEdgeBottomLeftTile(351, "Dirt Bottom Left Outside Edge");
    public static Tile dirtOutsideEdgeBottomRightTile = new DirtPathOutsideEdgeBottomRightTile(352, "Dirt Bottom Right Outside Edge");
    //LightGravelPath
    public static Tile lightGravelTile = new LightGravelPathFullTile(360, "Full LightGravel Path");
    public static Tile lightGravelEdgeTopTile = new LightGravelPathEdgeTopTile(361, "LightGravel Top Edge");
    public static Tile lightGravelEdgeBottomTile = new LightGravelPathEdgeBottomTile(362, "LightGravel Bottom Edge");
    public static Tile lightGravelEdgeLeftTile = new LightGravelPathEdgeLeftTile(363, "LightGravel Left Edge");
    public static Tile lightGravelEdgeRightTile = new LightGravelPathEdgeRightTile(364, "LightGravel Right Edge");
    public static Tile lightGravelEdgeTopLeftTile = new LightGravelPathEdgeTopLeftTile(365, "LightGravel Top Left Edge");
    public static Tile lightGravelEdgeTopRightTile = new LightGravelPathEdgeTopRightTile(366, "LightGravel Top Right Edge");
    public static Tile lightGravelEdgeBottomLeftTile = new LightGravelPathEdgeBottomLeftTile(367, "LightGravel Bottom Left Edge");
    public static Tile lightGravelEdgeBottomRightTile = new LightGravelPathEdgeBottomRightTile(368, "LightGravel Bottom Right Edge");
    public static Tile lightGravelOutsideEdgeTopLeftTile = new LightGravelPathOutsideEdgeTopLeftTile(369, "LightGravel Top Left Outside Edge");
    public static Tile lightGravelOutsideEdgeTopRightTile = new LightGravelPathOutsideEdgeTopRightTile(370, "LightGravel Top Right Outside Edge");
    public static Tile lightGravelOutsideEdgeBottomLeftTile = new LightGravelPathOutsideEdgeBottomLeftTile(371, "LightGravel Bottom Left Outside Edge");
    public static Tile lightGravelOutsideEdgeBottomRightTile = new LightGravelPathOutsideEdgeBottomRightTile(372, "LightGravel Bottom Right Outside Edge");
    //LightGrassTiles
    public static Tile lightGrassTile = new LightGrassPathFullTile(380, "LightGrass");
    public static Tile lightGrassEdgeTopTile = new LightGrassPathEdgeTopTile(381, "LightGrass Top Edge");
    public static Tile lightGrassEdgeBottomTile = new LightGrassPathEdgeBottomTile(382, "LightGrass Bottom Edge");
    public static Tile lightGrassEdgeLeftTile = new LightGrassPathEdgeLeftTile(383, "LightGrass Left Edge");
    public static Tile lightGrassEdgeRightTile = new LightGrassPathEdgeRightTile(384, "LightGrass Right Edge");
    public static Tile lightGrassEdgeTopLeftTile = new LightGrassPathEdgeTopLeftTile(385, "LightGrass Top Left Edge");
    public static Tile lightGrassEdgeTopRightTile = new LightGrassPathEdgeTopRightTile(386, "LightGrass Top Right Edge");
    public static Tile lightGrassEdgeBottomLeftTile = new LightGrassPathEdgeBottomLeftTile(387, "LightGrass Bottom Left Edge");
    public static Tile lightGrassEdgeBottomRightTile = new LightGrassPathEdgeBottomRightTile(388, "LightGrass Bottom Right Edge");
    public static Tile lightGrassOutsideEdgeTopLeftTile = new LightGrassPathOutsideEdgeTopLeftTile(389, "LightGrass Top Left Outside Edge");
    public static Tile lightGrassOutsideEdgeTopRightTile = new LightGrassPathOutsideEdgeTopRightTile(390, "LightGrass Top Right Outside Edge");
    public static Tile lightGrassOutsideEdgeBottomLeftTile = new LightGrassPathOutsideEdgeBottomLeftTile(391, "LightGrass Bottom Left Outside Edge");
    public static Tile lightGrassOutsideEdgeBottomRightTile = new LightGrassPathOutsideEdgeBottomRightTile(392, "LightGrass Bottom Right Outside Edge");
    //DarkGrassTiles
    public static Tile darkGrassTile = new DarkGrassPathFullTile(390, "DarkGrass");
    public static Tile darkGrassEdgeTopTile = new DarkGrassPathEdgeTopTile(391, "DarkGrass Top Edge");
    public static Tile darkGrassEdgeBottomTile = new DarkGrassPathEdgeBottomTile(392, "DarkGrass Bottom Edge");
    public static Tile darkGrassEdgeLeftTile = new DarkGrassPathEdgeLeftTile(393, "DarkGrass Left Edge");
    public static Tile darkGrassEdgeRightTile = new DarkGrassPathEdgeRightTile(394, "DarkGrass Right Edge");
    public static Tile darkGrassEdgeTopLeftTile = new DarkGrassPathEdgeTopLeftTile(395, "DarkGrass Top Left Edge");
    public static Tile darkGrassEdgeTopRightTile = new DarkGrassPathEdgeTopRightTile(396, "DarkGrass Top Right Edge");
    public static Tile darkGrassEdgeBottomLeftTile = new DarkGrassPathEdgeBottomLeftTile(397, "DarkGrass Bottom Left Edge");
    public static Tile darkGrassEdgeBottomRightTile = new DarkGrassPathEdgeBottomRightTile(398, "DarkGrass Bottom Right Edge");
    public static Tile darkGrassOutsideEdgeTopLeftTile = new DarkGrassPathOutsideEdgeTopLeftTile(399, "DarkGrass Top Left Outside Edge");
    public static Tile darkGrassOutsideEdgeTopRightTile = new DarkGrassPathOutsideEdgeTopRightTile(400, "DarkGrass Top Right Outside Edge");
    public static Tile darkGrassOutsideEdgeBottomLeftTile = new DarkGrassPathOutsideEdgeBottomLeftTile(401, "DarkGrass Bottom Left Outside Edge");
    public static Tile darkGrassOutsideEdgeBottomRightTile = new DarkGrassPathOutsideEdgeBottomRightTile(402, "DarkGrass Bottom Right Outside Edge");
    //MudPath
    public static Tile mudTile = new MudPathFullTile(410, "Mud");
    public static Tile mudEdgeTopTile = new MudPathEdgeTopTile(401, "Mud Top Edge");
    public static Tile mudEdgeBottomTile = new MudPathEdgeBottomTile(412, "Mud Bottom Edge");
    public static Tile mudEdgeLeftTile = new MudPathEdgeLeftTile(413, "Mud Left Edge");
    public static Tile mudEdgeRightTile = new MudPathEdgeRightTile(414, "Mud Right Edge");
    public static Tile mudEdgeTopLeftTile = new MudPathEdgeTopLeftTile(415, "Mud Top Left Edge");
    public static Tile mudEdgeTopRightTile = new MudPathEdgeTopRightTile(416, "Mud Top Right Edge");
    public static Tile mudEdgeBottomLeftTile = new MudPathEdgeBottomLeftTile(417, "Mud Bottom Left Edge");
    public static Tile mudEdgeBottomRightTile = new MudPathEdgeBottomRightTile(418, "Mud Bottom Right Edge");
    public static Tile mudOutsideEdgeTopLeftTile = new MudPathOutsideEdgeTopLeftTile(419, "Mud Top Left Outside Edge");
    public static Tile mudOutsideEdgeTopRightTile = new MudPathOutsideEdgeTopRightTile(420, "Mud Top Right Outside Edge");
    public static Tile mudOutsideEdgeBottomLeftTile = new MudPathOutsideEdgeBottomLeftTile(421, "Mud Bottom Left Outside Edge");
    public static Tile mudOutsideEdgeBottomRightTile = new MudPathOutsideEdgeBottomRightTile(421, "Mud Bottom Right Outside Edge");
    //PavingPath
    public static Tile pavingTile = new PavingPathFullTile(430, "Paving");
    public static Tile pavingEdgeTopTile = new PavingPathEdgeTopTile(431, "Paving Top Edge");
    public static Tile pavingEdgeBottomTile = new PavingPathEdgeBottomTile(432, "Paving Bottom Edge");
    public static Tile pavingEdgeLeftTile = new PavingPathEdgeLeftTile(433, "Paving Left Edge");
    public static Tile pavingEdgeRightTile = new PavingPathEdgeRightTile(434, "Paving Right Edge");
    public static Tile pavingEdgeTopLeftTile = new PavingPathEdgeTopLeftTile(435, "Paving Top Left Edge");
    public static Tile pavingEdgeTopRightTile = new PavingPathEdgeTopRightTile(436, "Paving Top Right Edge");
    public static Tile pavingEdgeBottomLeftTile = new PavingPathEdgeBottomLeftTile(437, "Paving Bottom Left Edge");
    public static Tile pavingEdgeBottomRightTile = new PavingPathEdgeBottomRightTile(438, "Paving Bottom Right Edge");
    public static Tile pavingOutsideEdgeTopLeftTile = new PavingPathOutsideEdgeTopLeftTile(439, "Paving Top Left Outside Edge");
    public static Tile pavingOutsideEdgeTopRightTile = new PavingPathOutsideEdgeTopRightTile(440, "Paving Top Right Outside Edge");
    public static Tile pavingOutsideEdgeBottomLeftTile = new PavingPathOutsideEdgeBottomLeftTile(441, "Paving Bottom Left Outside Edge");
    public static Tile pavingOutsideEdgeBottomRightTile = new PavingPathOutsideEdgeBottomRightTile(442, "Paving Bottom Right Outside Edge");
    //SandTiles
    public static Tile sandTile = new SandPathFullTile(450, "Sand");
    public static Tile sandEdgeTopTile = new SandPathEdgeTopTile(451, "Sand Top Edge");
    public static Tile sandEdgeBottomTile = new SandPathEdgeBottomTile(452, "Sand Bottom Edge");
    public static Tile sandEdgeLeftTile = new SandPathEdgeLeftTile(453, "Sand Left Edge");
    public static Tile sandEdgeRightTile = new SandPathEdgeRightTile(454, "Sand Right Edge");
    public static Tile sandEdgeTopLeftTile = new SandPathEdgeTopLeftTile(455, "Sand Top Left Edge");
    public static Tile sandEdgeTopRightTile = new SandPathEdgeTopRightTile(456, "Sand Top Right Edge");
    public static Tile sandEdgeBottomLeftTile = new SandPathEdgeBottomLeftTile(457, "Sand Bottom Left Edge");
    public static Tile sandEdgeBottomRightTile = new SandPathEdgeBottomRightTile(458, "Sand Bottom Right Edge");
    public static Tile sandOutsideEdgeTopLeftTile = new SandPathOutsideEdgeTopLeftTile(459, "Sand Top Left Outside Edge");
    public static Tile sandOutsideEdgeTopRightTile = new SandPathOutsideEdgeTopRightTile(460, "Sand Top Right Outside Edge");
    public static Tile sandOutsideEdgeBottomLeftTile = new SandPathOutsideEdgeBottomLeftTile(461, "Sand Bottom Left Outside Edge");
    public static Tile sandOutsideEdgeBottomRightTile = new SandPathOutsideEdgeBottomRightTile(462, "Sand Bottom Right Outside Edge");


    public static int getTilesNumber(Tile t) {
        ArrayList<Tile> list = new ArrayList<Tile>();
        Collections.addAll(list, StaticTiles.tiles);
        return list.indexOf(t);
    }

    public static Tile getNumbersTile(int i) {
        return tiles[i];
    }
}
