package entities.statics;

import entities.*;
import messages.*;
import tilegame.*;

/**
 * This interface defines that the {@link entities.creatures.Player} can interact with the {@link
 * Entity}
 */
public abstract class StaticInteractableEntity extends StaticEntity {

    /**
     * the default {@link Message} this {@link Statue} shows
     */
    public Message message = new Message(new String[]{"Not implemented message"});

    //Constructors

    /**
     * creates a new {@link StaticInteractableEntity} using {@link StaticEntity#StaticEntity(Handler,
     * float, float, int, int)}
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-Position of the {@link Entity}
     * @param y       the y-Position of the {@link Entity}
     * @param width   the width of the {@link Entity}
     * @param height  the height of the {@link Entity}
     * @see StaticEntity
     */
    public StaticInteractableEntity(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        handler.getMessageManager().addMessage(this.message);
    }

    //Methods

    /**
     * defines what to do if the {@link entities.creatures.Player} wants to interact with this
     * {@link Entity}
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
     * Gets the default {@link Message} this {@link Statue} shows.
     *
     * @return Value of the default {@link Message} this {@link Statue} shows.
     */
    public Message getMessage() {
        return message;
    }

    /**
     * StaticSets new the default {@link Message} this {@link Statue} shows.
     *
     * @param message New value of the default {@link Message} this {@link Statue} shows.
     */
    public void setMessage(Message message) {
//        System.out.println(message.toString());
        handler.getMessageManager().removeMessage(this.message);
        this.message = message;
        handler.getMessageManager().addMessage(this.message);
    }
}
