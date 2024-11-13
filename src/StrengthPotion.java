public class StrengthPotion implements Item {
    static boolean isUsed = false;

    @Override
    public String name() {
        return "StrengthPotion";
    }

    @Override
    public void effect(Player player) {
        if (!isUsed) {
            player.setAd(player.getAd() + 10);
            player.getInventory().remove(this);
            isUsed = true;
            System.out.println("You have used Strength Potion, your ad is increased by 10");
        } else {
            System.out.println("Strength Potion has already been used");
        }
    }
}
