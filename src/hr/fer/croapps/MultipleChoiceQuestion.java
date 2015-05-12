package hr.fer.croapps;

public class MultipleChoiceQuestion {
    private String text;
    private String correctAnswer1;
    private String correctAnswer2;

    public MultipleChoiceQuestion(String text, String correctAnswer1, String correctAnswer2) {
        this.text = text;
        this.correctAnswer1 = correctAnswer1;
        this.correctAnswer2 = correctAnswer2;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer1.equalsIgnoreCase(answer) ||
                correctAnswer2.equalsIgnoreCase(answer);
    }
}
