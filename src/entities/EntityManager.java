package entities;

import java.awt.*;
import java.io.*;
import java.util.*;

import entities.creatures.*;
import entities.statics.*;
import tilegame.*;
import utils.*;

/**
 * this class is used to store every {@link Entity} the {@link tilegame.Game} should contain. It is
 * used to {@link Entity#render(Graphics) render} and {@link Entity#tick() tick} every {@link
 * Entity}
 */
public class EntityManager {

    /**
     * a {@link Handler} to the {@link tilegame.Game}
     */
    private Handler handler;
    /**
     * the {@link Player} NOTE: only one player
     */
    private Player player;
    /**
     * an ArrayList of all the {@link Entity Entities}
     */
    private ArrayList<Entity> entities;
    /**
     * a comparator to render the {@link Entity Entities} in a strategy. It renders {@link Entity
     * Entities} that have set {@link Entity#alwaysInBack()} equal to <code> true</code> behind
     * every other {@link Entity} and everything else depending on their bottom left bound corner.
     * If the value is smaller it's rendered before the other one.
     */
    private Comparator<Entity> renderSorter = new Comparator<Entity>() {
        @Override
        public int compare(Entity a, Entity b) {
            if (a.alwaysInBack())
                return -1;
            if (b.alwaysInBack())
                return 1;


            if (a.getY() + a.getHeight() < b.getY() + b.getHeight())
                return -1;
            else
                return 1;
        }
    };

    //Constructors

    /**
     * creates a new {@link EntityManager}
     *
     * @param handler the ´{@link Handler} to the {@link tilegame.Game}
     * @param player  the {@link Player}
     */
    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        addEntity(player);
    }

    //Methods

    /**
     * calls {@link Entity#tick()} on every {@link Entity} within {@link #entities}
     */
    public void tick() {
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            e.tick();
            if (!e.isActive())
                entities.remove(e);
        }
        entities.sort(renderSorter);
    }

    /**
     * calls {@link Entity#render(Graphics)} on every {@link Entity} within {@link #entities}
     *
     * @param g the {@link Graphics}-object to draw with
     */
    public void render(Graphics g) {
        for (Entity e : entities)
            e.render(g);
    }

    /**
     * adds an {@link Entity} to {@link #entities}
     *
     * @param e the {@link Entity} that should be added
     */
    public void addEntity(Entity e) {
        entities.add(e);
    }

    //Getters and Setters

    /**
     * Gets a {@link Handler} to the {@link tilegame.Game}.
     *
     * @return Value of a {@link Handler} to the {@link tilegame.Game}.
     */
    public Handler getHandler() {
        return handler;
    }

    /**
     * StaticSets new a {@link Handler} to the {@link tilegame.Game}.
     *
     * @param handler New value of a {@link Handler} to the {@link tilegame.Game}.
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * Gets an ArrayList of all the {@link Entity Entities}.
     *
     * @return Value of an ArrayList of all the {@link Entity Entities}.
     */
    public ArrayList<Entity> getEntities() {
        return entities;
    }

    /**
     * StaticSets new an ArrayList of all the {@link Entity Entities}.
     *
     * @param entities New value of an ArrayList of all the {@link Entity Entities}.
     */
    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }

    /**
     * Gets the {@link Player} NOTE: only one player.
     *
     * @return Value of the {@link Player} NOTE: only one player.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * StaticSets new the {@link Player} NOTE: only one player.
     *
     * @param player New value of the {@link Player} NOTE: only one player.
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Gets a comparator to render the {@link Entity Entities} in a strategy. It renders {@link
     * Entity Entities} that have set {@link Entity#alwaysInBack} equal to <code> true</code> behind
     * every other {@link Entity} and everything else depending on their bottom left bound corner.
     * If the value is smaller it's rendered before the other one..
     *
     * @return Value of {@link #renderSorter}
     */
    public Comparator<Entity> getRenderSorter() {
        return renderSorter;
    }

    /**
     * StaticSets new a comparator to render the {@link Entity Entities} in a strategy. It renders
     * {@link Entity Entities} that have set {@link Entity#alwaysInBack} equal to <code> true</code>
     * behind every other {@link Entity} and everything else depending on their bottom left bound
     * corner. If the value is smaller it's rendered before the other one..
     *
     * @param renderSorter New value of {@link #renderSorter}
     */
    public void setRenderSorter(Comparator<Entity> renderSorter) {
        this.renderSorter = renderSorter;
    }

    public void save() {
        StringBuilder sb = new StringBuilder();
        int index;
        for (int i = 0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            index = StaticEntitys.getIndexOfClass(e.getClass());
            if (index == -1)
                continue;
            sb.append(index).append("/nbsp/");
            sb.append(e.getX()).append("/nbsp/");
            sb.append(e.getY()).append("/nbsp/");
            sb.append(e.getWidth()).append("/nbsp/");
            sb.append(e.getHeight()).append("/nbsp/");
            if (e instanceof StaticInteractableEntity)
                sb.append(((StaticInteractableEntity) e).getMessage());
            else if (e instanceof InteractableCreature)
                sb.append(((InteractableCreature) e).getMessage());
            else
                sb.append("no message");
            sb.append("\n");
        }
        System.out.println(sb.toString());

        Utils.printIntoFile(new File("res/worlds/" + handler.getWorld().getName() + ".ntt"), sb.toString());
    }
}
