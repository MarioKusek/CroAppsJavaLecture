package hr.fer.croapps;

public class Main {
    public static void main(String[] args) {
        ShortAnswerQuestion question = new ShortAnswerQuestion(
                "What is the Android programming language?", "Java");

        System.out.println(question.getText());

        System.out.println("CC: " + question.isCorrectAnswer("C"));
        System.out.println("java: " + question.isCorrectAnswer("java"));
    }
}
