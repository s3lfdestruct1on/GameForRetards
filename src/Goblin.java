import java.util.ArrayList;
import java.util.List;

public class Goblin extends Monster {
    HealthPotion healthPotion = new HealthPotion();
    StrengthPotion strengthPotion = new StrengthPotion();

    public Goblin() {
        super(50, 10);
    }

    @Override
    public List<Item> getLoot() {
        List<Item> loot = new ArrayList<>();
        loot.add(healthPotion);
        loot.add(strengthPotion);
        return loot;
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "hp=" + hp +
                ", ad=" + ad +
                '}';
    }
}
