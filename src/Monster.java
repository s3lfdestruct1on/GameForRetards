import java.util.List;

public abstract class Monster {
    public int hp;
    public boolean isDead = false;
    public int ad;

    public Monster(int hp, int ad) {
        this.hp = hp;
        this.ad = ad;
    }

    public void dealDamage(Player player) {
        player.takeDamage(this.ad);
    }
    public void takeDamage(int damage) {
        this.hp -= damage;
        if(this.hp <= 0){
            isDead = true;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getAd() {
        return ad;
    }

    public abstract List<Item> getLoot();

    public boolean checkIfDead() {
        return isDead;
    }

    public void death(Player player) {
        if (isDead) {
            System.out.println("Monster has been slain");
            for (Item item : getLoot()) {
                player.getInventory().add(item);
            }
        }
    }
}
