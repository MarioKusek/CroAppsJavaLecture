package hr.fer.croapps;

public class AShortAnswerQuestion extends AbstractQuestion {
    private String correctAnswer;

    public AShortAnswerQuestion(String text, String correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
