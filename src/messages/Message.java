package messages;

import java.awt.*;
import java.awt.image.BufferedImage;

import entities.StaticInteractableEntity;


/**
 * This class represents a message an NPC or an other {@link entities.Entity} that implements the
 * {@link StaticInteractableEntity}-Interface can have and will be shown, when the {@link
 * StaticInteractableEntity#interact()}-Method is fired. It gets a <code>String-Array</code> and
 * splits it into the sides and number of lines it takes to show it.
 */
public class Message {

    public static boolean isShown = false;
    /**
     * the length of a line measured in {@link Character Characters}. The <code>default</code>-Value
     * is 59;
     */
    private static int MESSAGE_LINE_LENGTH = 59;
    /**
     * the Offset of the x-Position relative to the {@link #messageField}
     */
    private static int xOffset = 50;
    /**
     * the Offset of the y-Positon relative to the {@link #messageField}
     */
    private static int yOffset = 55;
    /**
     * the message that should be displayed. Every entry in the <code>Array</code> defines it's own
     * side to be displayed on. The sides get split into the different lines.
     *
     * @see #getSplittedText(String, int)
     */
    private String[] message;
    /**
     * the lines that are written on the screen representing one entry of the {@link #message}
     */
    private String[] lines;
    /**
     * the number of sides the {@link #message} has
     */
    private int sides;
    /**
     * the currently Side, that is displayed. The <code>default</code>-Value is 0, so the first side
     * is the first one to display
     */
    private int currentSide = 0;
    /**
     * the {@link MessageField} that this message is displayed on
     */
    private MessageField messageField;
    /**
     * the {@link Font} the message should be written in.
     */
    private Font font = new Font("Arial", Font.ITALIC, 45);
    /**
     * defines whether or not the message should be drawn or not <ul><li>true = should be
     * drawn</li><li>false = should <em>not</em> be drawn</li></ul>
     */
    private boolean active = false;

    //Constructors

    /**
     * creates a new {@link Message} with the default {@link MessageField#texture} and default
     * {@link Font}. It also loads the lines to the default {@link #currentSide}
     *
     * @param message the message that should be displayed
     */
    public Message(String[] message) {
        this.message = message;
        sides = message.length;
        messageField = new MessageField();
        loadLines();
    }

    /**
     * creates a new {@link Message} and sets the {@link MessageField#texture} using {@link
     * #Message(String[])}
     *
     * @param message           the message that should be dispalyed
     * @param messageBackground the {@link MessageField#texture}
     */
    public Message(String[] message, BufferedImage messageBackground) {
        this(message);
        messageField.setTexture(messageBackground);
    }

    /**
     * creates a new {@link Message} and sets the {@link MessageField#texture} and the {@link
     * #font}
     *
     * @param message           the message that should be displayed
     * @param messageBackground the {@link MessageField#texture}
     * @param font              the {@link #font}
     */
    public Message(String[] message, BufferedImage messageBackground, Font font) {
        this(message, messageBackground);
        this.font = font;
    }

    //Methods

    /**
     * Gets the Offset of the x-Position relative to the {@link #messageField}.
     *
     * @return Value of the Offset of the x-Position relative to the {@link #messageField}.
     */
    public static int getXOffset() {
        return xOffset;
    }

    /**
     * StaticSets new the Offset of the x-Position relative to the {@link #messageField}.
     *
     * @param xOffset New value of the Offset of the x-Position relative to the {@link
     *                #messageField}.
     */
    public static void setXOffset(int xOffset) {
        Message.xOffset = xOffset;
    }

    /**
     * Gets the Offset of the y-Positon relative to the {@link #messageField}.
     *
     * @return Value of the Offset of the y-Positon relative to the {@link #messageField}.
     */
    public static int getYOffset() {
        return yOffset;
    }

    /**
     * StaticSets new the Offset of the y-Positon relative to the {@link #messageField}.
     *
     * @param yOffset New value of the Offset of the y-Positon relative to the {@link
     *                #messageField}.
     */
    public static void setYOffset(int yOffset) {
        Message.yOffset = yOffset;
    }

    /**
     * the tick-Method NOTE: empty and unused
     */
    public void tick() {
    }

    /**
     * draws the {@link Message} to the screen using {@link MessageField#render(Graphics)}  and
     * afterwords write the {@link #lines}.
     *
     * @param g the {@link Graphics}-Object to draw with
     */
    public void render(Graphics g) {
        if (!active)
            return;
        messageField.render(g);
        g.setColor(Color.BLACK);
        g.setFont(font);
        //Writing
        for (int lineNumber = 0; lineNumber < lines.length; lineNumber++) {
            g.drawString(lines[lineNumber], (int) (messageField.getX() + xOffset), (int) (messageField.getY() + yOffset + (font.getSize() + 10) * lineNumber));
        }

    }

    //Getters and Setters

    /**
     * Splits a given String into the number of lines, with every line having a maximum of {@link
     * #MESSAGE_LINE_LENGTH}-Characters
     *
     * @param string the String to split into lines
     * @param lines  the number of lines the given String should be put in
     * @return a String-Array with the lines
     *
     * NOTE: may hav problems if the String doesn't fit in the amout of lines
     */
    private String[] getSplittedText(String string, int lines) {
        String[] split = string.split("\\s+");
        StringBuilder[] sb = new StringBuilder[lines];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int start = 0;

        outer:
        for (int index = 0; index < split.length; index++) {
            for (int sbIndex = start; sbIndex < sb.length; sbIndex++) {
                if (sb[sbIndex].toString().length() + split[index].length() < MESSAGE_LINE_LENGTH) {
                    start = sbIndex;
                    sb[sbIndex].append(split[index]).append(" ");
                    continue outer;
                }
            }
        }

        String[] result = new String[lines];
        for (int i = 0; i < result.length; i++)
            result[i] = sb[i].toString();

        return result;
    }

    /**
     * sets the {@link #currentSide} to the next side and calls {@link #loadLines()} if possible
     *
     * @see Message#loadLines()
     */
    public void nextSide() {
        if (currentSide < sides - 1) {
            currentSide++;
            loadLines();
        }
    }

    /**
     * Checks if the {@link #currentSide current Side} is the {@link #sides last Side}
     *
     * @return whether the current side is the last side
     */
    public boolean isLastSide() {
        return currentSide == sides - 1;
    }

    /**
     * reloads the lines to be shown. Should be called everytime the {@link #currentSide} is
     * changed
     */
    public void loadLines() {
        lines = this.getSplittedText(message[currentSide], (int) (Math.floor(message[currentSide].length() / MESSAGE_LINE_LENGTH) + 1));
    }

    /**
     * Gets defines whether or not the message should be drawn or not <ul><li>true = should be
     * drawn</li><li>false = should <em>not</em> be drawn</li></ul>.
     *
     * @return Value of {@link #active}
     */
    public boolean isActive() {
        return active;
    }

    /**
     * StaticSets new defines whether or not the message should be drawn or not <ul><li>true =
     * should be drawn</li><li>false = should <em>not</em> be drawn</li></ul>.
     *
     * @param active New value of active
     */
    public void setActive(boolean active) {
        this.active = active;
        isShown = active;
    }

    /**
     * Gets the {@link MessageField} that this message is displayed on.
     *
     * @return Value of the {@link MessageField} that this message is displayed on.
     */
    public MessageField getMessageField() {
        return messageField;
    }

    /**
     * StaticSets new the {@link MessageField} that this message is displayed on.
     *
     * @param messageField New value of the {@link MessageField} that this message is displayed on.
     */
    public void setMessageField(MessageField messageField) {
        this.messageField = messageField;
    }

    /**
     * Gets the {@link Font} the message should be written in..
     *
     * @return Value of the {@link Font} the message should be written in..
     */
    public Font getFont() {
        return font;
    }

    /**
     * StaticSets new the {@link Font} the message should be written in..
     *
     * @param font New value of the {@link Font} the message should be written in..
     */
    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * Gets the message that should be displayed. Every entry in the <code>Array</code> defines it's
     * own side to be displayed on. The sides get split into the different lines.
     *
     * @return the message
     */
    public String[] getMessage() {
        return message;
    }

    /**
     * StaticSets new the message that should be displayed. Every entry in the <code>Array</code>
     * defines it's own side to be displayed on. The sides get split into the different lines.
     *
     * @param message New value of the message that should be displayed. Every entry in the
     *                <code>Array</code> defines it's own side to be displayed on. The sides get
     *                split into the different lines.
     */
    public void setMessage(String[] message) {
        this.message = message;
    }

    /**
     * Gets the lines that are written on the screen representing one entry of the {@link
     * #message}.
     *
     * @return Value of the lines that are written on the screen representing one entry of the
     * {@link #message}.
     */
    public String[] getLines() {
        return lines;
    }

    /**
     * StaticSets new the lines that are written on the screen representing one entry of the {@link
     * #message}.
     *
     * @param lines New value of the lines that are written on the screen representing one entry of
     *              the {@link #message}.
     */
    public void setLines(String[] lines) {
        this.lines = lines;
    }

    /**
     * Gets the currently Side, that is displayed. The <code>default</code>-Value is 0, so the first
     * side is the first one to display.
     *
     * @return Value of the currently Side, that is displayed. The <code>default</code>-Value is 0,
     * so the first side is the first one to display.
     */
    public int getCurrentSide() {
        return currentSide;
    }

    /**
     * StaticSets new the currently Side, that is displayed. The <code>default</code>-Value is 0, so
     * the first side is the first one to display.
     *
     * @param currentSide New value of the currently Side, that is displayed. The
     *                    <code>default</code>-Value is 0, so the first side is the first one to
     *                    display.
     */
    public void setCurrentSide(int currentSide) {
        this.currentSide = currentSide;
        loadLines();
    }

    /**
     * Gets the number of sides the {@link #message} has.
     *
     * @return Value of the number of sides the {@link #message} has.
     */
    public int getSides() {
        return sides;
    }
}
