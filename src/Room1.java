public class Room1 extends Room {

    public Room1() {
        super(new Goblin(), new Enigma1("Guess the word", "pivo"), new Player());

    }

    public void welcome() {
        System.out.println("Welcome to the first room");
    }

    @Override
    public void printDescription() {
        super.printDescription();
    }

    @Override
    public void printInstruction() {
        super.printInstruction();
    }

    @Override
    public Monster getMonster() {
        return super.getMonster();
    }

    @Override
    public Enigma getEnigma() {
        return super.getEnigma();
    }
}
