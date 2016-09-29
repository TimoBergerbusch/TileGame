package entities.creatures;

import java.awt.*;
import java.awt.image.BufferedImage;

import entities.StaticInteractableEntity;
import entities.Entity;
import gfx.Animation;
import tilegame.Handler;

import gfx.Assets;
import utils.Direction;

import static utils.Direction.DOWN;
import static utils.Direction.LEFT;
import static utils.Direction.RIGHT;
import static utils.Direction.UP;

public class Player extends Creature {

    //Animations Start
    //Walking
    private Animation animDown;
    private Animation animUp;
    private Animation animLeft;
    private Animation animRight;
    //Running
    private Animation animRunningUp;
    private Animation animRunningDown;
    private Animation animRunningLeft;
    private Animation animRunningRight;
    //Amimations End

    //Attack timer
    private long lastAttackTimer, attackCooldown = 800, attackTimer = attackCooldown;
    //Interact timer
    private long lastInteractTimer, interactCooldown = 500, interactTimer = interactCooldown;

    private Direction direction;
    private int animationTime = 250;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);

        bounds.x = 13;
        bounds.y = 44;
        bounds.width = 38;
        bounds.height = 45;

        //Animation Start
        //walking
        direction = Direction.DOWN;
        animDown = new Animation(animationTime, Assets.player_walking_down);
        animUp = new Animation(animationTime, Assets.player_walking_up);
        animLeft = new Animation(animationTime, Assets.player_walking_left);
        animRight = new Animation(animationTime, Assets.player_walking_right);
        //Running
        animRunningUp = new Animation(animationTime, Assets.player_running_up);
        animRunningDown = new Animation(animationTime, Assets.player_running_down);
        animRunningLeft = new Animation(animationTime, Assets.player_running_left);
        animRunningRight = new Animation(animationTime, Assets.player_running_right);
        //Animations End
    }

    @Override
    public void move() {
        if (!checkEntityCollision(xMove, 0)) {
            moveX();
        }
//        if (!checkEntityCollision(0, yMove) && xMove == 0)
        if (!checkEntityCollision(0, yMove))
            moveY();
    }

    @Override
    public void tick() {

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

        //Interact
        if (handler.getKeyManager().interact)
            checkInteract();
        //Attack
        if (handler.getKeyManager().attack)
            checkAttacks();
    }

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

        if (direction == Direction.UP) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y - arSize;
        } else if (direction == Direction.DOWN) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height;
        } else if (direction == Direction.LEFT) {
            ar.x = cb.x - arSize;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else if (direction == Direction.RIGHT) {
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
            }
        }
    }

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

        if (direction == Direction.UP) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y - arSize;
        } else if (direction == Direction.DOWN) {
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height;
        } else if (direction == Direction.LEFT) {
            ar.x = cb.x - arSize;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        } else if (direction == Direction.RIGHT) {
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

    public void die() {

        System.out.println("You Lose");
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getXOffset()), (int) (y - handler.getGameCamera().getYOffset()), width, height, null);

//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getXOffset()), (int) (y + bounds.y - handler.getGameCamera().getYOffset()), bounds.width, bounds.height);
    }

    private BufferedImage getCurrentAnimationFrame() {
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
                    return Assets.playerStillUp;
                case LEFT:
                    return Assets.playerStillLeft;
                case RIGHT:
                    return Assets.playerStillRight;
                default:
                    return Assets.playerStillDown;
            }
        }
    }


}
