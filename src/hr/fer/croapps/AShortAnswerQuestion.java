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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof AShortAnswerQuestion))
            return false;
        AShortAnswerQuestion other = (AShortAnswerQuestion) obj;
        if (correctAnswer == null) {
            if (other.correctAnswer != null)
                return false;
        } else if (!correctAnswer.equals(other.correctAnswer))
            return false;
        return true;
    }
}
