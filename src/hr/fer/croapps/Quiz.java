package hr.fer.croapps;

public class Quiz {
    public static final int MAX_NUMBER_OF_QUESTIONS = 10;
    private String name;
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[10];
    private int noOfQuestions = 0;

    public Quiz() {
        name = "Initial Quiz";
    }

    public Quiz(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuestion(String text, String answer) {
        if(noOfQuestions == MAX_NUMBER_OF_QUESTIONS)
            throw new IllegalStateException("Quiz has maximal number of questions.");

        questions[noOfQuestions] = new ShortAnswerQuestion(text, answer);
        noOfQuestions++;

        //TODO max number of questions
    }

    public void addQuestion(ShortAnswerQuestion question) {
        if(noOfQuestions == MAX_NUMBER_OF_QUESTIONS)
            throw new IllegalStateException("Quiz has maximal number of questions.");

        questions[noOfQuestions] = question;
        noOfQuestions++;

        //TODO max number of questions
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    public String getQuestion(int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer(int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }
}
