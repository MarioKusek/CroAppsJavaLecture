package hr.fer.croapps;

public abstract class AbstractQuestion implements Question {
    private String text;

    public AbstractQuestion(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract boolean isCorrectAnswer(String answer);
}
