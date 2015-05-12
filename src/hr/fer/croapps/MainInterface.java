package hr.fer.croapps;

public class MainInterface {
    public static void main(String[] args) {
        Question question1 = new IShortAnswerQuestion("question1", "o1");
        Question question2 = new IMultipleChoiceQuestion("question2", "o1", "o2");

        System.out.println("SAQ");
        useQuestion(question1);

        System.out.println("MCQ");
        useQuestion(question2);
    }

    private static void useQuestion(Question question) {
        System.out.println("Question: " + question.getText());

        System.out.println("o1: " + question.isCorrectAnswer("o1"));
        System.out.println("o2: " + question.isCorrectAnswer("o2"));
    }
}
