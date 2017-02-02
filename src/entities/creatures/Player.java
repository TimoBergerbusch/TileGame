package entities.creatures;

import java.awt.*;
import java.awt.image.*;

import entities.*;
import entities.statics.*;
import gfx.*;
import messages.*;
import tilegame.*;
import tiles.*;
import utils.*;

import static utils.Direction.*;

/**
 * defines a Player as a subclass of {@link Creature}
 */
public class Player extends Creature {

    //Animations Start
    //Walking
    /**
     * the walking down {@link Animation}
     */
    private Animation animDown;
    /**
     * the walking up {@link Animation}
     */
    private Animation animUp;
    /**
     * the walking left {@link Animation}
     */
    private Animation animLeft;
    /**
     * the walking right {@link Animation}
     */
    private Animation animRight;
    //Running
    /**
     * the running up {@link Animation}
     */
    private Animation animRunningUp;
    /**
     * the running down {@link Animation}
     */
    private Animation animRunningDown;
    /**
     * the running left {@link Animation}
     */
    private Animation animRunningLeft;
    /**
     * the running right {@link Animation}
     */
    private Animation animRunningRight;
    //Amimations End

    //Attack timer
    /**
     * the time in milliseconds since the last attack
     */
    private long lastAttackTimer;
    /**
     * the time in milliseconds between to attacks
     */
    private long attackCooldown = 800;
    /**
     * the time between now and {@link #lastAttackTimer}
     */
    private long attackTimer = attackCooldown;

    //Interact timer
    /**
     * the time in milliseconds since the last interaction
     */
    private long lastInteractTimer;
    /**
     * the time in milliseconds between to interactions
     */
    private long interactCooldown = 500;
    /**
     * the time between now and {@link #lastInteractTimer}
     */
    private long interactTimer = interactCooldown;

    /**
     * the {@link Direction} the player is facing
     */
    private Direction direction;

    /**
     * the time in which the {@link Animation animations} switch images
     */
    private int animationTime = 250;

    private boolean isMale;

    //Constructors

    /**
     * creates a new {@link Player} at the given x/y-position
     *
     * @param handler the {@link Handler} to the {@link tilegame.Game}
     * @param x       the x-position of the {@link entities.Entity}
     * @param y       the y-position of the {@link entities.Entity}
     */
    public Player(Handler handler, float x, float y, boolean isMale) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);

        //Animation Start
        //walking
        direction = DOWN;
        this.isMale = isMale;
        if (isMale)
            initMale();
        else
            initFemale();
        //Animations End

        computeBounds();
    }

    public void initMale() {
        animUp = new Animation(animationTime, Utils.getArrayPart(Assets.male_player_walking, 0, 3));
        animDown = new Animation(animationTime, Utils.getArrayPart(Assets.male_player_walking, 4, 7));
        animLeft = new Animation(animationTime, Utils.getArrayPart(Assets.male_player_walking, 8, 11));
        animRight = new Animation(animationTime, Utils.getArrayPart(Assets.male_player_walking, 12, 15));

        //Running
        animRunningUp = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.male_player_running, 0, 3));
        animRunningDown = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.male_player_running, 4, 7));
        animRunningLeft = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.male_player_running, 8, 11));
        animRunningRight = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.male_player_running, 12, 15));
    }

    public void initFemale() {
        animUp = new Animation(animationTime, Utils.getArrayPart(Assets.female_player_walking, 0, 3));
        animDown = new Animation(animationTime, Utils.getArrayPart(Assets.female_player_walking, 4, 7));
        animLeft = new Animation(animationTime, Utils.getArrayPart(Assets.female_player_walking, 8, 11));
        animRight = new Animation(animationTime, Utils.getArrayPart(Assets.female_player_walking, 12, 15));

        //Running
        animRunningUp = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.female_player_running, 0, 3));
        animRunningDown = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.female_player_running, 4, 7));
        animRunningLeft = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.female_player_running, 8, 11));
        animRunningRight = new Animation((int) (animationTime * 0.5), Utils.getArrayPart(Assets.female_player_running, 12, 15));
    }

    private void computeBounds() {
//        if(direction == LEFT || direction == RIGHT){
//            bounds.x = (int) (width * 0.3);
//            bounds.y = (int) (height * 0.5);
//            bounds.width = (int) (width * 0.475);
//            bounds.height = (int) (height * 0.46);
//        } else {
        bounds.x = (int) (width * 0.2);
        bounds.y = (int) (height * 0.5);
        bounds.width = (int) (width * 0.6);
        bounds.height = (int) (height * 0.46);
//        }
    }

    //implemented Methods
    @Override
    public void move() {
        if (!checkEntityCollision(xMove, 0)) {
            moveX();
        }
        if (!checkEntityCollision(0, yMove) && xMove == 0)
//        if (!checkEntityCollision(0, yMove))
            moveY();

    }

    @Override
    public void tick() {
        if (!Message.isShown) {     // only move if no message is shown
            //animation
            animDown.tick();
            animUp.tick();
            animLeft.tick();
            animRight.tick();
            animRunningUp.tick();
            animRunningDown.tick();
            animRunningLeft.tick();
            animRunningRight.tick();

            //Movement
            getInput();
            move();
            handler.getGameCamera().centerOnEntity(this);
        }

        //Interact
        if (handler.getKeyManager().interact)
            checkInteract();
        //Attack
        if (handler.getKeyManager().attack)
            checkAttacks();
    }

    /**
     * checks if {@link Player} interacts with any {@link Entity} extending {@link
     * StaticInteractableEntity}. It is only called if {@link input.KeyManager#interact} is set.
     */
    private void checkInteract() {
        interactTimer += System.currentTimeMillis() - lastInteractTimer;
        lastInteractTimer = System.currentTimeMillis();
        if (interactTimer < interactCooldown)
            return;

        Rectangle cb = getCollisionBounds(0, 0);
        Rectangle ar = new Rectangle();
        int arSize = 20;
        ar.width = arSize;
        ar.height = arSize;

        if (direction == UP) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y - arSize;
        } else if (direction == DOWN) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height;
        } else if (direction == LEFT) {
            ar.x = cb.x - arSize;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else if (direction == RIGHT) {
            ar.x = cb.x + cb.width;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else {
            return;
        }

        interactTimer = 0;

        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this))
                continue;
            if (e instanceof StaticInteractableEntity && e.getCollisionBounds(0, 0).intersects(ar)) {
                ((StaticInteractableEntity) e).interact();
                return;
            } else if (e instanceof InteractableCreature && e.getCollisionBounds(0, 0).intersects(ar)) {
                ((InteractableCreature) e).interact();
                return;
            }
        }
    }

    /**
     * checks if {@link Player} attacks any {@link Entity}. It is only called if {@link
     * input.KeyManager#attack} is set.
     */
    private void checkAttacks() {
        attackTimer += System.currentTimeMillis() - lastAttackTimer;
        lastAttackTimer = System.currentTimeMillis();
        if (attackTimer < attackCooldown)
            return;

        Rectangle cb = getCollisionBounds(0, 0);
        Rectangle ar = new Rectangle();
        int arSize = 20;
        ar.width = arSize;
        ar.height = arSize;

        if (direction == UP) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y - arSize;
        } else if (direction == DOWN) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height;
        } else if (direction == LEFT) {
            ar.x = cb.x - arSize;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else if (direction == RIGHT) {
            ar.x = cb.x + cb.width;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else {
            return;
        }

        attackTimer = 0;

        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this))
                continue;
            if (e.getCollisionBounds(0, 0).intersects(ar)) {
                e.hurt(1);
                return;
            }
        }

    }

    /**
     * updates the {@link #speed} and {@link #direction} according to the {@link input.KeyManager}
     */
    private void getInput() {
        xMove = yMove = 0;

        if (handler.getKeyManager().up)
            yMove = -speed;
        if (handler.getKeyManager().down)
            yMove = speed;
        if (handler.getKeyManager().left)
            xMove = -speed;
        if (handler.getKeyManager().right)
            xMove = speed;

        if (handler.getKeyManager().running)
            speed = 2 * DEFAULT_SPEED;
        else
            speed = DEFAULT_SPEED;
    }

    @Override
    public void die() {

        System.out.println("You Lose");
    }

    @Override
    public void render(Graphics g) {

        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        renderBounds(g);
    }

    /**
     * gets the current frame of the differnt {@link Animation animations} depending on {@link
     * #direction} and if {@link input.KeyManager#running} is set
     *
     * @return the {@link BufferedImage} that fits the current situation
     */
    private BufferedImage getCurrentAnimationFrame() {
//        computeBounds();
        if (xMove < 0) {
            direction = LEFT;
            if (handler.getKeyManager().running)
                return animRunningLeft.getCurrentFrame();
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            direction = RIGHT;
            if (handler.getKeyManager().running)
                return animRunningRight.getCurrentFrame();
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            direction = UP;
            if (handler.getKeyManager().running)
                return animRunningUp.getCurrentFrame();
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {
            direction = DOWN;
            if (handler.getKeyManager().running)
                return animRunningDown.getCurrentFrame();
            return animDown.getCurrentFrame();
        } else {
            switch (direction) {
                case UP:
                    if (isMale)
                        return Assets.malePlayerStillUp;
                    else
                        return Assets.femalePlayerStillUp;
                case LEFT:
                    if (isMale)
                        return Assets.malePlayerStillLeft;
                    else
                        return Assets.femalePlayerStillLeft;
                case RIGHT:
                    if (isMale)
                        return Assets.malePlayerStillRight;
                    else
                        return Assets.femalePlayerStillRight;
                default:
                    if (isMale)
                        return Assets.malePlayerStillDown;
                    else
                        return Assets.femalePlayerStillDown;
            }
        }

    }

    //Getter und Setter

    public Direction getDirection() {
        return direction;
    }

    public void setPositionOnTile(int x, int y) {
        switch (direction) {
            case UP:
                setX(x * Tile.TILE_WIDTH);
                setY(y * Tile.TILE_HEIGHT - (height - Tile.TILE_HEIGHT));
                break;
            case DOWN:
                setX(x * Tile.TILE_WIDTH);
                setY(y * Tile.TILE_HEIGHT + height - Tile.TILE_HEIGHT);
                break;
            default:
                setX(x * Tile.TILE_WIDTH);
                setY(y * Tile.TILE_HEIGHT);
                break;
        }
    }
}
