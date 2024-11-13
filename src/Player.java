import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Item> inventory = new ArrayList<>();
    private int hp = 100;
    private int ad = 20;
    public boolean isDead = false;

    public void dealDamage(Monster monster) {
        monster.takeDamage(this.ad);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return this.ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", ad=" + ad +
                ", inventory=" + inventory +
                '}';
    }
    public void isDead() {
        if (this.hp <= 0) {
            System.out.println("You died");
            this.isDead = true;
            }
        System.exit(0);
        }
    }

