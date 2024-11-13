public class LongSword implements Item {
    boolean isUsed = false;

    @Override
    public String name() {
        return "LongSword";
    }

    @Override
    public void effect(Player player) {
        if (!isUsed) {
            player.setAd(player.getAd() + 20);
            isUsed = true;
            System.out.println("Long sword has been equipped, your ad is increased by 20");
        } else {
            System.out.println("Long sword has already been equipped");
        }
    }
}
