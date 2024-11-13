import java.util.ArrayList;
import java.util.List;

public class Troll extends Monster {
    LongSword longSword = new LongSword();

    public Troll() {
        super(250, 5);
    }

    @Override
    public List<Item> getLoot() {
        List<Item> loot = new ArrayList<>();
        loot.add(longSword);
        return loot;
    }
}
