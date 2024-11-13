public class Room {
    Monster monster;
    Enigma enigma;
    Player player;

    public Room(Monster monster, Enigma enigma, Player player) {
        this.monster = monster;
        this.enigma = enigma;
        this.player = player;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Enigma getEnigma() {
        return enigma;
    }

    public void setEnigma(Enigma enigma) {
        this.enigma = enigma;
    }

    public void printDescription() {
        if (enigma != null && monster != null) {
            System.out.println("This room contains " + monster.getClass().getSimpleName() + " and enigma " + enigma.getQuestion());
        } else if (enigma != null) {
            System.out.println("This room contains " + enigma.getClass());
        } else if (monster != null) {
            System.out.println("This room contains " + monster.getClass().getSimpleName());
        } else {
            System.out.println("This room is empty");
        }
    }

    public void printInstruction() {
        if (enigma != null && monster != null) {
            System.out.println("You have to defeat " + monster.getClass().getSimpleName() + " and solve the enigma ");
        } else if (enigma != null) {
            System.out.println("You have to solve " + enigma.getClass());
        } else if (monster != null) {
            System.out.println("You have to defeat " + monster.getClass().getSimpleName());
        } else {
            System.out.println("This room is empty");
        }
    }

    public void end(Player player) {
        if (monster.isDead && enigma.isSolved) {
            System.out.println("The room has been successfully cleared");
            player.setHp(100);
        }
    }
}
