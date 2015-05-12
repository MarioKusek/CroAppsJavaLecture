package hr.fer.croapps;

public class IShortAnswerQuestion implements Question {
    private String text;
    private String correctAnswer;

    public IShortAnswerQuestion(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
