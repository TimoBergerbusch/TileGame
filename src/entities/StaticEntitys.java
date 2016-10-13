package entities;

import entities.statics.*;
import entities.statics.Pavilion.*;
import entities.statics.houses.*;
import messages.*;
import tilegame.*;
import tiles.*;

public class StaticEntitys {

    public static Class[] classes = new Class[]{WoodSign.class, MetalSign.class, LandscapeHouseGreen.class, Statue.class, Pavilion.class};

    public static Class getClassByIndex(int index) {
        return classes[index];
    }

    public static int getIndexOfClass(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i].equals(c))
                return i;
        }
        return -1;
    }

    public static Entity createStaticEntity(Handler handler, int i, float x, float y, Message message) {
//        if (message == null) {
//            message = StaticInteractableEntity.message;
//        }
//        System.out.println(message.toString());
        if (i == getIndexOfClass(WoodSign.class))
            return new WoodSign(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT, message);
        if (i == getIndexOfClass(MetalSign.class))
            return new MetalSign(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT, message);
        if (i == getIndexOfClass(LandscapeHouseGreen.class))
            return new LandscapeHouseGreen(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT);
        if (i == getIndexOfClass(Statue.class))
            return new Statue(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT, message);
        if (i == getIndexOfClass(Pavilion.class))
            return new Pavilion(handler, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT);

        return null;
    }
}
