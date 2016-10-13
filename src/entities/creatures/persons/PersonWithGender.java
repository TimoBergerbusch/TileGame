package entities.creatures.persons;

import java.awt.image.*;

import messages.*;
import tilegame.*;
import utils.*;

public abstract class PersonWithGender extends Person {
    protected boolean isMale;

    public PersonWithGender(Handler handler, float x, float y, BufferedImage[][] textures, boolean shouldMove, boolean isMale) {
        super(handler, x, y, initTexture(isMale, textures), shouldMove);
    }

    public PersonWithGender(Handler handler, float x, float y, BufferedImage[][] textures, boolean shouldMove, boolean isMale, Direction direction) {
        super(handler, x, y, initTexture(isMale, textures), shouldMove, direction);
    }

    public PersonWithGender(Handler handler, float x, float y, BufferedImage[][] textures, boolean shouldMove, boolean isMale, Message message) {
        super(handler, x, y, initTexture(isMale, textures), shouldMove, message);
    }

    public PersonWithGender(Handler handler, float x, float y, BufferedImage[][] textures, boolean shouldMove, boolean isMale, Direction direction, Message message) {
        super(handler, x, y, initTexture(isMale, textures), shouldMove, direction, message);
    }

    private static BufferedImage[] initTexture(boolean isMale, BufferedImage[][] textures) {
        if (isMale) {
            return textures[0];
        } else {
            return textures[1];
        }
    }
}
