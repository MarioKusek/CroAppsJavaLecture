package hr.fer.croapps;

/**
 * Created by mario on 10.5.2015..
 */
public class MainEquals {
    public static void main(String[] args) {
        Question question1 = new AShortAnswerQuestion(
                "What is the Android programming language?", "Java");
        Question question2 = new AShortAnswerQuestion (
                "What is the Android programming language?", "Java");

        if (question1.equals(question2))
            System.out.println("Questions are equal");
        else
            System.out.println("Questions are different");
    }
}
