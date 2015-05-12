package hr.fer.croapps;

public class MainException {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        populateQuiz(quiz);
        System.out.println("Quiz is ready.");
    }

    private static void populateQuiz(Quiz quiz) {
        for (int i = 0; i < 15; i++) {
            quiz.addQuestion("text"+i, "answer"+i);
        }
    }

}
