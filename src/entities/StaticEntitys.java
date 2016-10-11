package entities;

import entities.statics.*;
import entities.statics.houses.*;

public class StaticEntitys {

    public static Class[] classes = new Class[]{WoodSign.class, MetalSign.class, GreenHouse.class};

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
}
