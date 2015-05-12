package hr.fer.croapps;

public class MainException {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        try {
            populateQuiz(quiz);
        } catch (IllegalStateException e) {
            //e.printStackTrace();
            System.out.println("Exception caught.");
        }

        System.out.println("Quiz is ready.");
    }

    private static void populateQuiz(Quiz quiz) {
        for (int i = 0; i < 15; i++) {
            quiz.addQuestion("text"+i, "answer"+i);
        }
    }

}
