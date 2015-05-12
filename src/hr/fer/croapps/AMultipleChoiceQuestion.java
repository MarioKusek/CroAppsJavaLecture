package hr.fer.croapps;

public class AMultipleChoiceQuestion extends AbstractQuestion {
    private String[] correctAnswers;

    public AMultipleChoiceQuestion(String text, String[] correctAnswers) {
        super(text);
        this.correctAnswers = correctAnswers;
    }

    public boolean isCorrectAnswer(String answer) {
        for (int i = 0; i <
                correctAnswers.length; i++) {
            if(correctAnswers[i].equalsIgnoreCase(answer))
                return true;
        }
        return false;
    }
}
