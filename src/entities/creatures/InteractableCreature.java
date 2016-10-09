package entities.creatures;

import messages.*;
import tilegame.*;
import utils.*;

/**
 * This interface defines that the {@link Player} can interact with an other {@link Creature}
 */
public abstract class InteractableCreature extends Creature {

    /**
     * the default {@link Message} that is shown
     */
    protected Message message = new Message(new String[]{"Not implemented message"});

    //Constructors

    /**
     * creates a new {@link InteractableCreature} using {@link Creature#Creature(Handler, float,
     * float, int, int)}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-Position of the {@link Creature}
     * @param y       the y-Position of the {@link Creature}
     * @param width   the width of the {@link Creature}
     * @param height  the height of the {@link Creature}
     * @see Creature
     */
    public InteractableCreature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        this.setMessage(this.message);
    }

    //Methods

    /**
     * defines what to do if the {@link Player} wants to interact with this {@link Creature}
     */
    public void interact() {

        if (!message.isActive()) {
            message.setActive(true);
        } else if (!message.isLastSide())
            message.nextSide();
        else {
            message.setCurrentSide(0);
            message.setActive(false);
        }
    }

    //Getters and Setters

    /**
     * Gets the default {@link Message} that is shown
     *
     * @return Value of the default {@link Message}
     */
    public Message getMessage() {
        return message;
    }

    /**
     * StaticSets new the default {@link Message} that is shown
     *
     * @param message New value of the default {@link Message}
     */
    public void setMessage(Message message) {
        handler.getMessageManager().removeMessage(this.message);
        this.message = message;
        handler.getMessageManager().addMessage(this.message);
    }
}
