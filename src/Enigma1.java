public class Enigma1 extends Enigma {
    public Enigma1(String question, String correctAnswer) {
        super("Guess the word", "pivo");
    }

    public void enigma() {
        System.out.println("Question is " + getQuestion());

        if (this.checkAnswer("pivo")) {
            System.out.println("Congratulations, the question has been solved");
        } else {
            System.out.println("Wrong answer,try again");
        }
    }

    @Override
    public String toString() {
        return question;
    }
}