public class HealthPotion implements Item {
    @Override
    public String name() {
        return "HealthPotion";
    }

    @Override
    public void effect(Player player) {
        if (player.getHp() < 80) {
            player.setHp(player.getHp() + 20);
        } else {
            player.setHp(100);
        }
        player.getInventory().remove(this);
        System.out.println("You have used Health Potion, your current hp is " + player.getHp());
    }
}
