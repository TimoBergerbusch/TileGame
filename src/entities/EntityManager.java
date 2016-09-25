package entities;


import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

import tilegame.Handler;

import entities.creatures.Player;

public class EntityManager {

    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;
    private Comparator<Entity> renderSorter = new Comparator<Entity>() {
        @Override
        public int compare(Entity a, Entity b) {
            if(a.getY()+a.getHeight() < b.getY()+b.getHeight())
                return -1;
            else
                return 1;
        }
    };

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        addEntity(player);
    }

    public void tick() {
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            e.tick();
        }
        entities.sort(renderSorter);
    }

    public void render(Graphics g) {
        for(Entity e: entities)
            e.render(g);
    }

    public void addEntity(Entity e) {
        entities.add(e);
    }

    //Getters and Setters

    /**
     * Gets player.
     *
     * @return Value of player.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets entities.
     *
     * @return Value of entities.
     */
    public ArrayList<Entity> getEntities() {
        return entities;
    }

    /**
     * Gets handler.
     *
     * @return Value of handler.
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * Sets new handler.
     *
     * @param handler New value of handler.
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * Sets new entities.
     *
     * @param entities New value of entities.
     */
    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }

    /**
     * Sets new player.
     *
     * @param player New value of player.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}
