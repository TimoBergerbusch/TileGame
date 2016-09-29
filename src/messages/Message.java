package messages;

import java.awt.*;
import java.awt.image.BufferedImage;

import gfx.Assets;

public class Message {

    private Font font;
    private static int xOffset = 50, yOffset = 55;
    private String[] message;
    private int sides, activeSide;
    private MessageField messageField;
    private static int MESSAGE_LINE_LENGTH = 59;
    private boolean active = false;

    public Message(String[] message) {
        this.message = message;
        sides = message.length;
        activeSide = 0;
        messageField = new MessageField();
        font = new Font("Arial", Font.ITALIC, 45);
    }

    public Message(String[] message, BufferedImage messageBackground) {
        this(message);
        messageField.setTexture(messageBackground);
    }

    public Message(String[] message, BufferedImage messageBackground, Font font) {
        this(message, messageBackground);
        this.font = font;
    }

    public void tick() {
    }

    public void render(Graphics g) {
        messageField.render(g);
        g.setColor(Color.BLACK);
        g.setFont(font);
        //Schreiben
        String[] lines = this.getSplittedText(message[activeSide], (int) (Math.floor(message[activeSide].length() / MESSAGE_LINE_LENGTH) + 1));
        for (int lineNumber = 0; lineNumber < lines.length; lineNumber++) {
            g.drawString(lines[lineNumber], (int) (messageField.getX() + xOffset), (int) (messageField.getY() + yOffset + (font.getSize()+10) * lineNumber));
        }

    }

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

    public String getCurrentMessage() {
        return message[activeSide];
    }

    public void nextSide() {
        activeSide++;
    }

    public boolean isLastSide() {
        return activeSide == sides - 1;
    }

    public static void setxOffset(int xOffset) {
        Message.xOffset = xOffset;
    }

    public static void setyOffset(int yOffset) {
        Message.yOffset = yOffset;
    }
}
