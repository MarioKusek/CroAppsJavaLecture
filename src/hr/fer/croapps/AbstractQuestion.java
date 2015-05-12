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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof AbstractQuestion))
            return false;

        AbstractQuestion other = (AbstractQuestion) obj;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        return true;
    }
}
