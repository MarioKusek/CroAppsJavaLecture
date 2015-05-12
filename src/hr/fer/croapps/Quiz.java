package hr.fer.croapps;

public class Quiz {
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
        questions[noOfQuestions] = new ShortAnswerQuestion(text, answer);
        noOfQuestions++;

        //TODO max number of questions
    }

    public void addQuestion(ShortAnswerQuestion question) {
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
