package hr.fer.croapps;

public class Main {
    public static void main(String[] args) {
        ShortAnswerQuestion question1 = new ShortAnswerQuestion(
                "What is the Android programming language?", "Java");
        ShortAnswerQuestion question2 = new ShortAnswerQuestion(
                "What is the iPhone programming language?", "Objective-C");

        System.out.println(question1.getText());
        System.out.print("objective-c: " +
                question1.isCorrectAnswer("objective-c"));
        System.out.println(" java: " + question1.isCorrectAnswer("java"));

        System.out.println(question2.getText());
        System.out.print("objective-c: " +
                question2.isCorrectAnswer("objective-c"));
        System.out.println(" java: " + question2.isCorrectAnswer("java"));
    }
}
