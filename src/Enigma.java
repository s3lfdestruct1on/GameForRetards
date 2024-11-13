public abstract class Enigma {
    String question;
    String correctAnswer;
    boolean isSolved = false;

    public Enigma(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public boolean checkAnswer(String answer) {
        if (!isSolved && correctAnswer.equalsIgnoreCase(answer)) {
            isSolved = true;
            return true;
        } else {
            return false;
        }
    }
}
