package messages;

import java.awt.*;

public class Message {

    private Font font = new Font("Arial", Font.ITALIC, 45);
    private String[] message;
    private int sides, activeSide;
    private MessageField messageField;

    public Message(String[] message) {
        this.message = message;
        sides = message.length;
        activeSide = 0;
        messageField = new MessageField(this);
    }

    public void tick() {
    }

    public void render(Graphics g) {
        messageField.render(g);
        g.setColor(Color.BLACK);
        g.setFont(font);
        //Schreiben
        g.drawString(message[activeSide], (int) (messageField.getX() + 50), (int) (messageField.getY() + 50));

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
}
