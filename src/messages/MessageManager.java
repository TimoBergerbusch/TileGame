package messages;

import java.awt.*;
import java.util.ArrayList;

import tilegame.Handler;

public class MessageManager {

    private Handler handler;

    private ArrayList<Message> messages;

    public MessageManager(Handler handler) {
        this.handler = handler;
        messages = new ArrayList<Message>();
    }

    public void tick() {
    }

    public void render(Graphics g) {
        for (Message message : messages)
            message.render(g);

    }

    public void removeMessage(Message message) {
        messages.remove(message);
    }

    public void addMessage(Message message) {
        messages.add(message);
    }


}
